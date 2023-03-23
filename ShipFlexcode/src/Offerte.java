import java.util.ArrayList;

class Offerte {
    public ArrayList<Optie> opties = new ArrayList<Optie>();

    public void maakOfferte(){
        double totaalprijs = 0;

        for (int i = 0; i < opties.size(); i++) {
            if(opties.get(i).getIsEssentieel()){
                System.out.printf("%-16s","Essentieel");
            } else {
                System.out.printf("%-16s","Niet essentieel");
            }
            System.out.printf("%-18s = €%8.2f%n", opties.get(i).getNaam() , opties.get(i).getPrijs());
            totaalprijs += opties.get(i).getPrijs();
        }
        System.out.println("----------------------------------------------");
        System.out.printf("%-34s = €%8.2f%n", "totaalprijs", totaalprijs);
    }
}