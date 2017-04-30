<%-- 
    Document   : form_detalhar_chamado
    Created on : 30/04/2017, 10:46:09
    Author     : Antônio Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">        
        <title>LISTAR CHAMADO POR BIN</title>
    </head>
    <body>
        <form action="gerenciar_chamado.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">
                    <input type="hidden" name="op" value="cancelar">
                    <div class="row row-sm-offset">
                        <div class="row">
                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">Descrição<span class="form-asterisk">*</span></label>
                                    <textarea class="form-control" rows="5" name="descricao">
                                    Página onde será mostrado os dados do chamado já aberto, pelo numero do BIN
                                    o clente pode alterar status para cancelado
                                    </textarea>
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

                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">Responsavel<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="usuario_matricula" readonly value="">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label">Status<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="status" value="">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>
