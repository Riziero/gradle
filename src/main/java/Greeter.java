import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/greet" })
public class Greeter extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("name");
    if (name == null) {
      name = "World";
    }

    resp.setStatus(200);
    resp.setHeader("Content-Type", "text/plain");
    resp.getWriter().println(greeting(name));
  }

  public static String greeting(String name) {
    return "Hello " + name;
  }

}
