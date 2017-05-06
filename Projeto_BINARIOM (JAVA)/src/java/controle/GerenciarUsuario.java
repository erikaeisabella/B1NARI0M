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
import modelo.Perfil;
import modelo.Usuario;
import modelo.UsuarioDAO;

/**
 *
 * @author Antônio Carlos
 */
public class GerenciarUsuario extends HttpServlet {

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
            out.println("<title>Servlet GerenciarUsuario</title>");
            out.println("</head>");
            out.println("<body>");

            String matricula = request.getParameter("matricula");
            String nome = request.getParameter("nome");
            String senha = request.getParameter("senha");
            String id_perfil = request.getParameter("id_perfil");
            String op = request.getParameter("op");

            Usuario u = new Usuario();
            Perfil p = new Perfil();
            UsuarioDAO uDAO = new UsuarioDAO();

            try {
                if (op.equals("excluir") || op.equals("alterar")) {
                    matricula = request.getParameter("matricula");
                }
                
                if (op.equals("inserir")){
                    
                }
                
                u.setMatricula(matricula);
                u.setNome(nome);
                u.setSenha(senha);
                if (!op.equals("excluir")) {
                    p.setId(Integer.parseInt(id_perfil));
                    u.setPerfil(p);
                }

                switch (op) {
                    case "inserir":
                        u.inserir();
                        break;

                    case "alterar":
                        u.alterar();
                        break;

                    case "excluir":
                        u.excluir();
                        break;
                }

                response.sendRedirect("listar_usuarios.jsp");
            } catch (Exception e) {
                out.print("ERRO: " + e);
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
