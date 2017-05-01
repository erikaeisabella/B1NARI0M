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
import javax.servlet.http.HttpSession;
import modelo.Usuario;
import modelo.UsuarioDAO;

/**
 *
 * @author Antônio Carlos
 */
public class ValidaLogin extends HttpServlet {

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
            out.println("<title>Servlet ValidaLogin</title>");
            out.println("</head>");
            out.println("<body>");

            HttpSession session = request.getSession();
            
            try {
                String matricula = request.getParameter("matricula");
                String senha = request.getParameter("senha");
                
                if (matricula.isEmpty()) {
                    out.print("O campo Matricula deve ser preenchido!");
                } else if (senha.isEmpty()) {
                    out.print("O campo Senha deve ser preenchido!");
                } else {
                    
                    Usuario u = new Usuario();
                    UsuarioDAO uDAO = new UsuarioDAO();
                    //Chama o metodo logar
                    u = uDAO.logar(matricula, senha);
                    //Verifica se o ID que foi pego é maior que zero, caso seja
                    //significa que o usuario está logado
                    if (u.getPerfil().getId() == 1) {
                        //Seta o atributo usuario, assim se torna possivel recuperar tudo que há 
                        //no usuario pois o tipo dele é u
                        //Caso o id_perfil seja = 1 o perfil é de ADM
                        session.setAttribute("usuario", u);
                        response.sendRedirect("pagina_adm.jsp");
                    } else {
                        //Caso seja 2 = Técnico
                        session.setAttribute("usuario", u);
                        response.sendRedirect("index.jsp");
                    }
                }
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
