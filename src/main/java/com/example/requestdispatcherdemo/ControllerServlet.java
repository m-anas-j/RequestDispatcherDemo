package com.example.requestdispatcherdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ControllerServlet", value = "/ControllerServlet")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String choice = request.getParameter("choice");
        PrintWriter out = response.getWriter();
        out.println("Yay");

        RequestDispatcher rd1 =
                getServletContext().getRequestDispatcher(
                        "/AdditionServlet");
        RequestDispatcher rd2 = request.getRequestDispatcher(
                "SubtractionServlet");

        if (choice.equalsIgnoreCase("add"))
        {
            rd1.forward(request, response);
        }
        else
            rd2.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
