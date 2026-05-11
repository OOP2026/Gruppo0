package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * The type To do.
 */
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

    /**
     * Gets colore.
     *
     * @return the colore
     */
    public String getColore() {
        return colore;
    }

    /**
     * Sets colore.
     *
     * @param colore the colore
     */
    public void setColore(String colore) {
        this.colore = colore;
    }

    /**
     * Gets titolo.
     *
     * @return the titolo
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Sets titolo.
     *
     * @param titolo the titolo
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * Gets data scadenza.
     *
     * @return the data scadenza
     */
    public Date getDataScadenza() {
        return dataScadenza;
    }

    /**
     * Sets data scadenza.
     *
     * @param dataScadenza the data scadenza
     */
    public void setDataScadenza(Date dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets descrizione.
     *
     * @return the descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets descrizione.
     *
     * @param descrizione the descrizione
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * Gets immagine.
     *
     * @return the immagine
     */
    public String getImmagine() {
        return immagine;
    }

    /**
     * Sets immagine.
     *
     * @param immagine the immagine
     */
    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    /**
     * Gets stato.
     *
     * @return the stato
     */
    public StatoToDo getStato() {
        return stato;
    }

    /**
     * Sets stato.
     *
     * @param stato the stato
     */
    public void setStato(StatoToDo stato) {
        this.stato = stato;
    }

    /**
     * Gets bacheca.
     *
     * @return the bacheca
     */
    public Bacheca getBacheca() {
        return bacheca;
    }


    /**
     * Instantiates a new To do.
     *
     * @param bacheca     the bacheca
     * @param descrizione the descrizione
     * @param titolo      the titolo
     * @param url         the url
     * @param immagine    the immagine
     * @param stato       the stato
     * @param colore      the colore
     */
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

    /**
     * Condivisione.
     *
     * @param utente the utente
     */
    public void condivisione(Utente utente) {
        condiviso.add(utente);
    }

    /**
     * Add check list.
     */
    public void addCheckList() {
        this.checklist  = new CheckList();
    }

    /**
     * Remove check list.
     */
    public void removeCheckList() {
        this.checklist  = null;
    }
}
