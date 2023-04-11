package Offerte;

import Klant_types.Klant;
import Opties.Optie;

import java.util.ArrayList;

public class OfferteNieuw {

    private Klant geselecteerdeKlant;

    public ArrayList<Optie> geselecteerdeOpties = new ArrayList<Optie>();

    public void addKlant(Klant klant){
        this.geselecteerdeKlant = klant;
    }

    public void removeKlant(){
        this.geselecteerdeKlant = null;
    }
    public void printKlant(){

        for (int i = 0;i<202;i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("| %-15s| %-20s| %-10s|",
                "Klanttype nr.",
                "Klant type",
                "Klant korting %",
                " "
        );
        for (int i = 0;i<144;i++){
            System.out.print(" ");
        }
        System.out.print("|\n");

    }

    public void printGeselecteerdeOpties() {
        for (int i = 0; i < 202; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s| %-20s| %-20s| %-100s| %-10s| %-25s|%n",
                "Optie nr.",
                "Essentiele optie",
                "Naam",
                "Beschrijving",
                "Prijs",
                "Milieukorting"
        );
        for (int i = 0; i < 202; i++) {
            System.out.print("-");
        }
        System.out.println();
        if (geselecteerdeOpties.isEmpty()) {
            System.out.printf("|%140s|\n", " ");

        } else {
            for (int i = 1; i < geselecteerdeOpties.size(); i++) {
                System.out.printf("|%-15d| %-20s| %-20s| %-100s| %-10s| %-25s|%n",
                        i + 1,
                        geselecteerdeOpties.get(i).getIsEssentieel(),
                        geselecteerdeOpties.get(i).getNaam(),
                        geselecteerdeOpties.get(i).getBeschrijving(),
                        geselecteerdeOpties.get(i).getPrijs(),
                        geselecteerdeOpties.get(i).getMiliuekorting()
                );
            }
        }
            for (int i = 0; i < 202; i++) {
                System.out.print("-");
            }
            System.out.println();

        }


}
