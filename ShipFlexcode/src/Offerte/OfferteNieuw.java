package Offerte;

import Commands.TextColors;
import Klant_types.Klant;
import Opties.Optie;

import java.util.ArrayList;

public class OfferteNieuw {

    private Klant geselecteerdeKlant = new Klant(null,null);

    public ArrayList<Optie> geselecteerdeOpties = new ArrayList<Optie>();

    public void addKlant(Klant klant){
        this.geselecteerdeKlant = klant;
    }

    public void removeKlant(){
        this.geselecteerdeKlant = new Klant(null,null);
    }

    public void printKlant(){

        printTableHorizontalBorder();
        System.out.printf("| %-30s| %-20s| %-10s|",
                "Klantnaam",
                "Klant type",
                "Klant korting %",
                " "
        );
        for (int i = 0;i<129;i++){
            System.out.print(" ");
        }
        System.out.print("|\n");
        printTableHorizontalBorder();
        if (geselecteerdeKlant.isEmpty()){
            System.out.printf("|%-200s|%n"," ");
        }else{
            System.out.printf(
                    "| %-30s| %-20s| %-10s|",
                    geselecteerdeKlant.getKlantNaam(),
                    geselecteerdeKlant.getKlantSoort().getKlantSoort(),
                    geselecteerdeKlant.getKlantSoort().getKlantKorting()
            );
        }

    }

    public void printGeselecteerdeOpties() {
        printTableHorizontalBorder();
        System.out.printf("|%-15s| %-20s| %-20s| %-100s| %-10s| %-25s|%n",
                "Optie nr.",
                "Essentiele optie",
                "Naam",
                "Beschrijving",
                "Prijs",
                "Milieukorting"
        );
        printTableHorizontalBorder();
        if (geselecteerdeOpties.size()==1) {
            System.out.printf("|%200s|\n", " ");

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
        printTableHorizontalBorder();

        }


    public void printPrijsBerekening(){
        double prijsVoorAftrek = 0;
        //Bereken totaal prijs voor korting
        for (int i = 1; i < geselecteerdeOpties.size(); i++) {
            prijsVoorAftrek += geselecteerdeOpties.get(i).getPrijs();
        }
        double prijsNaAftrekMillieuKorting = 0;
        double prijsNaAftrekKlantKorting = 0;
        String prijsMessage = "Prijs voor aftrek kortingen : ";
        String prijsMessageMilieu = "Prijs na aftrek millieukortingen";
        String prijsMessageKlant = "Prijs na aftrek klantkorintg";

        System.out.printf("|%-200s|%n","Prijsberekening");
        printTableHorizontalBorder();

        if (prijsVoorAftrek == 0){
            System.out.printf("|%200s|\n", " ");
        } else if (geselecteerdeKlant.isEmpty())
        {
            System.out.printf("|%209s|\n",
                    TextColors.Text.ANSI_YELLOW+"Voeg eerst een klant toe!"+TextColors.Text.ANSI_RESET);

        } else {
            //Bereken totaalprijs na aftrek millieukorting per onderdeel
            for (int i = 1; i < geselecteerdeOpties.size(); i++) {
                prijsNaAftrekMillieuKorting += geselecteerdeOpties.get(i).getPrijsMinKorting();
            }

            //Bereken totaalprijs na aftrek millieukorting en klantkorting
            prijsNaAftrekKlantKorting = prijsNaAftrekMillieuKorting;
            prijsNaAftrekKlantKorting = prijsNaAftrekKlantKorting * (1 - (geselecteerdeKlant.getKlantSoort().getKlantKorting() / 100));

            System.out.printf("|%s %d |%n|%s %d |%n|%s %d |\n",
                    prijsMessage,
                    prijsVoorAftrek,
                    prijsMessageMilieu,
                    prijsNaAftrekMillieuKorting,
                    prijsMessageKlant,
                    prijsNaAftrekKlantKorting);
        }
        printTableHorizontalBorder();
    }

    private void printTableHorizontalBorder(){
        for (int i = 0; i < 202; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}
