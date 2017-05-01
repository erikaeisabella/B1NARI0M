/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Chamado;
import modelo.ChamadoDAO;
import modelo.Equipamento;
import modelo.Usuario;

/**
 *
 * @author Antônio Carlos
 */
public class GerenciarChamado extends HttpServlet {

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
            out.println("<title>Servlet GerenciarChamado</title>");
            out.println("</head>");
            out.println("<body>");

            int bin = 0;
            String descricao = request.getParameter("descricao");
            String localidade = request.getParameter("localidade");
            String status = request.getParameter("status");
            String prioridade = request.getParameter("prioridade");
            String observacao = request.getParameter("observacao");
            String equipamento_etiqueta = request.getParameter("equipamento_etiqueta");
            String op = request.getParameter("op");

            ChamadoDAO cDAO = new ChamadoDAO();
            Chamado c = new Chamado();
            Usuario u = new Usuario();
            Equipamento eq = new Equipamento();

            try {
                c.setBin(bin);
                c.setDescricao(descricao);
                c.setLocalidade(localidade);
                    eq.setEtiqueta(Integer.parseInt(equipamento_etiqueta));
                c.setEquipamento(eq);
                c.setStatus(status);
                c.setPrioridade(prioridade);
                c.setObservacao(observacao);

                switch (op) {
                    case "inserir":
                        cDAO.inserir(c);
                        break;
                        
                    case "cancelar":
                        break;
                }

                response.sendRedirect("listar_chamados.jsp");

            } catch (Exception e) {
                out.print("ERRO : " + e);
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
