package com.track.trackandfield;

import java.util.List;

public class RelayTeam<T> {

    private String name;
    private String element;
    private double pb;

    private T gender;

    public RelayTeam(String name, String element, double pb, T gender) {
        this.name = name;
        this.element = element;
        this.pb = pb;
    }

    public String getName() {
        return name;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void setPb(double pb){
        this.element = element;
    }

    public double getPb() {
        return pb;
    }

    RelayTeam <String> atleet1 = new RelayTeam ("Sander", "100 meter", 9.98, "male");
    RelayTeam <String> atleet2 = new RelayTeam ("Carlos", "100 meter", 9.99, "male");
    RelayTeam <String> atleet3 = new RelayTeam ("Mark",   "100 meter", 10.22, "male");
    RelayTeam <String> atleet4 = new RelayTeam ("Simon",  "100 meter", 10.17, "male");
    RelayTeam <String> atleet5 = new RelayTeam ("James",  "100 meter", 9.98, "male");
    RelayTeam <String> atleet6 = new RelayTeam ("Bas",    "100 meter", 10.99, "male");
    RelayTeam <String> atleet7 = new RelayTeam ("Daphne",   "100 meter", 10.88, "female");
    RelayTeam <String> atleet8 = new RelayTeam ("Sanne", "100 meter", 10.00, "female");



}
