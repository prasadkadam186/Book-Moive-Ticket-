package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.ServicePage;

@WebServlet("/resultlink")
public class Controllerpage extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String moive=req.getParameter("moive");
		int ticket=Integer.parseInt(req.getParameter("ticket"));
		
		ServicePage s1=new ServicePage();
		double bill=s1.getBill(moive, ticket);
		s1.updateticket(moive, ticket);
		
		req.setAttribute("bill",bill);
		req.setAttribute("moive",moive);
		
		RequestDispatcher rd=req.getRequestDispatcher("welcome.jsp");
		rd.include(req, resp);
	}
}
