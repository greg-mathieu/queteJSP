package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/hello-form", "/custom-hello"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String hour = request.getParameter("hour");

        int time = Integer.parseInt(hour);
        if (time < 6 && time >= 0) {
            hour = "Good Night";
        }
        if (time >= 6 && time < 12) {
            hour = "Good Morning";
        }
        if (time >= 12 && time < 19) {
            hour = "Good Afternoon";
        }
        if (time > 19 && time <= 24) {
            hour = "Good Evening";
        }

        String message = hour + " " + firstname + " " + lastname;
        request.setAttribute("message", message);
        this.getServletContext().getRequestDispatcher("/custom-hello.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
