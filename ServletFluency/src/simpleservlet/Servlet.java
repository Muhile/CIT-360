package simpleservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sandwich = request.getParameter("sandwich");
        String fries = request.getParameter("fries");
        String drink = request.getParameter("drink");
        String name = request.getParameter("name");

            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<html><head><style>div{border-radius:5px;background-color:#f2f2f2;padding:20px;}</style></head><body>");
            out.println("<h3>Thank You For Your Order</h3>");
            out.println("<p>Your oder will be out shortly " + name + "</p>");
            out.println("<div><p>Sandwich: " + sandwich + "</p>");
            out.println("<p>Fries: " + fries + "</p>");
            out.println("<p>Drink: " + drink + "</p></div>");
            out.println("<button onclick=\"goBack()\">Order again</button><script>function goBack(){window.history.back();}</script>");
            out.println("</body></html>");

    }
    // Displayed when servlet is accessed directly
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head><style>div{border-radius:5px;background-color:#f2f2f2;padding:20px;}</style></head><body>");
        out.println("<h3>Something went wrong</h3>");
        out.println("<div><p>This resource is not available directly.</p></div>");
        out.println("<button onclick=\"goBack()\">Go Back</button><script>function goBack(){window.history.back();}</script>");
        out.println("</body></html>");
    }
}
