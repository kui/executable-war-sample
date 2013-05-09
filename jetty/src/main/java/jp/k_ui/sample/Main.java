package jp.k_ui.sample;

import java.net.URL;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {
    public static void main(String[] args) throws Exception {
        int port = Integer.parseInt(System.getProperty("port", "8888"));
        URL warLocation = Main.class.getProtectionDomain().getCodeSource()
                .getLocation();

        WebAppContext webapp = new WebAppContext();
        webapp.setWar(warLocation.toExternalForm());
        webapp.setContextPath("/");

        Server server = new Server(port);
        server.setHandler(webapp);
        server.start();
        server.join();
    }
}
