package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelo.PerfilDAO;
import modelo.Equipamento;
import modelo.EquipamentoDAO;

public final class listar_005fequipamentos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-3.3.7-dist/css/bootstrap.min.css\">\n");
      out.write("        <title>Lista de Euipamentos</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function excluir(etiqueta) {\n");
      out.write("                var url = \"gerenciar_equipamento.do?op=excluir&etiqueta=\" + etiqueta;\n");
      out.write("                if (confirm(\"Tem certeza que quer excluir o equipamento?\")) {\n");
      out.write("                    window.open(url, \"_self\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <!------------------------------------- INPUTS ------------------------------------->\n");
      out.write("        <form action=\"gerenciar_equipamento.do\" method=\"post\">\n");
      out.write("            <div class=\"mbr-section mbr-section-nopadding\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h2>Lista de Equipamentos</h2>           \n");
      out.write("                        <table class=\"table\">\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <th>ETIQUETA</th>\n");
      out.write("                                <th>MARCA</th>\n");
      out.write("                                <th>TIPO</th>\n");
      out.write("                                <th>DESCRIÇÃO</th>\n");
      out.write("                                <th>DATA DE INSTALAÇÃO</th>\n");
      out.write("                                <th colspan=\"2\">OPÇÕES</th>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");

                                EquipamentoDAO eDAO = new EquipamentoDAO();
                                ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
                                equipamentos = eDAO.listar();
                                try {
                                    for (Equipamento e : equipamentos) {
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( e.getEtiqueta());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( e.getMarca());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( e.getTipo());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( e.getDescricao());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( e.getDataInstalacao());
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"form_altera_equipamento.jsp?etiqueta=");
      out.print(e.getEtiqueta());
      out.write("\">Alterar</a>\n");
      out.write("                                    <a href=\"#\" onclick=\"excluir(");
      out.print(e.getEtiqueta());
      out.write(")\">Excluir</a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            ");

                                    }
                                } catch (Exception e) {
                                    out.print("ERRO:" + e);
                                }
                            
      out.write("\n");
      out.write("                        </table>\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
