package com.sport.net.servlet;

import com.sport.net.model.Contact;
import com.sport.net.service.ContactService;
import com.sport.net.service.impl.ContactServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "contact", urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {

    ContactService contactService = new ContactServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("contact.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String country = req.getParameter("country");
        String subject = req.getParameter("subject");
        contactService.add(new Contact(firstname, lastname, country, subject));
        req.getRequestDispatcher("home.ftl").forward(req, resp);
    }

}
