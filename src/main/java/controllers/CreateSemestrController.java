package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateSemestrController", urlPatterns = "/create-semestr")
public class CreateSemestrController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("isCreate", "1");
        req.setAttribute("currentPage", "create-semestr.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     String sems = req.getParameter("newSemestr");
        System.out.println(sems);
        resp.sendRedirect("/semestr");

    }
}
