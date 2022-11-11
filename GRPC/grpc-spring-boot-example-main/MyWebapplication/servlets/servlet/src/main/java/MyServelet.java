import jdk.nashorn.internal.objects.annotations.Optimistic;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServelet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
       PrintWriter out= res.getWriter();
        out.print("<h1> Welcome to Servlets </h1>");
    }

}
