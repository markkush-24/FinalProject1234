package controllers;

import database.DBSManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "StudentCreateController", urlPatterns = "/student-create")
public class StudentCreateController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("isCreateStud", "1");
        req.setAttribute("currentPage", "student-create.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sSername = req.getParameter("sSername");
        String sName = req.getParameter("sName");
        String sGroup = req.getParameter("sGroup");
        String sDate = req.getParameter("sDate");

        DBSManager.addNewStudent(sSername,sName,sGroup,sDate);
        resp.sendRedirect("/all-students");
    }
}
