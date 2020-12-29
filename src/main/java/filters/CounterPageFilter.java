package filters;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CounterPageFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse resp = (HttpServletResponse)servletResponse;

        Cookie[] cookies = req.getCookies();
        Cookie counter = getCookieByName(cookies,"counter");
        String value = counter.getValue();
        int count = Integer.parseInt(value);
        counter.setValue((count + 1) + "");
        resp.addCookie(counter);

        filterChain.doFilter(req,resp);

    }

    @Override
    public void destroy() {

    }
    private Cookie getCookieByName(Cookie[] cookies, String name){
        if (cookies!=null){
            for (Cookie c: cookies){
                if (c.getName().equals(name)){
                    return c;
                }
            }

        }
        Cookie cookie = new Cookie("counter","0");
        return cookie;
    }
}


