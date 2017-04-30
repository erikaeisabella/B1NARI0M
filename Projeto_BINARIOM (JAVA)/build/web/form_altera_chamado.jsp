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
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="gerenciar_chamado.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">

                    <input type="hidden" name="op" value="alterar">

                    <div class="row row-sm-offset">

                        <div class="row">
                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">Descrição<span class="form-asterisk">*</span></label>
                                    <textarea class="form-control" rows="5" name="descricao"></textarea>
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">Localidade<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="localidade" readonly required>
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">Etiqueta do Equipamento<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="equipamento_etiqueta" readonly required>
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">Responsavel<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="usuario_matricula" value="">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">Status<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="status" value="">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">Data Abertura<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="data_abertura" readonly value="">
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
