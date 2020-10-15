package it.beije.oort.kirolosmater.biblioteca.controller;
import static it.beije.oort.kirolosmater.biblioteca.MetodiAutore.*;
import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.beije.oort.kirolosmater.biblioteca.model.Autore;

/**
 * Servlet implementation class BibliotecaAutoreModificaServlet
 */
@WebServlet("/biblioteca/view/BibliotecaAutoreModificaServlet")
public class BibliotecaAutoreModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BibliotecaAutoreModificaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		int id = Integer.parseInt(request.getParameter("id"));
		String parametro = request.getParameter("parametro");
		String valore = request.getParameter("valore");
		Autore autore = modificaAutore(id, parametro, valore);
		String nome = autore.getNome();
		String cognome = autore.getCognome();
		LocalDate data_nascita = autore.getData_nascita();
		LocalDate data_morte = autore.getData_morte();
		String biografia = autore.getBiografia();
		session.setAttribute("nome", nome);
		session.setAttribute("cognome", cognome);
		session.setAttribute("data_nascita", data_nascita);
		session.setAttribute("data_morte", data_morte);
		session.setAttribute("biografia", biografia);
		response.sendRedirect("modificaAutore.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}