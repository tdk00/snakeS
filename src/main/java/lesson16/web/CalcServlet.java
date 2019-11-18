package lesson16.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcServlet extends HttpServlet {

  private String calc(String p1, String p2, String op) {
    return "";
  }

  @Override
  protected void doGet(HttpServletRequest req,
                       HttpServletResponse resp) throws ServletException, IOException {

    PrintWriter writer = resp.getWriter();
    writer.printf("Calculator:%s", calc(
        req.getParameter("x"),
        req.getParameter("y"),
        req.getParameter("op")
    ));
    writer.close();
  }
}
