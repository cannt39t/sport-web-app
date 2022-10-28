package com.sport.net.servlet;

import com.sport.net.service.TrainingService;
import com.sport.net.service.impl.TrainingServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;


@WebServlet(name = "search", urlPatterns = "/search")
public class SearchServlet extends HttpServlet {

    TrainingService trainingService = new TrainingServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("search.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String search = req.getParameter("Search");
        req.setAttribute("trainings", trainingService.getAll().stream().filter( (t) -> t.getName().toLowerCase().contains(search.toLowerCase())).collect(Collectors.toList()));
        req.getRequestDispatcher("trainings.ftl").forward(req, resp);
    }

}
