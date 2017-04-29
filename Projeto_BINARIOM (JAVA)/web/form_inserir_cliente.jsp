<%-- 
    Document   : form_inserir_cliente
    Created on : 16/04/2017, 11:25:46
    Author     : Antônio Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Inserir Cliente</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 text-xs-center">
                    <h3 class="mbr-section-title display-2 text-center">Inserir Cliente</h3>
                    <small class="mbr-section-subtitle"></small>
                </div>
            </div>
        </div>
        <!------------------------------------- INPUTS ------------------------------------->
        <div class="mbr-section mbr-section-nopadding">
            <div class="container">
                <div class="row">
                    <form action="gerenciar_cliente.do" method="post">

                        <div class="row row-sm-offset">

                            <input type="hidden" name="op" value="inserir">
                            <div class="col-xs-4 col-md-2">
                                <div class="form-group">
                                    <label class="form-control-label">Matricula<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="matricula" required>
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-2">
                                <div class="form-group">
                                    <label class="form-control-label">Nome<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="nome" required>
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">CPF<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="cpf" required>
                                </div>
                            </div>
                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">SETOR<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="setor" required>
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">TELEFONE<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="telefone" required>
                                </div>
                            </div>
                        </div>

                        <div><button type="submit" class="btn btn-primary">Salvar</button></div>

                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
