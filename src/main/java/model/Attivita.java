package model;

/**
 * The type Attivita.
 */
public class Attivita {
    private String nome;
    private StatoAttivita stato;

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets stato.
     *
     * @return the stato
     */
    public StatoAttivita getStato() {
        return stato;
    }

    /**
     * Sets stato.
     *
     * @param stato the stato
     */
    public void setStato(StatoAttivita stato) {
        this.stato = stato;
    }

    /**
     * Instantiates a new Attivita.
     *
     * @param nome  the nome
     * @param stato the stato
     */
    public Attivita(String nome, StatoAttivita stato) {
        this.nome = nome;
        this.stato = stato;
    }



}
