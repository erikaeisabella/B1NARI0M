package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Login em B1NARI0M</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <link rel=\"icon\" href=\"img/icon_logo_shurt.png\" type=\"image/png\">\r\n");
      out.write("        <!--==================CSS==================-->  \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-3.3.7-dist/css/bootstrap.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome-4.7.0/css/font-awesome.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"body\">\r\n");
      out.write("        <form action=\"valida_login.do\" method=\"post\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <header id=\"headerLogin\" class=\"col-xs-12 header\">\r\n");
      out.write("                        <a href=\"index.jsp\"><div id=\"logo\" class=\"center\"></div></a>\r\n");
      out.write("                        <br/><h3>Área de Suporte</h3>\r\n");
      out.write("                        <i class=\"fa fa-cogs\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    </header>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\"> \r\n");
      out.write("                    <section id=\"sectionLogin\" class=\"col-xs-12 position section\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div id=\"login\" class=\"position center telaLoginClass\">\r\n");
      out.write("                                <div id=\"autentication\" class=\"position center\">\r\n");
      out.write("                                    <div id=\"icon_logo\" class=\"position\"></div>\r\n");
      out.write("                                    <div id=\"form_autentication\">\r\n");
      out.write("                                        Matrícula:<br/><input type=\"text\" name=\"matricula\"> <br/><br/>\r\n");
      out.write("                                        Senha:<br/><input type=\"password\" name=\"senha\"><br/><br/>\r\n");
      out.write("                                        <input type=\"submit\" name=\"bntLogar\" value=\"Entrar\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"index.jsp\" id=\"backToHome\" class=\"position\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i>&nbsp;&nbsp;Voltar ao Início</a>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
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
