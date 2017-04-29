<%-- 
    Document   : form_altera_cliente
    Created on : 21/04/2017, 21:02:41
    Author     : Antônio Carlos
--%>

<%@page import="modelo.Cliente"%>
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
        <title>Alterar Cliente</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 text-xs-center">
                    <h3 class="mbr-section-title display-2 text-center">Alterar Cliente</h3>
                    <small class="mbr-section-subtitle"></small>
                </div>
            </div>
        </div>
        <!-- INPUTS -->
        <form action="gerenciar_cliente.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">
                    <div class="row">

                        <div class="row row-sm-offset">

                            <input type="hidden" name="op" value="alterar">

                            <div class="col-xs-4 col-md-2">
                                <div class="form-group">
                                    <label class="form-control-label">Matricula<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="matricula" value="<%=c.getMatricula() %>" readonly >
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-2">
                                <div class="form-group">
                                    <label class="form-control-label">Nome<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="nome" required value="<%=c.getNome() %>">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">CPF<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="cpf" required value="<%=c.getCpf() %>">
                                </div>
                            </div>
                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">SETOR<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="setor" required value="<%=c.getSetor() %>">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">TELEFONE<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="telefone" required value="<%=c.getTelefone()  %>">
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
