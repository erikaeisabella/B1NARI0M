<%-- 
    Document   : form_valida_cliente
    Created on : 27/04/2017, 19:12:34
    Author     : Antônio Carlos
--%>

<%@page import="modelo.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Cliente c = new Cliente();
    String matricula = request.getParameter("matricula");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- Resolver o problema das aspas-->
        <form action="form_abre_chamado.jsp?matricula='<%=matricula%>'">
        <div class="mbr-section mbr-section-nopadding">
            <div class="container">
                <div class="row">
                    <div class="row row-sm-offset">
                        <div class="col-xs-4 col-md-3">
                            <div class="form-group">
                                <label class="form-control-label">Matricula</label>
                                <input type="text" class="form-control" name="matricula">
                            </div>
                        </div>
                    </div>
                </div>
                <div>
                    <button type="submit" class="btn btn-primary">Salvar</button>
                </div>
            </div>
        </div>
        </form>
    </body>
</html>
