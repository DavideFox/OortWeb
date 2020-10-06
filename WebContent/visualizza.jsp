<%@ page import="it.beije.oort.gregori.rubrica.db.ReaderDb" %>
<%@ page import="it.beije.oort.rubrica.Contatto" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<!--
	Industrious by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>Rubrica - Visualizzazione contatti</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body class="is-preload">

		<!-- Header -->
			<header id="header">
				<a class="logo" href="home.html">Rubrica</a>
				<nav>
					<a href="#menu">Menu</a>
				</nav>
			</header>

		<!-- Nav -->
		<nav id="menu">
			<ul class="links">
				<li><a href="home.html">Home</a></li>
				<li><a href="inserimento.html">Inserimento</a></li>
				<li><a href="visualizzazione.html">Visualizzazione</a></li>
				<li><a href="modifica.html">Modifica</a></li>
				<li><a href="rimozione.html">Rimozione</a></li>
				<li><a href="ricerca.html">Ricerca</a></li>
				<li><a href="esportazione.html">Esportazione</a></li>
			</ul>
		</nav>

		<!-- Heading -->
			<div id="heading" >
				<h1>Visualizzazione</h1>
			</div>

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="inner">
					<div class="content">
						<h3>Contatti</h3>
						<div class="table-wrapper">
							<table>
								<thead>
									<tr>
									<th>Nome</th>
									<th>Cognome</th>
									<th>Telefono</th>
									<th>Email</th>
									</tr>
								</thead>
								<tbody>
									<% 
									List<Contatto> contatti = ReaderDb.readContatti(); 
									for(Contatto contatto : contatti) {
									%>
									
									<tr>
									<td><%= contatto.getNome() %></td>
									<td><%= contatto.getCognome() %></td>
									<td><%= contatto.getTelefono() %></td>
									<td><%= contatto.getEmail() %></td>
									
									<% } %>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</section>

		<!-- Footer -->
			<footer id="footer">
				<div class="inner">
					<div class="copyright">
						&copy; Luca Gregori.
					</div>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>