package com.sport.net.servlet;

import com.sport.net.service.ContactService;
import com.sport.net.service.impl.ContactServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;


@WebServlet(name = "ajax", urlPatterns = "/ajax")
public class AjaxRandomServlet extends HttpServlet {

    ContactService contactService = new ContactServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");
        String [] namesArr={"Nadjyn","Chonguk","Chingachkyk","Goiko","Mitch","Djin","Uingi"};
        Random r = new Random();
        String randomName = namesArr[r.nextInt(namesArr.length)];

        resp.getWriter().write(String.format("You are " + randomName));
    }

}
