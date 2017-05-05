package modelo;

import java.sql.*;
import java.util.ArrayList;

public class ChamadoDAO extends Conexao {

    public void inserir(Chamado c) throws Exception {
        conectar();
        String sql = "INSERT INTO chamado (descricao,localidade,equipamento_etiqueta) VALUES (?,?,?)";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, c.getDescricao());
        pstm.setString(2, c.getLocalidade());
        pstm.setInt(3, c.getEquipamento().getEtiqueta());

        pstm.execute();
        desconectar();
    }

    public void cancelar(Chamado c) throws Exception {
        conectar();
        String sql = "UPDATE chamado SET status=? WHERE bin=?";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, c.getStatus());
        pstm.setInt(2, c.getBin());

        pstm.execute();
        desconectar();
    }

    public ArrayList<Chamado> listarAbertos() throws Exception {
        
        ArrayList<Chamado> chamados = new ArrayList<Chamado>();
        conectar();
        Statement stm = con.createStatement();
        
        ResultSet rs = stm.executeQuery("SELECT * FROM chamado WHERE status='Aberto'");

        while (rs.next()) {
            Chamado c = new Chamado();
            c.setBin(rs.getInt("bin"));
            c.setDescricao(rs.getString("descricao"));
            c.setStatus(rs.getString("status"));
            c.setPrioridade(rs.getString("prioridade"));
            c.setLocalidade(rs.getString("localidade"));
                java.sql.Date dataAber = rs.getDate("data_abertura");
                java.util.Date da = new java.util.Date(dataAber.getTime());
            c.setDa(da);
            chamados.add(c);
        }
        return chamados;
    }

    public ArrayList<Chamado> listarEmAndamento() throws Exception {
        ArrayList<Chamado> chamados = new ArrayList<Chamado>();
                conectar();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM chamado WHERE status=" + "");

        while (rs.next()) {
            Chamado c = new Chamado();
            EquipamentoDAO eDAO = new EquipamentoDAO();
            UsuarioDAO uDAO = new UsuarioDAO();
            c.setBin(rs.getInt("bin"));
            c.setDescricao(rs.getString("descricao"));
            c.setStatus(rs.getString("status"));
            c.setPrioridade(rs.getString("prioridade"));
            c.setLocalidade(rs.getString("localidade"));
            c.setObservacao(rs.getString("observacao"));
            java.sql.Date dataAber = rs.getDate("data_abertura");
            java.util.Date da = new java.util.Date(dataAber.getTime());
            c.setDa(da);
            c.setEquipamento(eDAO.listarPorEtiqueta(rs.getInt("equipamento_etiqueta")));
            c.setUsuario(uDAO.listarPorMatricula(rs.getString("usuario_matricula")));
            chamados.add(c);
        }
        return chamados;
    }

    public Chamado listarPorBin(int bin) throws Exception {
        Chamado c = new Chamado();
                conectar();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM chamado WHERE bin=" + bin);

        while (rs.next()) {
            EquipamentoDAO eDAO = new EquipamentoDAO();
            UsuarioDAO uDAO = new UsuarioDAO();
            c.setBin(rs.getInt("bin"));
            c.setDescricao(rs.getString("descricao"));
            c.setStatus(rs.getString("status"));
            c.setPrioridade(rs.getString("prioridade"));
            c.setLocalidade(rs.getString("localidade"));
            java.sql.Date dataAber = rs.getDate("data_abertura");
            java.util.Date da = new java.util.Date(dataAber.getTime());
            c.setDa(da);
            c.setEquipamento(eDAO.listarPorEtiqueta(rs.getInt("equipamento_etiqueta")));
            c.setUsuario(uDAO.listarPorMatricula(rs.getString("matricula")));
        }
        desconectar();
        return c;
    }

    //Acões especificas: abertos, em anadamento, cancelados e concluídos
    //NÃO TESTADOS
    public int abertos() throws Exception {
        int num = 0;
        conectar();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT count(status) FROM chamado WHERE status=" + "Aberto");

        if (rs.next()) {
            num = rs.getInt("status");
        }
        return num;
    }

    public int emAndamento() throws Exception {
        int num = 0;
        conectar();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT count(status) FROM chamado WHERE status=" + "em andamento");

        if (rs.next()) {
            num = rs.getInt("status");
        }
        return num;
    }

    public int canceladas() throws Exception {
        int num = 0;
        conectar();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT count(status) FROM chamado WHERE status=" + "cancelado");

        if (rs.next()) {
            num = rs.getInt("status");
        }
        return num;
    }

    public int concluidos() throws Exception {
        int num = 0;
        conectar();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT count(status) FROM chamado WHERE status=" + "concluido");

        if (rs.next()) {
            num = rs.getInt("status");
        }
        return num;
    }

}
