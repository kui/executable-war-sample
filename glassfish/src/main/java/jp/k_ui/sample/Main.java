package jp.k_ui.sample;

import java.net.URL;

import org.glassfish.embeddable.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int port = Integer.parseInt(System.getProperty("port", "8898"));
        URL warLocation = Main.class.getProtectionDomain().getCodeSource()
                .getLocation();

        GlassFishProperties props = new GlassFishProperties();
        props.setPort("http-listener", port);
        GlassFish gf = GlassFishRuntime.bootstrap().newGlassFish(props);
        gf.start();

        Deployer deployer = gf.getDeployer();
        deployer.deploy(warLocation.toURI());

        try {
            // FIXME do not use sleep.
            while (true)
                Thread.sleep(10000000);
        } catch (InterruptedException e) {
            gf.stop();
            gf.dispose();
        }
    }
}
