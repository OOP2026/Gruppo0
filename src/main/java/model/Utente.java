package model;

import java.util.ArrayList;

public class Utente {
    private String login;
    private String password;

    public ArrayList<Bacheca> getBacheca() {
        return bacheca;
    }

    private ArrayList<Bacheca> bacheca;

    public Utente(String login, String password) {
        this.login = login;
        this.password = password;
        bacheca = new ArrayList<>();
        bacheca.add(new Bacheca(TitoloBacheca.UNIVERSITA,"Università",this));
        bacheca.add(new Bacheca(TitoloBacheca.TEMPOLIBERO,"Tempo Libero",this));
        bacheca.add(new Bacheca(TitoloBacheca.LAVORO,"Lavoro",this));
    }

    public boolean login(String login, String password) {
        return ( login.equals(this.login) && password.equals(this.password));
    }
}
