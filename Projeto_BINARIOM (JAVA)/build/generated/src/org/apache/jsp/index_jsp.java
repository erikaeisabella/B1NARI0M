package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>B1NARI0M - Sistema de Controle de Chamado</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <link rel=\"icon\" href=\"img/icon_logo_shurt.png\" type=\"image/png\">\r\n");
      out.write("<!--==================CSS==================-->  \r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-3.3.7-dist/css/bootstrap.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome-4.7.0/css/font-awesome.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"body\">\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <header id=\"headerIndex\" class=\"col-xs-12 header\">\r\n");
      out.write("    \t<a href=\"index.jsp\"><div id=\"logo\" class=\"center\"></div></a>\r\n");
      out.write("    \t<h5>Sistema de Controle de Chamado</h5>\r\n");
      out.write("    </header>\r\n");
      out.write("  </div>\r\n");
      out.write("    <section id=\"sectionIndex\" class=\"col-xs-12 position section\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("    \t<div id=\"menu_index\"  class=\"position center menu_indexClass\">\r\n");
      out.write("    \t  <div id=\"setClient\" class=\"col-xs-12\">\r\n");
      out.write("    \t\t<i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>\r\n");
      out.write("    \t\t<div class=\"row\">\r\n");
      out.write("    \t\t  <nav class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\r\n");
      out.write("    \t\t    <div class=\"row\">\r\n");
      out.write("    \t\t\t  <ul type=\"none\" class=\"center\">\r\n");
      out.write("    \t\t\t\t<i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\r\n");
      out.write("    \t\t\t\t<li class=\"position\"><a href=\"abrir_chamado.jsp\">Abrir Chamado</a></li>\r\n");
      out.write("    \t\t\t\t<i class=\"fa fa-search\" aria-hidden=\"true\"></i>\r\n");
      out.write("    \t\t\t\t<li class=\"position\"><a href=\"pesquisar_chamado.jsp\">Pesquisar Chamado</a></li>\r\n");
      out.write("    \t\t\t  </ul>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t  </nav>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t  </div>\r\n");
      out.write("    \t  <div id=\"setSup\" class=\"col-xs-12\">\r\n");
      out.write("    \t  \t<h4>(Área de Suporte)</h4>\r\n");
      out.write("    \t  \t<i class=\"fa fa-cogs\" aria-hidden=\"true\"></i>\r\n");
      out.write("    \t  \t<div id=\"btnLogin\" class=\"center\">\r\n");
      out.write("    \t  \t  <a href=\"login.jsp\"><i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i>&nbsp;&nbsp;Login</a>\r\n");
      out.write("    \t  \t</div>\r\n");
      out.write("    \t  </div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </section>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
