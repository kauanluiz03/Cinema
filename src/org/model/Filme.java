package org.model;

import java.util.List;

public class Filme {

    private String Titulo;
    private int Duração;
    private String IniciodoFilme;
    private List<Filme> listhorarios;

    public Filme() {
        this.Titulo = "";
        this.Duração = 0;
        this.IniciodoFilme = "";
        this.listhorarios = listhorarios;
    }

    public Filme(String titulo, int duração, String iniciodoFilme, List<Filme> listhorarios) {
        Titulo = titulo;
        Duração = duração;
        IniciodoFilme = iniciodoFilme;
        this.listhorarios = listhorarios;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getDuração() {
        return Duração;
    }

    public void setDuração(int duração) {
        Duração = duração;
    }

    public String getIniciodoFilme() {
        return IniciodoFilme;
    }

    public void setIniciodoFilme(String iniciodoFilme) {
        IniciodoFilme = iniciodoFilme;
    }

    public List<Filme> getListhorarios() {
        return listhorarios;
    }

    public void setListhorarios(List<Filme> listhorarios) {
        this.listhorarios = listhorarios;
    }
}
