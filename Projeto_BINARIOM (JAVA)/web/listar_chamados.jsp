<%-- 
    Document   : listar_chamados
    Created on : 22/04/2017, 19:07:26
    Author     : Antônio Carlos
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="modelo.Chamado"%>
<%@page import="modelo.ChamadoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Lista de Chamados Abertos</title>
    </head>
    <body>
        <div class="mbr-section mbr-section-nopadding">
            <div class="container">
                <div class="container">
                    <h2>Lista de Chamados Abertos</h2>
                    <div class="table-responsive">
                        <table class="table table-hover">
                            <tr>
                                <th>BIN</th>
                                <th>STATUS</th>
                                <th>PRIORIDADE</th>
                                <th>DATA ABERTURA</th>
                                <th colspan="2">OPÇÕES</th>
                            </tr>
                            <%
                                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
                                DecimalFormat zf = new DecimalFormat("000000");
                                Chamado chamado = new Chamado();
                                try {

                                    for (Chamado c : chamado.listarAbertos()) {
                            %>
                            <tr>
                                <td><%=zf.format(c.getBin())%></td>
                                <td><%=c.getStatus()%></td>
                                <td><%=c.getPrioridade()%></td>
                                <td><%=df.format(c.getDa())%></td>
                                <td>
                                    link altera
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
        </div>
    </body>
</html>
