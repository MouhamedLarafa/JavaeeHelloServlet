package net.codejava.javaee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", value = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    //@Override
   // protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    //}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String yourName = request.getParameter("yourName");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello " + yourName + "</h1>");
        writer.close();
    }
}
