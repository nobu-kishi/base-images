package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><meta charset='UTF-8'><title>Hello</title></head><body>");
            out.println("<h1>Hello from Servlet</h1>");
            out.println("<p>Context Path: " + req.getContextPath() + "</p>");
            out.println("<p><a href='" + req.getContextPath() + "/'>Back to index.jsp</a></p>");
            out.println("</body></html>");
        }
    }
}

