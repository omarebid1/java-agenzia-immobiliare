package org.lessons.java;

public class Box extends Immobile{

    //  ATTRIBUTI
    private int nPostiAuto;


    //  COSTRUTTORI
    public Box(String codiceAlfanumerico, String indirizzo, String citta, int cap, int superficie, int nPostiAuto) {
        super(codiceAlfanumerico, indirizzo, citta, cap, superficie);
        this.nPostiAuto = nPostiAuto;
    }

    //  SETTERS & GETTERS

    public int getnPostiAuto() {
        return nPostiAuto;
    }

    public void setnPostiAuto(int nPostiAuto) {
        this.nPostiAuto = nPostiAuto;
    }


    // METODI


    @Override
    public String toString() {
        return "Box{" +
                "nPostiAuto=" + nPostiAuto +
                '}';
    }
}
