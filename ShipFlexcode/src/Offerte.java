import java.util.ArrayList;

class Offerte {
    public ArrayList<Optie> opties = new ArrayList<Optie>();

    public void maakOfferte(){
        double totaalprijs = 0;

        for (int i = 0; i < opties.size(); i++) {
            System.out.printf("%-18s = €%8.2f%n", opties.get(i).getNaam() , opties.get(i).getPrijs());
            totaalprijs += opties.get(i).getPrijs();
        }
        System.out.println("------------------------------");
        System.out.printf("%-18s = €%8.2f%n", "totaalprijs", totaalprijs);
    }
}