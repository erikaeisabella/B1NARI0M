<%-- 
    Document   : form_inserir_usuario
    Created on : 21/04/2017, 20:58:53
    Author     : Antônio Carlos
--%>

<%@page import="modelo.PerfilDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Perfil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Perfil> perfis = new ArrayList<Perfil>();
    try {
        //Carregar a lista de perfis disponiveis
        PerfilDAO pDAO = new PerfilDAO();
        perfis = pDAO.listarPerfis();
    } catch (Exception e) {
        out.print("ERRO:" + e);

    }
%>
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
                    <form action="gerenciar_usuario.do" method="post">

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
                                    <label class="form-control-label">Senha<span class="form-asterisk">*</span></label>
                                    <input type="password" class="form-control" name="senha" required>
                                </div>
                            </div>
                            
                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">Perfil</label>
                                    <select class="form_control" name="id_perfil" required>
                                        <option value="">Selecione...</option>
                                        <!--Faz o ForEach-->
                                        <% for (Perfil p : perfis) {%>
                                        <option value="<%=p.getId()%>"> <%=p.getNome()%> </option>
                                        <% }%>
                                    </select>
                                </div>
                            </div>
                            <div><button type="submit" class="btn btn-primary">Salvar</button></div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>