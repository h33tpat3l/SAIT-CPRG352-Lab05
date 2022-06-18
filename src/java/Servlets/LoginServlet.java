/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Models.User;
import Services.AccountService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author heetk
 */
public class LoginServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String redirectionPath = "/WEB-INF/login.jsp";
        if(request.getParameter("logout") != null && request.getSession().getAttribute("UserName") != null) {
            request.setAttribute("message", request.getSession().getAttribute("UserName") + " has been successfully logged out!");
            session.invalidate();
        } else if(session.getAttribute("UserName") != null) {
            response.sendRedirect("home");
            return;
        }
        getServletContext().getRequestDispatcher(redirectionPath).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        if(userName.equals("") || password.equals("")) {
           request.setAttribute("message", "Please enter Name and Passowrd!");
           getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response); 
        }
        AccountService accountService = new AccountService();
        String redirectionPath = "/WEB-INF/login.jsp";
        User user = accountService.login(userName, password);
        if(user != null) {
            request.getSession().setAttribute("UserName", user.getUserName());
            redirectionPath = "/WEB-INF/home.jsp";
        } else {
            request.setAttribute("message", "User Not Found!");
        }
        getServletContext().getRequestDispatcher(redirectionPath).forward(request, response);
    }

}
