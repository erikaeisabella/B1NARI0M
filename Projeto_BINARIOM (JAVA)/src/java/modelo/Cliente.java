package modelo;

import java.util.ArrayList;

public class Cliente {

    private String matricula;
    private String nome;
    private String cpf;
    private String setor;
    private String telefone;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void inserir() throws Exception {
        ClienteDAO cDAO = new ClienteDAO();
        cDAO.inserir(this);
    }

    public void alterar() throws Exception {
        ClienteDAO cDAO = new ClienteDAO();
        cDAO.alterar(this);
    }

    public ArrayList<Cliente> listar() throws Exception {
        ClienteDAO cDAO = new ClienteDAO();
        return cDAO.listar();
    }

    public void listarPorMatricula(String matricula) throws Exception {
        ClienteDAO cDAO = new ClienteDAO();
        this.setMatricula(cDAO.listarPorMatricula(matricula).getMatricula());
        this.setNome(cDAO.listarPorMatricula(matricula).getNome());
        this.setCpf(cDAO.listarPorMatricula(matricula).getCpf());
        this.setSetor(cDAO.listarPorMatricula(matricula).getSetor());
        this.setTelefone(cDAO.listarPorMatricula(matricula).getTelefone());
    }

    public void excluir() throws Exception {
        ClienteDAO cDAO = new ClienteDAO();
        cDAO.excluir(this);
    }
}
