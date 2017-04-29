<%-- 
    Document   : form_inserir_equipamento
    Created on : 17/04/2017, 20:18:47
    Author     : Antônio Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Inserir Equipamento</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 text-xs-center">
                    <h3 class="mbr-section-title display-2 text-center">Inserir Equipamento</h3>
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

                            <input type="hidden" name="op" value="inserir">
                            
                            <div class="col-xs-4 col-md-2">
                                <div class="form-group">
                                    <label class="form-control-label"><span class="form-asterisk">Etiqueta*</span></label>
                                    <input type="number" class="form-control" name="etiqueta" required>
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-2">
                                <div class="form-group">
                                    <label class="form-control-label">Marca<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="marca" required>
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">Tipo<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="tipo" required>
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">Descricao<span class="form-asterisk">*</span></label>
                                    <textarea rows="5" class="form-control" name="descricao"></textarea>
                                </div>
                            </div>


                            <div class="col-xs-4 col-md-2">
                                <div class="form-group">
                                    <label class="form-control-label">Data de Instalação<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="data_instalacao">
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

