<!DOCTYPE HTML>
<!--
	Industrious by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>Rubrica - Inserimento contatti</title>
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
				<h1>Inserimento</h1>
			</div>

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="inner">
					<div class="content">
						<!-- Form -->
						<h3>Contatto</h3>
						<form  method="post" action="./Inserimento">
							<div class="row gtr-uniform">
								<!--div class="col-6 col-12-xsmall"-->
								<div class="col-12">
									<input type="text" name="name" id="name" value="" placeholder="Nome" />
								</div>
								<!-- Break -->
								<!--div class="col-6 col-12-xsmall"-->
								<div class="col-12">
									<input type="text" name="surname" id="surname" value="" placeholder="Cognome" />
								</div>
								<!-- Break -->
								<div class="col-12">
									<input type="email" name="email" id="email" value="" placeholder="Email" />
								</div>
								<!-- Break -->
								<!-- Break -->
								<div class="col-2 col-12-xsmall">
									<select name="country-codes" id="country-codes">
										<option value="">- Codice -</option>
										<option value="it">IT +39</option>
										<option value="de">DE +49</option>
										<option value="us">US +1</option>
										<option value="gb">GB +44</option>
										<option value="fr">FR +33</option>
									</select>
								</div>
								<div class="col-10 col-12-xsmall">
									<input type="text" name="phone" id="phone" value="" placeholder="Telefono" />
								</div>
								<div class="col-12">
									<ul class="actions">
										<li><input type="submit" value="Invia" class="primary"/></li>
										<li><input type="reset" value="Cancella" /></li>
									</ul>
								</div>
							</div>
						</form>
						<%
						String nome = (String)session.getAttribute("nome");
						String cognome = (String)session.getAttribute("cognome");
						String telefono = (String)session.getAttribute("telefono");
						String email = (String)session.getAttribute("email");
						%>
						<h3>Contatto inserito</h3>
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
									<tr>
									<td><%= nome %></td>
									<td><%= cognome %></td>
									<td><%= telefono %></td>
									<td><%= email %></td>
									</tr>
								</tbody>			
							</table>
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