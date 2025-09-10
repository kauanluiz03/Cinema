package org.model;

public class Sessão {
    private String NomeFilme;
    private String FimFilme;

    public Sessão() {
        this.NomeFilme = "";
        this.FimFilme = "";
    }

    public Sessão(String nomeFilme, String fimFilme) {
        NomeFilme = nomeFilme;
        FimFilme = fimFilme;
    }

    public String getNomeFilme() {
        return NomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        NomeFilme = nomeFilme;
    }

    public String getFimFilme() {
        return FimFilme;
    }

    public void setFimFilme(String fimFilme) {
        FimFilme = fimFilme;
    }
}
