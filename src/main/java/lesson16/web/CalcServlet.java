package lesson16.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

public class CalcServlet extends HttpServlet {

  private Optional<Integer> convert(String param) {
    try {
      return Optional.of(Integer.parseInt(param));
    } catch (Exception ignored) {
      return Optional.empty();
    }
  }

  private Optional<Integer> divide(int x, int y) {
    if (y==0) return Optional.empty();
    return Optional.of(x/y);
  }

  private String calc(String p1, String p2, String op) {
    Optional<Integer> p1o = convert(p1);
    Optional<Integer> p2o = convert(p2);
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
