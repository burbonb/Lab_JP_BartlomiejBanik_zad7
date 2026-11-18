package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Produkt> produkty = new ArrayList<>();

        produkty.add(new Produkt("Laptop", 3500));
        produkty.add(new Produkt("Telefon", 2000));
        produkty.add(new Produkt("Monitor", 1200));
        produkty.add(new Produkt("Klawiatura", 300));

        Collections.sort(produkty);

        System.out.println("Sortowanie według nazwy:");

        for (Produkt produkt : produkty) {
            System.out.println(produkt);
        }

        produkty.sort((p1, p2) ->
                Double.compare(p1.cena, p2.cena));

        System.out.println("\nSortowanie według ceny:");

        for (Produkt produkt : produkty) {
            System.out.println(produkt);
        }
    }
}