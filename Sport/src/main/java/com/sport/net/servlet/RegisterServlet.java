package com.sport.net.servlet;

import com.sport.net.model.User;
import com.sport.net.service.UserService;
import com.sport.net.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "registerServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    private final static UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("registration.ftl").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String _username = req.getParameter("_username");
        String _email = req.getParameter("_email");
        String _password = req.getParameter("_password");

        User user = new User(_username, _email, _password);
        userService.register(user);

        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("login", _username);
        httpSession.setAttribute("email", _email);
        httpSession.setMaxInactiveInterval(60 * 60);

        resp.sendRedirect("/userinfo");

    }
}
