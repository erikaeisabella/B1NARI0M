package modelo;

import java.util.ArrayList;

public class Equipamento {

    private int etiqueta;
    private String tipo;
    private String dataInstalacao;

    public int getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(String dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }

    //Metodos da DAO
    public void inserir() throws Exception {
        EquipamentoDAO eDAO = new EquipamentoDAO();
        eDAO.inserir(this);
    }

    public void alterar() throws Exception {
        EquipamentoDAO eDAO = new EquipamentoDAO();
        eDAO.alterar(this);
    }

    public void listarPorEtiqueta(int etiqueta) throws Exception {
        EquipamentoDAO eDAO = new EquipamentoDAO();
        this.setEtiqueta(eDAO.listarPorEtiqueta(etiqueta).getEtiqueta());
        this.setTipo(eDAO.listarPorEtiqueta(etiqueta).getTipo());
        this.setDataInstalacao(eDAO.listarPorEtiqueta(etiqueta).getDataInstalacao());
    }

    public ArrayList<Equipamento> listar() throws Exception{
        EquipamentoDAO eDAO = new EquipamentoDAO();
        return eDAO.listar();
    }

    public void excluir() throws Exception {
        EquipamentoDAO eDAO = new EquipamentoDAO();
        eDAO.excluir(this);
    }

}
