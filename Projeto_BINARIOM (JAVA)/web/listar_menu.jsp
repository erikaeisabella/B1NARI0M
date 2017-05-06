<%-- 
    Document   : listar_menu
    Created on : 22/04/2017, 18:43:11
    Author     : Antônio Carlos
--%>

<%@page import="modelo.Menu"%>
<%@page import="modelo.MenuDAO"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Lista de Menu</title>
    </head>
    <body>
        <!------------------------------------- INPUTS ------------------------------------->
        <form action="gerenciar_menu.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">
                    <div class="container">
                        <h2>Lista de Menu</h2>           
                        <table class="table">

                            <tr>
                                <th>ID</th>
                                <th>NOME</th>
                                <th>LINK</th>
                                <th>PERFIL</th>
                                <th colspan="2">OPÇÕES</th>
                            </tr>


                            <%
                                MenuDAO mDAO = new MenuDAO();
                                ArrayList<Menu> menus = new ArrayList<Menu>();
                                Menu menu = new Menu();
                                try {
                                    for (Menu m : menu.listar()) {
                            %>
                            <tr>
                                <td><%= m.getId()%></td>
                                <td><%= m.getNome()%></td>
                                <td><%= m.getLink()%></td>
                                <td><%= m.getPerfil().getNome() %></td>
                                <td>
                                    <a href="form_altera_menu.jsp?id=<%=m.getId()%>">Alterar</a>
                                    <a href="gerenciar_menu.do?op=excluir&id=<%=m.getId()%>">Excluir</a>
                                </td>
                            </tr>

                            <%
                                    }
                                } catch (Exception e) {
                                    out.print("ERRO:" + e);
                                }
                            %>
                        </table>	
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>

