package simpleservlet;

import gearrental.JSON;
import gearrental.Rental;
import gearrental.RentalDAO;

import javax.json.Json;
import javax.servlet.RequestDispatcher;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/")

public class viewServlet extends HttpServlet {

    RentalDAO t = RentalDAO.getInstance();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    // Displayed when servlet is accessed directly
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertUser(request, response);
                    break;
                default:
                    listUser(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        RentalDAO t = RentalDAO.getInstance();


        List<Rental> p = t.getRentalList();
        String json = JSON.carToJSON(p);
        request.setAttribute("listUser", json);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
        dispatcher.forward(request, response);

    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        dispatcher.forward(request, response);
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String gear = request.getParameter("gear");

        RentalDAO t = RentalDAO.getInstance();

        List<Rental> p = t.addRentalDetails(name, email, gear);
        response.sendRedirect("list");
    }

//            System.out.println(t.getRentalList());
//        List <Rental> listUser =  t.getRentalList();
//        request.setAttribute("listUser", listUser);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
//        dispatcher.forward(request, response);
}

