package jp.k_ui.sample;

import java.net.URL;

import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws Exception {
        int port = Integer.parseInt(System.getProperty("port", "8888"));
        URL warLocation = Main.class.getProtectionDomain().getCodeSource()
                .getLocation();

        Tomcat tomcat = new Tomcat();
        tomcat.addWebapp("/", warLocation.getPath());
        tomcat.setPort(port);
        tomcat.start();
        tomcat.getServer().await();
    }
}
