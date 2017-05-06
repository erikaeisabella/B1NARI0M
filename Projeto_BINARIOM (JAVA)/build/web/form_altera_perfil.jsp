<%@page import="modelo.PerfilDAO"%>
<%@page import="modelo.Perfil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Alterar Perfil</title>
    </head>

    <%
        Perfil p = new Perfil();
        PerfilDAO pDAO = new PerfilDAO();
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            pDAO.listarPorId(id);
        } catch (Exception e) {
            out.print("ERRO:" + e);
        }
    %>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 text-xs-center">
                    <h3 class="mbr-section-title display-2 text-center">Alterar Perfil</h3>
                    <small class="mbr-section-subtitle"></small>
                </div>
            </div>
        </div>
        <!------------------------------------- INPUTS ------------------------------------->
        <form action="gerenciar_perfil.do" method="post">
            <div class="mbr-section mbr-section-nopadding">
                <div class="container">

                    <div class="row">

                        <div class="row row-sm-offset">

                            <input type="hidden" name="op" value="alterar">

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">ID<span class="form-asterisk">*</span></label>
                                    <input type="number" class="form-control" name="id" readonly value="<%=p.getId()%>">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">Nome<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="nome" value="<%=p.getNome()%>">
                                </div>
                            </div>

                            <div class="col-xs-4 col-md-3">
                                <div class="form-group">
                                    <label class="form-control-label">Descricao<span class="form-asterisk">*</span></label>
                                    <textarea class="form-control" name="descricao" required><%=p.getDescricao()%></textarea>
                                </div>
                            </div>

                        </div>
                    </div>
                    <div>
                        <button type="submit" class="btn btn-primary">Salvar</button>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>