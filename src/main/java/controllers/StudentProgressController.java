package controllers;

import database.DBSManager;
import entity.Discipline;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentProgressController", urlPatterns = "/student-progress")
public class StudentProgressController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("modifyStudentHidden");
        Student student = DBSManager.getStudentById(id);
        req.setAttribute("student",student);

        req.setAttribute("isCreateStud", "0");
        req.setAttribute("currentPage", "student-create.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sSername = req.getParameter("sSername");
        String sName = req.getParameter("sName");
        String sGroup = req.getParameter("sGroup");
        String sDate = req.getParameter("sDate");
        String id = req.getParameter("idStud");

        DBSManager.ModifyStudent(sSername,sName,sGroup,sDate,id);
        resp.sendRedirect("/all-students");
    }
}
