package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Cliente;
import modelo.Chamado;
import modelo.ChamadoDAO;
import java.util.ArrayList;
import modelo.Chamado;
import modelo.ChamadoDAO;

public final class listar_005fchamados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-3.3.7-dist/css/bootstrap.min.css\">\n");
      out.write("        <title>Lista de Chamados</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <!------------------------------------- INPUTS ------------------------------------->\n");
      out.write("        <div class=\"mbr-section mbr-section-nopadding\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h2>Lista de Chamadados</h2>           \n");
      out.write("                    <table class=\"table\">\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th>BIN</th>\n");
      out.write("                            <th>STATUS</th>\n");
      out.write("                            <th>PRIORIDADE</th>\n");
      out.write("                            <th>SOLICITANTE</th>\n");
      out.write("                            <th>DATA ABERTURA</th>\n");
      out.write("                            <th colspan=\"2\">OPÇÕES</th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <!-- NÃO SEI O QUE TÁ ROLANDO AQUI-->\n");
      out.write("                        ");

                            Chamado ch = new Chamado();

                            try {
                                for (Chamado c : ch.listar()) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(c.getBin());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(c.getStatus());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(c.getPrioridade());
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                link altera\n");
      out.write("                                link exclui\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        ");

                            } catch (Exception e) {
                                out.print("ERRO:" + e);
                            }
                        
      out.write("\n");
      out.write("                    </table>\t\n");
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
