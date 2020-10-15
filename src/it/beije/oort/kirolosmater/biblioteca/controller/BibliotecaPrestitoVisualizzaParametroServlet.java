package it.beije.oort.kirolosmater.biblioteca.controller;

import static it.beije.oort.kirolosmater.biblioteca.MetodiPrestito.readRecordByStringFromInput;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.beije.oort.kirolosmater.biblioteca.model.Prestito;

/**
 * Servlet implementation class BibliotecaPrestitoVisualizzaParametroServlet
 */
@WebServlet("/biblioteca/view/BibliotecaPrestitoVisualizzaParametroServlet")
public class BibliotecaPrestitoVisualizzaParametroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BibliotecaPrestitoVisualizzaParametroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String parametro = request.getParameter("parametro");
		String stringa = request.getParameter("stringa");
		System.out.println(parametro);
		System.out.println(stringa);
		List<Prestito> prestiti = readRecordByStringFromInput(parametro, stringa);
		HttpSession session = request.getSession();
		session.setAttribute("prestiti", prestiti);
		response.sendRedirect("visualizzaPrestitoParametro.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}