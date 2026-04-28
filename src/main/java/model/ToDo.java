package model;

import java.util.ArrayList;
import java.util.Date;

public class ToDo {
    private ArrayList<Utente> condiviso = new ArrayList<Utente>();
    private Bacheca bacheca;



    private String titolo;
    private Date dataScadenza;
    private int posizione;
    private String url;
    private String descrizione;
    private String immagine;
    private StatoToDo stato;
    private CheckList checklist=null;
    private String colore;

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(Date dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getImmagine() {
        return immagine;
    }

    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    public StatoToDo getStato() {
        return stato;
    }

    public void setStato(StatoToDo stato) {
        this.stato = stato;
    }

    public Bacheca getBacheca() {
        return bacheca;
    }


    public ToDo (Bacheca bacheca, String descrizione, String titolo, String url, String immagine, StatoToDo stato, String colore) {
        this.bacheca = bacheca;
        this.descrizione=descrizione;
        this.titolo=titolo;
        this.url=url;
        this.immagine=immagine;
        this.stato=stato;
        this.colore=colore;
        this.posizione = bacheca.addTodo(this);
    }

    public void condivisione(Utente utente) {
        condiviso.add(utente);
    }

    public void addCheckList() {
        this.checklist  = new CheckList();
    }

    public void removeCheckList() {
        this.checklist  = null;
    }
}
