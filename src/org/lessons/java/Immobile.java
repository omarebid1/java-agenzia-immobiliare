package org.lessons.java;

public class Immobile {

    //  ATTRIBUTI
    private String codiceAlfanumerico, indirizzo, citta;
    private int cap, superficie;
    private int personeInteressanti = 0;

    //  COSTRUTTORI
    public Immobile(String codiceAlfanumerico, String indirizzo, String citta, int cap, int superficie) {

        personeInteressanti();

        this.codiceAlfanumerico = codiceAlfanumerico;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.cap = cap;
        reimpostaSuperfici(superficie);

    }


    //  SETTERS & GETTERS
    public String getCodiceAlfanumerico() {
        return codiceAlfanumerico;
    }

    public void setCodiceAlfanumerico(String codiceAlfanumerico) {
        this.codiceAlfanumerico = codiceAlfanumerico;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    //  METODI

    public void personeInteressanti(){
        this.personeInteressanti++;
    }

    public void reimpostaSuperfici(int superficie){

        setSuperficie(superficie);

    }

    @Override
    public String toString() {
        return "Immobile{" +
                "codiceAlfanumerico='" + codiceAlfanumerico + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", citta='" + citta + '\'' +
                ", cap=" + cap +
                ", superficie=" + superficie +
                '}';
    }
}
