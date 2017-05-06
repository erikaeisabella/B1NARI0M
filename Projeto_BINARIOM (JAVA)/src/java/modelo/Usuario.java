package modelo;

import java.util.ArrayList;

public class Usuario {

    private String matricula;
    private String nome;
    private String senha;
    private Perfil perfil;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public void inserir() throws Exception {
        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.inserir(this);
    }

    public void alterar() throws Exception {
        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.alterar(this);
    }
    
    public ArrayList<Usuario> listar() throws Exception{
        UsuarioDAO uDAO = new UsuarioDAO();
        return uDAO.listar();
    }
    
    public void excluir ()throws Exception{
        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.excluir(this);
    }

}
