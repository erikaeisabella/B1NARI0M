<%-- 
    Document   : form_altera_chamado
    Created on : 22/04/2017, 19:07:13
    Author     : Antônio Carlos
--%>

<%@page import="modelo.Chamado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Chamado c = new Chamado();
    int bin = Integer.parseInt(request.getParameter("bin"));
    try {
        c.listarPorBin(bin);
    } catch (Exception e) {
        out.print("ERRO:" + e);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="gerenciar_chamado.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">
                    <input type="hidden" name="op" value="inserir">
                    <div class="row row-sm-offset">
                        <div class="row">
                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">BIN<span class="form-asterisk">*</span></label>
                                    <input type="number" class="form-control" name="bin" readonly value="<%=c.getBin()%>">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">Localidade<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="localidade" required>
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">Etiqueta do Equipamento<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="equipamento_etiqueta" required>
                                </div>
                            </div>
                        </div>
                        <div>
                            <button type="submit" class="btn btn-primary">Salvar</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>
