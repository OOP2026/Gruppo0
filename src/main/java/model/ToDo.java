package model;

import java.util.ArrayList;

public class ToDo {
    private ArrayList<Utente> condiviso = new ArrayList<Utente>();
    private Bacheca bacheca;

    public ToDo (Bacheca bacheca) {
        this.bacheca = bacheca;
    }

    public void condivisione(Utente utente) {
        condiviso.add(utente);
    }

}
