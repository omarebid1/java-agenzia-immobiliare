package org.lessons.java;

public class Abitazione extends Immobile{

    //  ATTRIBUTI
    private int nVani, nBagni;

    //COSTRUTTORI
    public Abitazione(String codiceAlfanumerico, String indirizzo, String citta, int cap, int superficie, int nVani, int nBagni) {
        super(codiceAlfanumerico, indirizzo, citta, cap, superficie);
        this.nVani = nVani;
        this.nBagni = nBagni;
    }

    //  SETTERS & GETTERS

    public int getnVani() {
        return nVani;
    }

    public void setnVani(int nVani) {
        this.nVani = nVani;
    }

    public int getnBagni() {
        return nBagni;
    }

    public void setnBagni(int nBagni) {
        this.nBagni = nBagni;
    }


    //  METODI


    @Override
    public String toString() {
        return "Abitazione{" +
                "nVani=" + nVani +
                ", nBagni=" + nBagni +
                '}';
    }
}
