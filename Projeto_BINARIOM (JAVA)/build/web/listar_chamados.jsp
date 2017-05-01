<%-- 
    Document   : listar_chamados
    Created on : 22/04/2017, 19:07:26
    Author     : Antônio Carlos
--%>

<%@page import="modelo.Cliente"%>
<%@page import="modelo.Chamado"%>
<%@page import="modelo.ChamadoDAO"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Lista de Chamados Abertos</title>
    </head>
    <%@page import="modelo.Chamado"%>
    <%@page import="modelo.ChamadoDAO"%>
    <body>
        <!------------------------------------- INPUTS ------------------------------------->
        <div class="mbr-section mbr-section-nopadding">
            <div class="container">
                <div class="container">
                    <h2>Lista de Chamadados Abertos</h2>           
                    <table class="table">

                        <tr>
                            <th>BIN</th>
                            <th>STATUS</th>
                            <th>PRIORIDADE</th>
                            <th>DATA ABERTURA</th>
                            <th colspan="2">OPÇÕES</th>
                        </tr>

                        <!-- NÃO SEI O QUE TÁ ROLANDO AQUI-->
                        <%
                        try {
                            //Fazer um select from da tabela associativa
                            Chamado chamado = new Chamado();
                            for (Chamado c : chamado.listarAbertos()) {
                        %>
                        <tr>
                            <td><%=c.getBin() %></td>
                            <td><%=c.getStatus() %></td>
                            <td><%=c.getPrioridade() %></td>
                            <td><%=c.getDa() %></td>
                            <td>
                                link altera
                                link exclui
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
