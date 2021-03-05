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
import java.util.ArrayList;


@WebServlet(name = "AllStudentsControlle", urlPatterns = "/all-students")
public class AllStudentsControlle extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Student> students = DBSManager.getAllActiveStudents();
        req.setAttribute("students", students);
        req.setAttribute("currentPage", "all-students.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ids = req.getParameter("deleteStudentHidden");
        System.out.println(ids);
        String[] idstStr = ids.split(",");
        for (String id : idstStr) {
            DBSManager.deleteStudent(id);

        }
        resp.sendRedirect("/all-students");
    }
}