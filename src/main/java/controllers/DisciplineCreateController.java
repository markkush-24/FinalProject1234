package controllers;

import database.DBSManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "DisciplineCreateController", urlPatterns = "/discipline-create")
public class DisciplineCreateController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("isCreate", "1");
        req.setAttribute("currentPage", "discipline-create.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String disc = req.getParameter("newDisc");
        if (disc==null || disc.equals("")){
            req.setAttribute("message","1");
            req.setAttribute("isCreate", "1");
            req.setAttribute("currentPage", "discipline-create.jsp");
            req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req, resp);
            return;
        }
        DBSManager.createNewDisc(disc);
        resp.sendRedirect("/disciplines");
    }
}