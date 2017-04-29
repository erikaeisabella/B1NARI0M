package modelo;

import java.sql.Date;
import java.util.ArrayList;

public class Chamado {

    private int bin;
    private String descricao;
    private String status;
    private String prioridade;
    private String localidade;
    private String observacao;
    private Equipamento equipamento;
    private Usuario usuario;
    private Date da;
    private String dr;

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void inserir() throws Exception {
        ChamadoDAO cDAO = new ChamadoDAO();
        cDAO.inserir(this);
    }

    public void alterar() {

    }

    public ArrayList<Chamado> listar() throws Exception {
        ChamadoDAO cDAO = new ChamadoDAO();
        return cDAO.listar();
    }

    public void listarPorBin(int bin) throws Exception {
        ChamadoDAO cDAO = new ChamadoDAO();
        this.setBin(cDAO.listarPorBin(bin).getBin());
        this.setDescricao(cDAO.listarPorBin(bin).getDescricao());
        this.setStatus(cDAO.listarPorBin(bin).getStatus());
        this.setPrioridade(cDAO.listarPorBin(bin).getPrioridade());
        this.setLocalidade(cDAO.listarPorBin(bin).getLocalidade());
        this.setObservacao(cDAO.listarPorBin(bin).getObservacao());
        this.setEquipamento(cDAO.listarPorBin(bin).getEquipamento());
        this.setUsuario(cDAO.listarPorBin(bin).getUsuario());
        this.setDr(cDAO.listarPorBin(bin).getDr());
    }

    public Date getDa() {
        return da;
    }

    public void setDa(Date da) {
        this.da = da;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }
}
