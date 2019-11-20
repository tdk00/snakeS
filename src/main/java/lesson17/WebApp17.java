package lesson17;

import lesson17.service.Auth;
import lesson17.service.AuthService;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class WebApp17 {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8082);
    ServletContextHandler handler = new ServletContextHandler();
/**
 * http://localhost:8082/static/img/total.png
 * http://localhost:8082/static/index.html
 * /static/img/total.png
 */
    handler.addServlet(ServletFile.class, "/static/*");
    Auth authService = new AuthService();
    handler.addServlet(new ServletHolder(new LoginServlet(authService)), "/login/*");

    handler.addServlet(new ServletHolder(new ServletRedirect("/extra2/*")), "/extra/*");
    handler.addServlet(new ServletHolder(new ServletRedirect("/login")), "/*");

    server.setHandler(handler);
    server.start();
    server.join();
  }
}
