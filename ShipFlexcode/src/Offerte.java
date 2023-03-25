import java.util.ArrayList;

class Offerte {
    public ArrayList<Optie> geselecteerdeOpties = new ArrayList<Optie>();

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
        System.out.println("----------------------------------------------");
        korting = prijs - totaalprijs;
        System.out.printf("%-33s =  €%8.2f%n", "Prijs", prijs);
        System.out.printf("%-33s = -€%8.2f%n", "Korting", korting);
        System.out.println("----------------------------------------------");
        System.out.printf("%-33s =  €%8.2f%n", "Totaalprijs", totaalprijs);
    }
}