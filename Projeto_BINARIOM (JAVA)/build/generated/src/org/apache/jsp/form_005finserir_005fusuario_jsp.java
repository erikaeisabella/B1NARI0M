package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.PerfilDAO;
import java.util.ArrayList;
import modelo.Perfil;

public final class form_005finserir_005fusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ArrayList<Perfil> perfis = new ArrayList<Perfil>();
    try {
        //Carregar a lista de perfis disponiveis
        PerfilDAO pDAO = new PerfilDAO();
        perfis = pDAO.listarPerfis();
    } catch (Exception e) {
        out.print("ERRO:" + e);

    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-3.3.7-dist/css/bootstrap.min.css\">\n");
      out.write("        <title>Inserir Usuario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 text-xs-center\">\n");
      out.write("                    <h3 class=\"mbr-section-title display-2 text-center\">Inserir Usuario</h3>\n");
      out.write("                    <small class=\"mbr-section-subtitle\"></small>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!------------------------------------- INPUTS ------------------------------------->\n");
      out.write("        <div class=\"mbr-section mbr-section-nopadding\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <form action=\"gerenciar_usuario.do\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <div class=\"row row-sm-offset\">\n");
      out.write("\n");
      out.write("                            <input type=\"hidden\" name=\"op\" value=\"inserir\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-xs-4 col-md-2\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"form-control-label\">Matricula<span class=\"form-asterisk\">*</span></label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"matricula\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-xs-4 col-md-2\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"form-control-label\">Nome<span class=\"form-asterisk\">*</span></label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nome\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-xs-4 col-md-3\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"form-control-label\">Senha<span class=\"form-asterisk\">*</span></label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"senha\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-xs-4 col-md-3\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"form-control-label\">Perfil</label>\n");
      out.write("                                    <select class=\"form_control\" name=\"id_perfil\" required>\n");
      out.write("                                        <option value=\"\">Selecione...</option>\n");
      out.write("                                        <!--Faz o ForEach-->\n");
      out.write("                                        ");
 for (Perfil p : perfis) {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(p.getId());
      out.write("\"> ");
      out.print(p.getNome());
      out.write(" </option>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div><button type=\"submit\" class=\"btn btn-primary\">Salvar</button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
