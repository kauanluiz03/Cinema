package org.model;

import java.util.List;

public class Cinema {
    private String salas;
    private List<Cinema> listSalas;

    public Cinema() {
        this.salas = "";
        this.listSalas = listSalas;
    }

    public Cinema(String salas, List<Cinema> listSalas) {
        this.salas = salas;
        this.listSalas = listSalas;
    }

    public String getSalas() {
        return salas;
    }

    public void setSalas(String salas) {
        this.salas = salas;
    }

    public List<Cinema> getListSalas() {
        return listSalas;
    }

    public void setListSalas(List<Cinema> listSalas) {
        this.listSalas = listSalas;
    }
}
