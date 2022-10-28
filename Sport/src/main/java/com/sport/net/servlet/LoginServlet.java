package com.sport.net.servlet;

import com.sport.net.model.User;
import com.sport.net.service.UserService;
import com.sport.net.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private final static UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("login.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("_login_or_email");
        String password = req.getParameter("_password");
        String _remember_me = req.getParameter("_remember_me");
        User user = new User(login, login, password);
        Optional<Boolean> res  = userService.login(user);
        try {
            boolean unwrap_res = res.get();
            if (unwrap_res) {
                HttpSession httpSession = req.getSession();
                httpSession.setAttribute("user", userService.getUser(user));
                System.out.println(userService.getUser(user));
                httpSession.setMaxInactiveInterval(60 * 60);
                if (_remember_me != null) {
                    Cookie httpCookie = new Cookie("username", login);
                    httpCookie.setMaxAge(24 * 60 * 60);
                    resp.addCookie(httpCookie);
                }
                resp.sendRedirect("/home");
            }
        } catch (NullPointerException e){
            resp.sendRedirect("/exception");
        }
    }
}
