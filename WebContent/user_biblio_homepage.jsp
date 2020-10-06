<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER HOMEPAGE</title>
 <style>
        table {
          font-family: arial, sans-serif;
          border-collapse: collapse;
          width: 100%;
        }
        
        td, th {
          border: 1px solid #dddddd;
          text-align: left;
          padding: 8px;
        }
        
        tr:nth-child(even) {
          background-color: #dddddd;
        }
        </style>
</head>
<body>
<jsp:useBean id="loggedUser" class="it.beije.oort.web.db.User" scope="session"/>
<% String statoPrestito = (String)session.getAttribute("statoPrestito");
	if (statoPrestito != null && statoPrestito.length() > 0) {
	out.print("<b>"+statoPrestito+"</b><br/>");
	session.removeAttribute("statoPrestito");
}%>
	 <table>
          <tr>
            <th>BENVENUTO <jsp:getProperty property="nome" name="loggedUser"/> </th>
          </tr>
          <tr>
            <td><a href = "visualizzaPrestiti.jsp">Visualizza i tuoi prestiti</a></td>
          </tr>
          <tr>
            <td><a href = "nuovoPrestito.jsp" >Prendi in prestito un nuovo libro</a></td>
          </tr>
           <tr>
            <td><a href = "login_biblioteca.jsp">Esci</a></td>
          </tr>
        </table>
</body>
</html>