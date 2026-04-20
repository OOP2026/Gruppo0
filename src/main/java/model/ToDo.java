package model;

import java.util.ArrayList;

public class ToDo {
    private ArrayList<Utente> condiviso = new ArrayList<Utente>();
    private String descrizione;

    public Bacheca getBacheca() {
        return bacheca;
    }

    private Bacheca bacheca;

    public ToDo (Bacheca bacheca, String descrizione) {
        this.bacheca = bacheca;
        this.descrizione=descrizione;
    }

    public void condivisione(Utente utente) {
        condiviso.add(utente);
    }

}
