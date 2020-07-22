package simpleservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "formServlet", urlPatterns = {"/formServlet"})
public class formServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String gear = request.getParameter("gear");

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head><style> * { box-sizing: border-box; } input[type=text], select,input[type=email] { width: 100%; padding: 12px 20px; margin: 8px 0; display: inline-block; border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box; resize: vertical; } label { display: inline-block; } input[type=submit] { background-color: #4CAF50; color: white; border: none; border-radius: 4px; padding: 16px 32px; text-align: center; text-decoration: none; display: inline-block; font-size: 16px; margin: 4px 2px; float: right; transition-duration: 0.4s; cursor: pointer; } input[type=submit]:hover { background-color: white; color: black; border: 2px solid #4CAF50; } .container { border-radius: 5px; background-color: #f2f2f2; padding: 20px; } .col-25 { float: left; width: 25%; margin-top: 6px; } .col-75 { float: left; width: 75%; margin-top: 6px; } /* Clear floats after the columns */ .row:after { content: \"\"; display: table; clear: both; } /* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */ @media screen and (max-width: 600px) { .col-25, .col-75, input[type=submit] { width: 100%; margin-top: 0; } } a { background-color: black; border: none; border-radius: 4px; color: white; padding: 16px 32px; text-align: center; text-decoration: none; display: inline-block; font-size: 16px; margin: 4px 2px; transition-duration: 0.4s; cursor: pointer; } a:hover { background-color: white; color: black; border: 2px solid black; } </style></head><body>");
        out.println("<h3>Thank You For Renting with us</h3>");
        out.println("<p>Your rental will be out shortly " + name + "</p>");
        out.println("<div><p>Email: " + email + "</p>");
        out.println("<p>Gear: " + gear + "</p>");
        out.println("<a href=\"list\">Available Gear</a>");
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
