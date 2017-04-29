<%@page import="java.util.ArrayList"%>
<%@page import="modelo.PerfilDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Lista de Euipamentos</title>
        <script type="text/javascript">
            function excluir(etiqueta) {
                var url = "gerenciar_equipamento.do?op=excluir&etiqueta=" + etiqueta;
                if (confirm("Tem certeza que quer excluir o equipamento?")) {
                    window.open(url, "_self");
                }
            }
        </script>
    </head>
    <%@page import="modelo.Equipamento"%>
    <%@page import="modelo.EquipamentoDAO"%>
    <body>
        <!------------------------------------- INPUTS ------------------------------------->
        <form action="gerenciar_equipamento.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">
                    <div class="container">
                        <h2>Lista de Equipamentos</h2>           
                        <table class="table">

                            <tr>
                                <th>ETIQUETA</th>
                                <th>MARCA</th>
                                <th>TIPO</th>
                                <th>DESCRIÇÃO</th>
                                <th>DATA DE INSTALAÇÃO</th>
                                <th colspan="2">OPÇÕES</th>
                            </tr>


                            <%
                                EquipamentoDAO eDAO = new EquipamentoDAO();
                                ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
                                equipamentos = eDAO.listar();
                                try {
                                    for (Equipamento e : equipamentos) {
                            %>
                            <tr>
                                <td><%= e.getEtiqueta()%></td>
                                <td><%= e.getMarca()%></td>
                                <td><%= e.getTipo()%></td>
                                <td><%= e.getDescricao()%></td>
                                <td><%= e.getDataInstalacao()%></td>
                                <td>
                                    <a href="form_altera_equipamento.jsp?etiqueta=<%=e.getEtiqueta()%>">Alterar</a>
                                    <a href="#" onclick="excluir(<%=e.getEtiqueta()%>)">Excluir</a>
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
