package model;

import java.util.ArrayList;

public class Bacheca {
	private ArrayList<ToDo> toDo;
	private TitoloBacheca titolo;
	private Utente proprietario;
	private String descrizione;

	public ArrayList<ToDo> getToDo() {
		return toDo;
	}

	public void setToDo(ArrayList<ToDo> toDo) {
		this.toDo = toDo;
	}

	public TitoloBacheca getTitolo() {
		return titolo;
	}

	public void setTitolo(TitoloBacheca titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Utente getProprietario() {
		return proprietario;
	}

	public void setProprietario(Utente proprietario) {
		this.proprietario = proprietario;
	}


	public Bacheca(TitoloBacheca titolo, String descrizione, Utente proprietario) {
		toDo = new ArrayList<>();
		this.titolo=titolo;
		this.descrizione=descrizione;
		this.proprietario=proprietario;
	}

	public int addTodo(ToDo todo){
		this.toDo.add(todo);
		return toDo.size()-1;
	}


}
