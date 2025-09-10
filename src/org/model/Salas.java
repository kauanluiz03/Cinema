package org.model;

public class Salas {
    private int Qtdeassentos;
    private int numerodasala;

    public Salas() {
        Qtdeassentos = 0;
        this.numerodasala = 0;
    }

    public Salas(int qtdeassentos, int numerodasala) {
        Qtdeassentos = qtdeassentos;
        this.numerodasala = numerodasala;
    }

    public int getQtdeassentos() {
        return Qtdeassentos;
    }

    public void setQtdeassentos(int qtdeassentos) {
        Qtdeassentos = qtdeassentos;
    }

    public int getNumerodasala() {
        return numerodasala;
    }

    public void setNumerodasala(int numerodasala) {
        this.numerodasala = numerodasala;
    }
}
