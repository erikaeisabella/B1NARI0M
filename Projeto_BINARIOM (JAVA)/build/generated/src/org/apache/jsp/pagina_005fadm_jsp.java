package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pagina_005fadm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Página Admin</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-3.3.7-dist/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome-4.7.0/css/font-awesome.css\">\n");
      out.write("        <link rel=\"icon\" href=\"img/Sem-Título-2.png\" type=\"image/x-icon\" />\n");
      out.write("        <style>\n");
      out.write("            li,a,h2, b{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"body\">\n");
      out.write("        <!-- HEADER -->\n");
      out.write("        <header id=\"header\" class=\"col-xs-* col-sm-* col-md-* col-lg-*\">\n");
      out.write("            <div id=\"dHeader\" class=\"col-xs-* col-sm-* col-md-* col-lg-*\">\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- MENU LATERAL -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row content\">\n");
      out.write("                <div class=\"col-sm-3 sidenav\">\n");
      out.write("                    <h2>Logo</h2>\n");
      out.write("                    <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                        <li class=\"active\"><a href=\"#section1\">Painel Administrativo</a></li>\n");
      out.write("                        <li><a href=\"#section2\"> Visão Geral </a></li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                                Cliente\n");
      out.write("                                <span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"#\"></a></li>\n");
      out.write("                                <li><a href=\"#\"></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                                Usuario\n");
      out.write("                                <span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"#\"></a></li>\n");
      out.write("                                <li><a href=\"#\"></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                                Menu\n");
      out.write("                                <span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"#\"></a></li>\n");
      out.write("                                <li><a href=\"#\"></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                                Perfil\n");
      out.write("                                <span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"#\"></a></li>\n");
      out.write("                                <li><a href=\"#\"></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <!-- NABEGAÇÃO CENTRAL -->\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                    <div class=\"page-header\">\n");
      out.write("                        <div class=\"text-center\"><b>VISÃO GERAL</b></div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <!-- QUADROS -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"well\">\n");
      out.write("                                <i class=\"fa fa-arrow-right fa-1x fa-pull-right\"></i>\n");
      out.write("                                <h4 class=\"text-left\">Abertos</h4>\n");
      out.write("                                <p>Código JSP apresenta ABERTOS</p> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"well\">\n");
      out.write("                                <i class=\"fa fa-spinner fa-1x fa-spin fa-pull-right\"></i>\n");
      out.write("                                <h4 class=\"text-left\">Em Andamento</h4>\n");
      out.write("                                <p>Código JSP apresenta EM ANDAMENTO</p> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"well\">\n");
      out.write("                                <i class=\"fa fa-times fa-1x fa-pull-right\"></i>\n");
      out.write("                                <h4 class=\"text-left\">Cancelados</h4>\n");
      out.write("                                <p>Código JSP apresenta Cancelados</p> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"well\">\n");
      out.write("                                <i class=\"fa fa-check fa-1x fa-pull-right\"></i>\n");
      out.write("                                <h4 class=\"text-left\">Concluidos</h4>\n");
      out.write("                                <p>Código JSP apresenta os concluidos</p> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <div class=\"well\">\n");
      out.write("                                <h4>TOTAL CHAMADOS: Código JSP</h4> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
