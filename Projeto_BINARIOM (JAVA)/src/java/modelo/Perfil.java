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
    
    public void inserir() throws Exception {
        PerfilDAO pDAO = new PerfilDAO();
        pDAO.inserir(this);
    }

    public void alterar() throws Exception {
        PerfilDAO pDAO = new PerfilDAO();
        pDAO.alterar(this);
    }

    public ArrayList<Perfil> listar() throws Exception {
        PerfilDAO pDAO = new PerfilDAO();
        return pDAO.listar();
    }

    public void excluir() throws Exception {
        PerfilDAO pDAO = new PerfilDAO();
        pDAO.excluir(this);
    }
}
