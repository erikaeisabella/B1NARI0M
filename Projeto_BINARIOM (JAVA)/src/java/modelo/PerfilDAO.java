package modelo;

import java.sql.*;
import java.util.ArrayList;

public class PerfilDAO extends Conexao {

    public void inserir(Perfil p) throws Exception {
        conectar();
        PreparedStatement pstm = con.prepareStatement("INSERT INTO perfil (nome, descricao) VALUE (?,?)");

        pstm.setString(1, p.getNome());
        pstm.setString(2, p.getDescricao());
        
        pstm.execute();
        desconectar();

    }

    public ArrayList<Perfil> listar() throws Exception {

        ArrayList<Perfil> perfis = new ArrayList<Perfil>();

        conectar();
        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery("SELECT * FROM perfil");

        while (rs.next()) {
            Perfil p = new Perfil();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setDescricao(rs.getString("descricao"));
            perfis.add(p);
        }
        desconectar();
        return perfis;
    }
        public ArrayList<Perfil> listarPerfis() throws Exception {

        ArrayList<Perfil> perfis = new ArrayList<Perfil>();

        conectar();
        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery("SELECT id, nome FROM perfil");

        while (rs.next()) {
            Perfil p = new Perfil();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            perfis.add(p);
        }
        desconectar();
        return perfis;
    }

    public Perfil listarPorId(int id) throws Exception {
        Perfil p = new Perfil();

        conectar();
        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery("SELECT * FROM perfil WHERE id=" + id);

        if (rs.next()) {
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
        }
        desconectar();
        return p;
    }

    public void alterar(Perfil p) throws Exception {

        conectar();
        PreparedStatement pstm = con.prepareStatement("UPDATE perfil SET nome=?, descricao=? WHERE id = ?");

        pstm.setString(1, p.getNome());
        pstm.setString(1, p.getDescricao());
        pstm.setInt(3, p.getId());

        pstm.execute();
        desconectar();
    }

    public void excluir(Perfil p) throws Exception {
        conectar();
        String sql = "DELETE FROM perfil WHERE id=?";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1, p.getId());

        pstm.execute();
        desconectar();
    }
}
