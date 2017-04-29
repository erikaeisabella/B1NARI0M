package modelo;

import java.sql.*;
import java.util.ArrayList;

public class MenuDAO extends Conexao {

    public void inserir(Menu m) throws Exception {
        String sql = "INSERT INTO menu (nome,link,id_perfil) VALUES (?,?,?)";
        conectar();
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, m.getNome());
        pstm.setString(2, m.getLink());
        pstm.setInt(3, m.getPerfil().getId());

        pstm.execute();
        desconectar();
    }

    public ArrayList<Menu> listar() throws Exception {

        ArrayList<Menu> menus = new ArrayList<Menu>();

        conectar();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM menu");

        while (rs.next()) {
            PerfilDAO pDAO = new PerfilDAO();
            Menu m = new Menu();
            m.setId(rs.getInt("id"));
            m.setNome(rs.getString("nome"));
            m.setLink(rs.getString("link"));
            m.setPerfil(pDAO.listarPorId(rs.getInt("id_perfil")));
            menus.add(m);
        }
        desconectar();
        return menus;
    }

    public Menu listarPorId(int id) throws Exception {
        Menu m = new Menu();
        conectar();
        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery("SELECT * FROM menu WHERE id=" + id);

        if (rs.next()) {
            PerfilDAO pDAO = new PerfilDAO();
            m.setId(rs.getInt("id"));
            m.setNome(rs.getString("nome"));
            m.setLink(rs.getString("link"));
            m.setPerfil(pDAO.listarPorId(rs.getInt("id_perfil")));
        }
        desconectar();
        return m;
    }

    public void alterar(Menu m) throws Exception {
        conectar();
        String sql = "UPDATE menu SET nome=?, link=?, id_perfil=? WHERE id = ?"; 
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, m.getNome());
        pstm.setString(2, m.getLink());
        pstm.setInt(3, m.getPerfil().getId());
        pstm.setInt(4, m.getId());

        pstm.execute();
        desconectar();
    }

    public void excluir(Menu m) throws Exception {
        conectar();
        String sql = "DELETE FROM menu WHERE id=?";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setInt(1, m.getId());
        pstm.execute();
        desconectar();
    }

}
