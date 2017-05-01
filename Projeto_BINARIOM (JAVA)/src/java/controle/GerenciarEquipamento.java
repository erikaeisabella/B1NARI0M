package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Equipamento;

/**
 *
 * @author Antônio Carlos
 */
public class GerenciarEquipamento extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GerenteEquipamento</title>");
            out.println("</head>");
            out.println("<body>");

            int etiqueta = Integer.parseInt(request.getParameter("etiqueta"));
            String marca = request.getParameter("marca");
            String tipo = request.getParameter("tipo");
            String descricao = request.getParameter("descricao");
            String data_instalacao = request.getParameter("data_instalacao");
            String op = request.getParameter("op");
            Equipamento e = new Equipamento();

            try {
                if (marca.isEmpty()) {
                    out.print("Preencha o campo marca");
                } else if (tipo.isEmpty()) {
                    out.print("Descreva o tipo do equipamento");
                } else if (descricao.isEmpty()) {
                    out.print("Preencha a descrição do Equipamento");
                }

                e.setEtiqueta(etiqueta);
                e.setMarca(marca);
                e.setTipo(tipo);
                e.setDescricao(descricao);
                e.setDataInstalacao(data_instalacao);

                switch (op) {
                    case "inserir":
                        e.inserir();
                        break;

                    case "alterar":
                        e.alterar();
                        break;

                    case "excluir":
                        e.excluir();
                        break;
                }

                response.sendRedirect("listar_equipamentos.jsp");
            } catch (Exception d) {
                out.print("ERRO:" + d);
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
