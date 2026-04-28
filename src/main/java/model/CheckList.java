package model;

import com.sun.tools.javac.comp.Check;

import java.util.ArrayList;

public class CheckList {
    private ArrayList<Attivita> checkList;

    public CheckList() {
        checkList = new ArrayList<Attivita>();
    }

    public void addAttivita(Attivita attivita) {
        checkList.add(attivita);
    }

}
