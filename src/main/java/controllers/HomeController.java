package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

    @WebServlet(name = "HomeController",urlPatterns = "/home")
    public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie [] cookies = req.getCookies();
        Cookie counter = getCookieByName(cookies,"counter");
        String value = counter.getValue();
        int count = Integer.parseInt(value);
        counter.setValue((count + 1) + "");
        resp.addCookie(counter);

        req.setAttribute("currentPage", "home.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req, resp);
    }
    private Cookie getCookieByName(Cookie[] cookies,String name){
        if (cookies != null){for (Cookie c:cookies) {
            if (c.getName().equals(name)){
                return c;
            }
        }
    }
        Cookie cookie = new Cookie("counter","0");
            return cookie;
    }

}