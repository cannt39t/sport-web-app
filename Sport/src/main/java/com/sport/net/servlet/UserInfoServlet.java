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

@WebServlet(name = "userinfo", urlPatterns = "/userinfo")
public class UserInfoServlet extends HttpServlet {

    private final static UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("userinfo.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession httpSession = req.getSession();
        String login = String.valueOf(httpSession.getAttribute("login"));
        String email = String.valueOf(httpSession.getAttribute("email"));
        String gender = req.getParameter("gender");
        String goal = req.getParameter("goal");
        String forma = req.getParameter("forma");
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        int height = Integer.parseInt((req.getParameter("height")));
        int weight = Integer.parseInt((req.getParameter("weight")));
        User userDto = new User( login,  email,  gender,  goal,  forma,  name,  age,  height,  weight);
        userService.updateData(userDto);
        httpSession.setAttribute("user", userDto);
        resp.sendRedirect("home.ftl");
    }
}
