package org.model;
import org.meiaInteira;

public class Ingresso {

    private int Codigo;
    private double preço;
    private Enum<meiaInteira>tipoIngresso;

    public Ingresso() {
        this.Codigo = 0;
        this.preço = 0.0;
        this.tipoIngresso = tipoIngresso;
    }

    public Ingresso(int codigo, double preço, Enum<meiaInteira> tipoIngresso) {
        Codigo = codigo;
        this.preço = preço;
        this.tipoIngresso = tipoIngresso;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public Enum<meiaInteira> getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(Enum<meiaInteira> tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
}
