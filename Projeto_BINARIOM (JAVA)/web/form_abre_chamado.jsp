<%@page import="modelo.Cliente"%>
<%@page import="modelo.Chamado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Cliente c = new Cliente();
    String matricula = request.getParameter("matricula");
    try {
        c.listarPorMatricula(matricula);
    } catch (Exception e) {
        out.print("ERRO:" + e);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Abrir Chamado</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 text-xs-center">
                    <h3 class="mbr-section-title display-2 text-center">Abrir Chamado</h3>
                    <small class="mbr-section-subtitle"></small>
                </div>
            </div>
        </div>
        <!------------------------------------- INPUTS ------------------------------------->
        <!--CARREGAR OS DADOS DO CLIENTE -->

        <div class="mbr-section mbr-section-nopadding">
            <div class="container">
                <div class="row">
                    <div class="row row-sm-offset">
                        <div class="col-xs-4 col-md-3">
                            <div class="form-group">
                                <label class="form-control-label">Matricula</label>
                                <input type="text" class="form-control" name="matricula" readonly value="<%=c.getMatricula()%>">
                            </div>
                        </div>

                        <div class="col-xs-4 col-md-3">
                            <div class="form-group">
                                <label class="form-control-label">Nome</label>
                                <input type="text" class="form-control" name="nome" readonly value="<%=c.getNome()%>">
                            </div>
                        </div>

                        <div class="col-xs-4 col-md-3">
                            <div class="form-group">
                                <label class="form-control-label">Setor</label>
                                <input type="text" class="form-control" name="cpf" readonly value="<%=c.getSetor()%>">
                            </div>
                        </div>

                        <div class="col-xs-4 col-md-3">
                            <div class="form-group">
                                <label class="form-control-label">Telefone</label>
                                <input type="text" class="form-control" name="telefone" readonly value="<%=c.getTelefone()%>">
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <div class="page-header"></div>
        <!-- -->
        <form action="gerenciar_chamado.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">
                    <input type="hidden" name="op" value="inserir">
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
                                    <label class="form-control-label">Status<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="status" value="">
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

