package com.example.requestdispatcherdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AdditionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("number1"));
        double num2 = Double.parseDouble(request.getParameter("number2"));
        double sum = num1 + num2;

        PrintWriter out = response.getWriter();
        out.println("<h1>Your result is: " + sum + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
