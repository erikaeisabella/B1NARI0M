<%
//Apenas remove o usuario
session.removeAttribute("usuario");

response.sendRedirect("login.jsp");
%>
