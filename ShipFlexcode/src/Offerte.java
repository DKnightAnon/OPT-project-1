import java.util.ArrayList;
import java.util.Scanner;

class Offerte {
    public ArrayList<Optie> geselecteerdeOpties = new ArrayList<Optie>();

    public void voegOptieToe(Scanner scanner, String scan, OptieLijst optielijst) {
        System.out.println("Welke optie wil u toevoegen?");
        scan = scanner.nextLine();
        int locatieOptie = -1;
        for (int i = 0; i < optielijst.optielijst.size(); i++){
            if (optielijst.optielijst.get(i).getNaam().equals(scan)){
                locatieOptie = i;
            }
        }
        if (locatieOptie == -1){
            System.out.println("Deze optie bestaat niet.");
        } else {
            geselecteerdeOpties.add(optielijst.optielijst.get(locatieOptie));
            System.out.println("Optie toegevoegd.");
        }
    }

    public void maakOfferte(){
        double prijs = 0;
        double korting = 0;
        double totaalprijs = 0;

        for (int i = 0; i < geselecteerdeOpties.size(); i++) {
            if(geselecteerdeOpties.get(i).getIsEssentieel()){
                System.out.printf("%-16s","Essentieel");
            } else {
                System.out.printf("%-16s","Niet essentieel");
            }
            System.out.printf("%-18s = €%8.2f%n", geselecteerdeOpties.get(i).getNaam() , geselecteerdeOpties.get(i).getPrijs());

            prijs += geselecteerdeOpties.get(i).getPrijs();
            totaalprijs += geselecteerdeOpties.get(i).getPrijsMinKorting();

            System.out.printf("%-16s", "Korting:");
            if (geselecteerdeOpties.get(i).getMiliuekorting()) {
                System.out.printf("%.0f%1s Miliuekorting%n",geselecteerdeOpties.get(i).getPercentageMiliuekorting(), "%");
            } else {
                System.out.println("Nee");
            }

            System.out.printf("%-16s", "Beschrijving:");
            System.out.println(geselecteerdeOpties.get(i).getBeschrijving());
            System.out.println();
        }

         if (geselecteerdeOpties.isEmpty()){
             System.out.println("U heeft nog niks geselecteerd.");
         } else {
             System.out.println("----------------------------------------------");
             korting = prijs - totaalprijs;
             System.out.printf("%-33s =  €%8.2f%n", "Prijs", prijs);
             System.out.printf("%-33s = -€%8.2f%n", "Korting", korting);
             System.out.println("----------------------------------------------");
             System.out.printf("%-33s =  €%8.2f%n", "Totaalprijs", totaalprijs);
         }
    }
}