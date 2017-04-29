package modelo;

import java.util.ArrayList;

public class Perfil {

    private int id;
    private String nome;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void insere() throws Exception {
        PerfilDAO pDAO = new PerfilDAO();
        pDAO.inserir(this);
    }

    public void altera() throws Exception {
        PerfilDAO pDAO = new PerfilDAO();
        pDAO.alterar(this);
    }

    public ArrayList<Perfil> listar() throws Exception {
        PerfilDAO pDAO = new PerfilDAO();
        return pDAO.listar();
    }

    public void listarPorId(int id) throws Exception {
        PerfilDAO pDAO = new PerfilDAO();
        this.setId(pDAO.listarPorId(id).getId());
        this.setNome(pDAO.listarPorId(id).getNome());
    }

    public void exclui() throws Exception {
        PerfilDAO pDAO = new PerfilDAO();
        pDAO.excluir(this);
    }
}
