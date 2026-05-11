package model;

import java.util.ArrayList;

/**
 * The type Utente.
 */
public class Utente {
    private String login;
    private String password;
    private ArrayList<Bacheca> bacheca;

    /**
     * Gets bacheca.
     *
     * @return the bacheca
     */
    public ArrayList<Bacheca> getBacheca() {
        return bacheca;
    }

    /**
     * Instantiates a new Utente.
     *
     * @param login    the login
     * @param password the password
     */
    public Utente(String login, String password) {
        this.login = login;
        this.password = password;
        bacheca = new ArrayList<>();
        bacheca.add(new Bacheca(TitoloBacheca.UNIVERSITA,"Università",this));
        bacheca.add(new Bacheca(TitoloBacheca.TEMPOLIBERO,"Tempo Libero",this));
        bacheca.add(new Bacheca(TitoloBacheca.LAVORO,"Lavoro",this));
    }

    /**
     * Login boolean.
     *
     * @param login    the login
     * @param password the password
     * @return the boolean
     */
    public boolean login(String login, String password) {
        return ( login.equals(this.login) && password.equals(this.password));
    }
}
