package org.model;

public class Funcionario {

    private String Nome;
    private String IDfuncionario;

    public Funcionario() {
        this.Nome = "";
        this.IDfuncionario ="";
    }

    public Funcionario(String nome, String IDfuncionario) {
        Nome = nome;
        this.IDfuncionario = IDfuncionario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getIDfuncionario() {
        return IDfuncionario;
    }

    public void setIDfuncionario(String IDfuncionario) {
        this.IDfuncionario = IDfuncionario;
    }
}
