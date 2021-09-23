package hu.petrik;

import java.util.Date;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;
    private String[] szul;
    private Date szulDate;

    public Ember(String nev, String szulDatum, String szulHely){
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
        this.szul = szulDatum.split("-");
        this.szulDate = new Date(Integer.parseInt(this.szul[0]),Integer.parseInt(this.szul[1]),Integer.parseInt(this.szul[2]));
    }

    public String getNev() {
        return nev;
    }

    public String getSzulDatum() {
        return szulDatum;
    }

    public String getSzulHely() {
        return szulHely;
    }

    public int szulEv(){
        return Integer.parseInt(szul[0]);
    }

    public int szulHonap(){
        return Integer.parseInt(szul[1]);
    }

    public int szulNap(){
        return Integer.parseInt(szul[2]);
    }

    public int eletkor(){
        Date d = new Date();
        int jelenlegiEv = d.getYear() + 1900;
        return jelenlegiEv - this.szulEv();
    }

    @Override
    public String toString() {
        return "Név: " + this.nev +
                ", Született: " + this.szulDatum +
                ", Születési hely: " + this.szulHely;
    }
}
