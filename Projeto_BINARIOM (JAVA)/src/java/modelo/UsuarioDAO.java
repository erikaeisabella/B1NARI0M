package modelo;

import java.sql.*;
import java.util.ArrayList;

public class UsuarioDAO extends Conexao {

    public void inserir(Usuario u) throws Exception {
        conectar();
        String sql = "INSERT INTO usuario (matricula, nome, senha, id_perfil) VALUES (?,?,?,?)";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, u.getMatricula());
        pstm.setString(2, u.getNome());
        pstm.setString(3, u.getSenha());
        pstm.setInt(4, u.getPerfil().getId());

        pstm.execute();
        desconectar();
    }

    public ArrayList<Usuario> listar() throws Exception {
        Usuario u = new Usuario();
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        conectar();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM usuario");

        while (rs.next()) {
            PerfilDAO pDAO = new PerfilDAO();
            u.setMatricula(rs.getString("matricula"));
            u.setNome(rs.getString("nome"));
            u.setSenha(rs.getString("senha"));
            u.setPerfil(pDAO.listarPorId(rs.getInt("id_perfil")));
            usuarios.add(u);
        }
        desconectar();
        return usuarios;
    }

    public Usuario listarPorMatricula(String matricula) throws Exception {
        Usuario u = new Usuario();
        conectar();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM usuario WHERE matricula=" + matricula);

        while (rs.next()) {
            PerfilDAO pDAO = new PerfilDAO();
            u.setMatricula(rs.getString("matricula"));
            u.setNome(rs.getString("nome"));
            u.setSenha("senha");
            u.setPerfil(pDAO.listarPorId(rs.getInt("id_perfil")));
        }
        return u;
    }

    public void alterar(Usuario u) throws Exception {
        conectar();
        String sql = "UPDATE usuario SET matricula=?, nome=?, senha=?, id_perfil=? WHERE matricula = ?";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, u.getMatricula());
        pstm.setString(2, u.getNome());
        pstm.setString(3, u.getSenha());
        pstm.setInt(4, u.getPerfil().getId());
        pstm.setString(5, u.getMatricula());

        pstm.execute();
        desconectar();
    }

    public void excluir(Usuario u) throws Exception {
        conectar();
        String sql = "DELETE FROM chamado WHERE matricula = ?";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, u.getMatricula());

        pstm.execute();
        desconectar();
    }
}
