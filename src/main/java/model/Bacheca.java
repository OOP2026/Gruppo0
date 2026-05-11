package model;

import java.util.ArrayList;

/**
 * Classe Bacheca che contiene un elenco di ToDo
 */
public class Bacheca {
	private ArrayList<ToDo> toDo;
	private TitoloBacheca titolo;
	private Utente proprietario;
	private String descrizione;

    /**
     * Gets to do.
     *
     * @return the to do
     */
    public ArrayList<ToDo> getToDo() {
		return toDo;
	}

    /**
     * Sets to do.
     *
     * @param toDo the to do
     */
    public void setToDo(ArrayList<ToDo> toDo) {
		this.toDo = toDo;
	}

    /**
     * Gets titolo.
     *
     * @return the titolo
     */
    public TitoloBacheca getTitolo() {
		return titolo;
	}

    /**
     * Sets titolo.
     *
     * @param titolo the titolo
     */
    public void setTitolo(TitoloBacheca titolo) {
		this.titolo = titolo;
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
     * Gets proprietario.
     *
     * @return the proprietario
     */
    public Utente getProprietario() {
		return proprietario;
	}

    /**
     * Sets proprietario.
     *
     * @param proprietario the proprietario
     */
    public void setProprietario(Utente proprietario) {
		this.proprietario = proprietario;
	}


    /**
     * Instantiates a new Bacheca.
     *
     * @param titolo       the titolo
     * @param descrizione  the descrizione
     * @param proprietario the proprietario
     */
    public Bacheca(TitoloBacheca titolo, String descrizione, Utente proprietario) {
		toDo = new ArrayList<>();
		this.titolo=titolo;
		this.descrizione=descrizione;
		this.proprietario=proprietario;
	}

    /**
     * Add todo int.
     *
     * @param todo the todo
     * @return the int
     */
    public int addTodo(ToDo todo){
		this.toDo.add(todo);
		return toDo.size()-1;
	}


}
