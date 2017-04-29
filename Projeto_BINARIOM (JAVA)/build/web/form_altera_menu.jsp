<%-- 
    Document   : form_altera_menu
    Created on : 21/04/2017, 21:02:19
    Author     : Antônio Carlos
--%>

<%@page import="modelo.Menu"%>
<%@page import="modelo.MenuDAO"%>
<%@page import="modelo.PerfilDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Perfil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Perfil> perfis = new ArrayList<Perfil>();
    int id = Integer.parseInt(request.getParameter("id"));
    Menu m = new Menu();
    try {
        MenuDAO mDAO = new MenuDAO();
        m = mDAO.listarPorId(id);
        
        PerfilDAO pDAO = new PerfilDAO();
        perfis = pDAO.listar();
    } catch (Exception e) {
        out.print("ERRO:" + e);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Alterar Menu</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 text-xs-center">
                    <h3 class="mbr-section-title display-2 text-center">Alterar Menu</h3>
                    <small class="mbr-section-subtitle"></small>
                </div>
            </div>
        </div>
        <!------------------------------------- INPUTS ------------------------------------->
        <form action="gerenciar_menu.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">

                    <div class="row">

                        <div class="row row-sm-offset">
                            <input type="hidden" name="op" value="alterar">
                            
                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">ID<span class="form-asterisk">*</span></label>
                                    <input type="number" class="form-control" name="id" required value="<%=m.getId()%>">
                                </div>
                            </div>
                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">Nome<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="nome" required value="<%=m.getNome()%>">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">Link<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="link" required value="<%=m.getLink()%>">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">Perfil</label>
                                    <select name="id_perfil" size="1" required>
                                        <option value="">Selecione...</option>
                                        <%
                                            for (Perfil p : perfis) {
                                                String selecionado = "";
                                                if (p.getId() == m.getPerfil().getId()) {
                                                    selecionado = "selected";
                                                }
                                        %>
                                        <option value="<%=p.getId()%>" <%=selecionado%>><%=p.getNome()%></option>
                                        <% }%>
                                    </select>
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
