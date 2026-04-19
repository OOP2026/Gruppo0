package model;

import java.util.ArrayList;

public class Bacheca {
	public ArrayList<ToDo> getToDo() {
		return toDo;
	}

	private ArrayList<ToDo> toDo;

	public TitoloBacheca getTitolo() {
		return titolo;
	}

	public void setTitolo(TitoloBacheca titolo) {
		this.titolo = titolo;
	}

	private TitoloBacheca titolo;

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	private String descrizione;

	public Bacheca(TitoloBacheca titolo, String descrizione) {
		toDo = new ArrayList<>();
		this.titolo=titolo;
		this.descrizione=descrizione;

	}


}
