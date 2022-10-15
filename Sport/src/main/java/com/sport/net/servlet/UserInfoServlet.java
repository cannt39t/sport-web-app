package com.sport.net.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserInfoServlet", value = "/userInfo")

// какого вы пола?
// что  хотите прорабоать (руки, грудь, пресс, ног, все тело)
// какая у вас цель (сбросить вес, нарастить массу, быть в форме)
// какая у вас сейчас форму (стройная, средняя, пышная)
// как вас зовут ?
// сколько вам лет ?
// укажите свой рост
// укажите свой вес ?
// как часто хотите тренироваться ?

public class UserInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
