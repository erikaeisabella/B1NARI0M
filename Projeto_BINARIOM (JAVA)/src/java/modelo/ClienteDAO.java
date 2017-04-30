package modelo;

import java.sql.*;
import java.util.ArrayList;

public class ClienteDAO extends Conexao {

    public void inserir(Cliente c) throws Exception {
        conectar();
        String sql = "INSERT INTO cliente (matricula, nome, cpf, setor, telefone)"
                + "VALUES (?,?,?,?,?)";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, c.getMatricula());
        pstm.setString(2, c.getNome());
        pstm.setString(3, c.getCpf());
        pstm.setString(4, c.getSetor());
        pstm.setInt(5, c.getTelefone());

        pstm.execute();
        desconectar();

    }

    public void alterar(Cliente c) throws Exception {
        conectar();
        String sql = "UPDATE cliente SET matricula=?, nome=?, cpf=?, setor=?, telefone=? WHERE matricula = ?";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, c.getMatricula());
        pstm.setString(2, c.getNome());
        pstm.setString(3, c.getCpf());
        pstm.setString(4, c.getSetor());
        pstm.setInt(5, c.getTelefone());
        pstm.setString(6, c.getMatricula());

        pstm.execute();
        desconectar();
    }

    public ArrayList<Cliente> listar() throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        conectar();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM cliente");

        while (rs.next()) {
            Cliente c = new Cliente();
            c.setMatricula(rs.getString("matricula"));
            c.setNome(rs.getString("nome"));
            c.setCpf(rs.getString("cpf"));
            c.setSetor(rs.getString("setor"));
            c.setTelefone(rs.getInt("telefone"));
            clientes.add(c);
        }
        desconectar();
        return clientes;
    }

    public Cliente listarPorMatricula(String matricula) throws Exception {
        Cliente c = new Cliente();
        conectar();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM cliente WHERE matricula=" + matricula);

        if (rs.next()) {
            c.setMatricula(rs.getString("matricula"));
            c.setNome(rs.getString("nome"));
            c.setCpf(rs.getString("cpf"));
            c.setSetor(rs.getString("setor"));
            c.setTelefone(rs.getInt("telefone"));
        }
        desconectar();
        return c;
    }

    public void excluir(Cliente c) throws Exception {
        conectar();
        String sql = "DELETE FROM cliente WHERE matricula = ? ";

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, c.getMatricula());

        pstm.execute();
        desconectar();
    }
}
