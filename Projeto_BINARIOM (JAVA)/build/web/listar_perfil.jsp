<%@page import="java.util.ArrayList"%>
<%@page import="modelo.PerfilDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Lista de Perfis</title>
        <script type="text/javascript">
            function excluir(id) {
                var url = "gerente_perfil.do?op=excluir&id="+id;
                if (confirm("Tem certeza que quer excluir o perfil?")) {
                    window.open(url, "_self");
                }
            }
        </script>
    </head>
    <%@page import="modelo.Perfil"%>
    <body>
        <!------------------------------------- INPUTS ------------------------------------->
        <form action="gerente_perfil.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">
                    <div class="container">
                        <h2>Perfis do Sistema</h2>           
                        <table class="table">

                            <tr>
                                <th>ID</th>
                                <th>NOME</th>
                                <th>DESCRIÇÃO</th>
                                <th colspan="2">OPÇÕES</th>
                            </tr>


                            <%
                                PerfilDAO pDAO = new PerfilDAO();
                                ArrayList<Perfil> perfis = new ArrayList<Perfil>();
                                perfis = pDAO.listar();
                                try {
                                    for (Perfil p : perfis) {
                            %>
                            <tr>
                                <td><%= p.getId()%></td>
                                <td><%= p.getNome()%></td>
                                <td><%= p.getDescricao()%></td>
                                <td>
                                    <a href="form_altera_perfil.jsp?id=<%=p.getId()%>">Alterar</a>
                                    <a href="#" onclick="excluir(<%=p.getId()%>, '<%=p.getNome()%>')">Excluir</a>
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