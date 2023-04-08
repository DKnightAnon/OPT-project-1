package Offerte;

import Opties.Optie;

import java.util.ArrayList;

public class OfferteNieuw {

    public ArrayList<Optie> geselecteerdeOpties = new ArrayList<Optie>();

    public void printGeselecteerdeOpties(){
        for (int i = 0; i<202;i++) {
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
        for (int i = 0; i<202;i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0;i<geselecteerdeOpties.size();i++) {
            System.out.printf("|%-15d| %-20s| %-20s| %-100s| %-10s| %-25s|%n",
                    i+1,
                    geselecteerdeOpties.get(i).getIsEssentieel(),
                    geselecteerdeOpties.get(i).getNaam(),
                    geselecteerdeOpties.get(i).getBeschrijving(),
                    geselecteerdeOpties.get(i).getPrijs(),
                    geselecteerdeOpties.get(i).getMiliuekorting()
                    );
        }
        for (int i = 0; i<202;i++) {
            System.out.print("-");
        }
        System.out.println();

    }

}
