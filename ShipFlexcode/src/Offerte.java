import java.util.ArrayList;

class Offerte {
    public ArrayList<Optie> geselecteerdeOpties = new ArrayList<Optie>();

    public void maakOfferte(){
        double totaalprijs = 0;

        for (int i = 0; i < geselecteerdeOpties.size(); i++) {
            if(geselecteerdeOpties.get(i).getIsEssentieel()){
                System.out.printf("%-16s","Essentieel");
            } else {
                System.out.printf("%-16s","Niet essentieel");
            }
            System.out.printf("%-18s = €%8.2f%n", geselecteerdeOpties.get(i).getNaam() , geselecteerdeOpties.get(i).getPrijs());
            totaalprijs += geselecteerdeOpties.get(i).getPrijs();

            System.out.printf("%-16s", "Beschrijving:");
            System.out.println(geselecteerdeOpties.get(i).getBeschrijving());
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        System.out.printf("%-34s = €%8.2f%n", "totaalprijs", totaalprijs);
    }
}