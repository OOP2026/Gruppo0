package model;

import java.util.ArrayList;

/**
 * The type Check list.
 */
public class CheckList {
    private ArrayList<Attivita> checkList;

    /**
     * Instantiates a new Check list.
     */
    public CheckList() {
        checkList = new ArrayList<Attivita>();
    }

    /**
     * Add attivita.
     *
     * @param attivita the attivita
     */
    public void addAttivita(Attivita attivita) {
        checkList.add(attivita);
    }

}
