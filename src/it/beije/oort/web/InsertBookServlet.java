package it.beije.oort.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.beije.oort.web.db.Autore;
import it.beije.oort.web.db.Editore;
import it.beije.oort.web.db.JPDBUtilities;

/**
 * Servlet implementation class InsertBookServlet
 */
@WebServlet("/InsertBook")
public class InsertBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("mostra") != null && request.getParameter("mostra").equals("1")) {
			List<Autore> authors = JPDBUtilities.exportAuthors();
			List<Editore> publishers = JPDBUtilities.exportPublishers();
			request.getSession().setAttribute("autori", authors);
			request.getSession().setAttribute("editori", publishers);
			request.getSession().setAttribute("mostra", true);
		} else {
			request.getSession().setAttribute("mostra", false);
		}
		response.sendRedirect("registra_libro.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String titolo = (String) request.getParameter("titolo");
		int id_autore = Integer.parseInt((String) request.getParameter("id_autore"));
		int id_editore = Integer.parseInt((String) request.getParameter("id_editore"));
		String descrizione = (String) request.getParameter("descrizione");
		int anno = Integer.parseInt((String) request.getParameter("anno"));
		JPDBUtilities.insertBook(titolo, descrizione, id_autore, id_editore, anno);
		response.sendRedirect("admin_biblio_homepage.jsp");
	} 
}
