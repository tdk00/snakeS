package lesson16.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req,
                       HttpServletResponse resp) throws ServletException, IOException {
    String x = req.getParameter("x");
    String y = req.getParameter("y");

    PrintWriter writer = resp.getWriter();
    writer.printf("CalcServlet.GET x=%s y=%s", x, y);
    writer.close();
  }
}
