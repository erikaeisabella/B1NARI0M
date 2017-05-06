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
        <title>Lista de Usuarios</title>
        <script type="text/javascript">
            function excluir(matricula) {
                var url = "gerenciar_usuario.do?op=excluir&matricula=" + matricula;
                if (confirm("Tem certeza que quer excluir o usuario?")) {
                    window.open(url, "_self");
                }
            }
        </script>
    </head>
    <body>
        <!------------------------------------- INPUTS ------------------------------------->
        <div class="mbr-section mbr-section-nopadding">
            <div class="container">
                <div class="container">
                    <h2>Lista de Usuarios</h2>           
                    <table class="table">

                        <tr>
                            <th>MÁTRICULA</th>
                            <th>NOME</th>
                            <th>PERFIL</th>
                            <th colspan="2">OPÇÕES</th>
                        </tr>


                        <%
                            ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
                            Usuario usuario = new Usuario();
                            try {
                                for (Usuario u : usuario.listar()) {
                        %>
                        <tr>
                            <td><%= u.getMatricula()%></td>
                            <td><%= u.getNome()%></td>
                            <td><%=u.getPerfil().getNome()%></td>
                            <td>
                                <a href="form_altera_usuario.jsp?matricula='<%=u.getMatricula()%>'">Alterar</a>
                                <a href="#" onclick="excluir('<%=u.getMatricula()%>')">Excluir</a>
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

    </body>
</html>

