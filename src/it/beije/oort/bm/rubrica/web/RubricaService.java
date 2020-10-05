package it.beije.oort.bm.rubrica.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import it.beije.oort.bm.rubrica.Contatto;
import it.beije.oort.bm.rubrica.database.Database;
import it.beije.oort.bm.rubrica.database.JPADatabase;


@WebServlet("/displayService")
public class RubricaService extends HttpServlet {
	private static final long serialVersionUID = 2L;
	
	private static Database db = JPADatabase.getDatabase();
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		List<Contatto> results;
		results = db.selectAll();
		session.setAttribute("results", results);
		resp.sendRedirect("bm_index.jsp");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		List<Contatto> results;
		String[] vals = new String[4];
		boolean[] selector = new boolean[4];
		vals[0] = (String) req.getParameter("lname");
		if(vals[0] == null) {
			selector[0] = false;
		}else {
			selector[0] = true;
		}
		vals[1] = (String) req.getParameter("fname");
		if(vals[1] == null) {
			selector[1] = false;
		}else {
			selector[1] = true;
		}
		vals[2] = (String) req.getParameter("phone");
		if(vals[2] == null) {
			selector[2] = false;
		}else {
			selector[2] = true;
		}
		vals[3] = (String) req.getParameter("email");
		if(vals[3] == null) {
			selector[3] = false;
		}else {
			selector[3] = true;
		}
		results = db.select(selector, vals);
		session.setAttribute("results", results);
		resp.sendRedirect("bm_index.jsp");
	}
	
}
