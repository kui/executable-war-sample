package jp.k_ui.sample;

import java.net.URL;
import java.util.Arrays;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {
	public static void main(String[] args) throws Exception {
		int port = Integer.parseInt(System.getProperty("port", "8888"));
		Server server = new Server(port);

		WebAppContext webapp = new WebAppContext();
		URL warLocation = Main.class.getProtectionDomain().getCodeSource()
				.getLocation();
		System.out.println(warLocation);
		System.out.println(Arrays.asList(webapp.getConfigurations()));
		webapp.setWar(warLocation.toExternalForm());
		webapp.setContextPath("/");

		server.setHandler(webapp);
		server.start();
		server.join();
	}
}
