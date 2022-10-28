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

@WebServlet(name = "trainings", urlPatterns = "/trainings")
public class MainServlet extends HttpServlet {

    TrainingService trainingService = new TrainingServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        trainingService.getAll().forEach(System.out::println);
        req.setAttribute("trainings", trainingService.getAll());
        req.getRequestDispatcher("trainings.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        trainingService.getAll().forEach(System.out::println);
        String genreFilter = req.getParameter("genreFilter");
        if (!genreFilter.equals("All")){
            req.setAttribute("trainings", trainingService.getAll().stream().filter( (t) -> t.getComplexity().equals(genreFilter)).collect(Collectors.toList()));
        } else {
            req.setAttribute("trainings", trainingService.getAll());
        }
        req.getRequestDispatcher("trainings.ftl").forward(req, resp);
    }
}
