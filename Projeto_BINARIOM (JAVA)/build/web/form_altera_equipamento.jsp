<%-- 
    Document   : form_altera_equipamento
    Created on : 21/04/2017, 21:01:56
    Author     : Antônio Carlos
--%>

<%@page import="modelo.Equipamento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int etiqueta = Integer.parseInt(request.getParameter("etiqueta"));
    Equipamento eq = new Equipamento();
    try{
        eq.listarPorEtiqueta(etiqueta);
    }catch (Exception e) {
        out.print("ERRO: " + e);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Alterar Equipamento</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 text-xs-center">
                    <h3 class="mbr-section-title display-2 text-center">Alterar Equipamento</h3>
                    <small class="mbr-section-subtitle"></small>
                </div>
            </div>
        </div>
        <!------------------------------------- INPUTS ------------------------------------->
        <form action="gerenciar_equipamento.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">
                    <div class="row">
                        <div class="row row-sm-offset">

                            <input type="hidden" name="op" value="alterar">
                            <div class="col-xs-4 col-md-2">
                                <div class="form-group">
                                    <label class="form-control-label"><span class="form-asterisk">Etiqueta*</span></label>
                                    <input type="number" class="form-control" name="etiqueta" required value="<%=eq.getEtiqueta()%>">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-2">
                                <div class="form-group">
                                    <label class="form-control-label">Marca<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="marca" required value="<%=eq.getMarca() %>">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">Tipo<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="tipo" required value="<%=eq.getTipo() %>">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">Descricao<span class="form-asterisk">*</span></label>
                                    <textarea rows="5" type="text" class="form-control" name="descricao" value="<%=eq.getDescricao() %>"></textarea>
                                </div>
                            </div>


                            <div class="col-xs-4 col-md-2">
                                <div class="form-group">
                                    <label class="form-control-label">Data de Instalação<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="data_instalacao" value="<%=eq.getDataInstalacao() %>">
                                </div>
                            </div>


                        </div>
                        <div><button type="submit" class="btn btn-primary">Salvar</button></div>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>
