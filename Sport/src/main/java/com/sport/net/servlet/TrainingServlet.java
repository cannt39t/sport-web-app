package com.sport.net.servlet;

import com.sport.net.dto.UserDto;
import com.sport.net.model.Comment;
import com.sport.net.model.Training;
import com.sport.net.model.User;
import com.sport.net.service.CommentService;
import com.sport.net.service.UserService;
import com.sport.net.service.impl.CommentServiceImpl;
import com.sport.net.service.impl.ExerciseServiceImpl;
import com.sport.net.service.impl.TrainingServiceImpl;
import com.sport.net.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TrainingServlet", urlPatterns = "/training")
public class TrainingServlet extends HttpServlet {

    private final static ExerciseServiceImpl exerciseServiceImpl = new ExerciseServiceImpl();
    private final static TrainingServiceImpl trainingService = new TrainingServiceImpl();

    private final static CommentService commentService = new CommentServiceImpl();

    private final static UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        int num = Integer.parseInt(req.getParameter("trainingId"));
        Training training = trainingService.get(num);
        req.setAttribute("training", trainingService.get(num));
        req.setAttribute("exercices", exerciseServiceImpl.getExericsesByIdTraining(num));
        List<Comment> comments = commentService.getAll().stream().filter((c) -> c.getTraining_id() == training.getId()).toList();
        req.setAttribute("com", comments);
        req.getRequestDispatcher("training_info.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)   {
        try {
        int num = Integer.parseInt(req.getParameter("trainingId"));
        System.out.println(num);
        HttpSession httpSession = req.getSession();
        String value = req.getParameter("comment");
        UserDto user = (UserDto) httpSession.getAttribute("user");
        int idUser = 0;
            for (User user1 : userService.getAll()) {
                if(user1.getLogin().equals(user.getLogin())){
                    idUser = user1.getId();
                }
            }
        Comment newComment = new Comment(value, idUser, num);
        commentService.add(newComment);
        doGet(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
