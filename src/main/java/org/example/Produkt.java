package org.example;

public class Produkt implements Comparable<Produkt> {

    String nazwa;
    double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    @Override
    public int compareTo(Produkt inny) {
        return nazwa.compareTo(inny.nazwa);
    }

    @Override
    public String toString() {
        return nazwa + " - " + cena + " zł";
    }
}
