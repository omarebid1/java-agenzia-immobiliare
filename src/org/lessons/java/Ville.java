package org.lessons.java;

public class Ville extends Abitazione {

    //  ATTRIBUTI
    private int dimGiardino;

    //  COSTRUTTORI
    public Ville(String codiceAlfanumerico, String indirizzo, String citta, int cap, int superficie, int nVani, int nBagni, int dimGiardino) {
        super(codiceAlfanumerico, indirizzo, citta, cap, superficie, nVani, nBagni);
        this.dimGiardino = dimGiardino;
    }

    //  SETTERS & GETTERS

    public int getDimGiardino() {
        return dimGiardino;
    }

    public void setDimGiardino(int dimGiardino) {
        this.dimGiardino = dimGiardino;
    }


    //  METODI


    @Override
    public String toString() {
        return super.toString() + "Ville{" +
                "dimGiardino=" + dimGiardino +
                '}';
    }
}
