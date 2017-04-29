<%-- 
    Document   : listar_usuarios
    Created on : 22/04/2017, 19:07:51
    Author     : Antônio Carlos
--%>

<%@page import="modelo.Usuario"%>
<%@page import="modelo.UsuarioDAO"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Lista de Clientes</title>
    </head>
    <%@page import="modelo.Cliente"%>
    <%@page import="modelo.ClienteDAO"%>
    <body>
        <!------------------------------------- INPUTS ------------------------------------->
        <form action="gerenciar_perfil.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">
                    <div class="container">
                        <h2>Lista de Usuarios</h2>           
                        <table class="table">

                            <tr>
                                <th>MÁTRICULA</th>
                                <th>NOME</th>
                                <th>SENHA</th>
                                <th>PERFIL</th>
                                <th colspan="2">OPÇÕES</th>
                            </tr>


                            <%
                                UsuarioDAO uDAO = new UsuarioDAO();
                                ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
                                usuarios = uDAO.listar();
                                try {
                                    for (Usuario u : usuarios) {
                            %>
                            <tr>
                                <td><%= u.getMatricula()%></td>
                                <td><%= u.getNome()%></td>
                                <td><%= u.getSenha()%></td>
                                <td></td>
                                <td>
                                    <a href="form_altera_usuario.jsp?matricula='<%=u.getMatricula()%>'">Alterar</a>
                                    <a href="#" onclick="excluir(<%=u.getMatricula()%>, '<%=u.getNome()%>')">Excluir</a>
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

