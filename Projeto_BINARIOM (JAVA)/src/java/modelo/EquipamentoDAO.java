package modelo;

import java.sql.*;
import java.util.ArrayList;

public class EquipamentoDAO extends Conexao {

    public void inserir(Equipamento e) throws Exception {
        conectar();
        String sql = "INSERT INTO equipamento (etiqueta,tipo,data_instalacao) VALUES (?,?,?)";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1, e.getEtiqueta());
        pstm.setString(2, e.getTipo());
        pstm.setString(3, e.getDataInstalacao());

        pstm.execute();
        desconectar();
    }
    
    public void alterar(Equipamento e) throws Exception {
        conectar();
        String sql = "UPDATE equipamento SET etiqueta=?, tipo=?, data_instalacao=? WHERE etiqueta=?";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1, e.getEtiqueta());
        pstm.setString(2, e.getTipo());
        pstm.setString(3, e.getDataInstalacao());
        pstm.setInt(4, e.getEtiqueta());

        pstm.execute();
        desconectar();

    }

    public ArrayList<Equipamento> listar() throws Exception {
        ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
        conectar();
        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery("SELECT * FROM equipamento");

        while (rs.next()) {
            Equipamento e = new Equipamento();
            e.setEtiqueta(rs.getInt("etiqueta"));
            e.setTipo(rs.getString("tipo"));
            e.setDataInstalacao(rs.getString("data_instalacao"));
            equipamentos.add(e);
        }

        desconectar();
        return equipamentos;
    }

    public Equipamento listarPorEtiqueta(int etiqueta) throws Exception {
        Equipamento e = new Equipamento();
        conectar();
        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery("SELECT * FROM equipamento WHERE etiqueta=" + etiqueta);

        while (rs.next()) {
            e.setEtiqueta(rs.getInt("etiqueta"));
            e.setTipo(rs.getString("tipo"));
            e.setDataInstalacao(rs.getString("data_instalacao"));
        }
        desconectar();
        return e;
    }

    public void excluir(Equipamento e) throws Exception {
        conectar();
        String sql = "DELETE FROM equipamento WHERE etiqueta=?";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1, e.getEtiqueta());

        pstm.execute();
        desconectar();
    }
}
