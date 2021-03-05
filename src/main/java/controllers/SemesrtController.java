package controllers;

import database.DBSManager;
import entity.Discipline;
import entity.Semestr;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet(name = "SemesrtController", urlPatterns = "/semestr")
public class SemesrtController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Semestr> semestrs = DBSManager.getAllActiveSemestr();
        Semestr selectedSemestr = semestrs.get(0);
        ArrayList<Discipline> disciplines = DBSManager.getDisciplinesBySemestrs(selectedSemestr.getId());

        req.setAttribute("semestrs",semestrs);
        req.setAttribute("disciplines",disciplines);

        req.setAttribute("currentPage", "semestr.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req, resp);


        String ids = req.getParameter("selectSemestrDiscHidden");
        System.out.println(ids);

    }
}
