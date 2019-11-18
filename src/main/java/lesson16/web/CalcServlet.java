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

  private Optional<String> converts(String param) {
    return Optional.ofNullable(param);
  }

  private Optional<Integer> divide(int x, int y) {
    if (y==0) return Optional.empty();
    return Optional.of(x/y);
  }

  private Optional<Integer> do_op(String p1, String p2, String op) {
    Optional<Integer> p1o = convert(p1);
    Optional<Integer> p2o = convert(p2);
    Optional<String> oo = converts(op);
    return oo.flatMap(o -> p1o.flatMap(i1 -> p2o.flatMap(i2 -> {
      switch (o) {
        case "plus": return Optional.of(i1 + i2);
        case "minus": return Optional.of(i1 - i2);
        case "mult": return Optional.of(i1 * i2);
        case "divide": return divide(i1, i2);
      }
      return Optional.empty();
    })));
  }

  private String calc(String p1, String p2, String op) {
    Optional<Integer> result = do_op(p1, p2, op);
    return result.map(String::valueOf).orElse("Smth went wrong");
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
