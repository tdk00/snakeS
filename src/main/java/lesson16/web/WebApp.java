package lesson16.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class WebApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8080);
    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(ServletAssets.class, "/assets/*");
    handler.addServlet(new ServletHolder(new ServletRedirectTo("/login")), "/*");
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
