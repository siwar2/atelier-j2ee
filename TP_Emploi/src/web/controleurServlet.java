package web;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import metier.ICourImpl;


public class controleurServlet extends HttpServlet {
	 
	private ICourImpl metier ;
	
	@Override
	public void init() throws ServletException {

		metier=new ICourImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	//req.setAttribute("cours", metier.listcours());
	req.getRequestDispatcher("vues/cours.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	
	


}
