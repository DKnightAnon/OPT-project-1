import java.util.List;
public class OptieLijst{
    Optie optie1 = new Optie(true,"Navigatiesysteem", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, false);
    Optie optie2 = new Optie(true,"Motor", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, true);
    Optie optie3 = new Optie(true,"Roer", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, false);
    Optie optie4 = new Optie(true,"Brandstoftank", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, true);
    Optie optie5 = new Optie(true,"Anker", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, false);
    Optie optie6 = new Optie(false,"Airconditioning", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters",20, false);
    Optie optie7 = new Optie(false,"Sonar", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters",20, false);
    Optie optie8 = new Optie(false,"Extra pks", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters",20, false);

    public List<Optie> optielijst = List.of(optie1, optie2, optie3, optie4, optie5, optie6, optie7, optie8);

    // is handig om te houden in het geval je de List optielijst veranderd naar ArrayList
    /*
    public ArrayList<Optie> optielijst = new ArrayList<Optie>();

    public void voegAlleOptiesToeAanLijst(OptieLijst optielijst){
        optielijst.optielijst.add(optie1);
        optielijst.optielijst.add(optie2);
        optielijst.optielijst.add(optie3);
        optielijst.optielijst.add(optie4);
        optielijst.optielijst.add(optie5);
        optielijst.optielijst.add(optie6);
        optielijst.optielijst.add(optie7);
        optielijst.optielijst.add(optie8);
    }
    */
    public void printOptieLijst() {
        for (int i = 0; i < optielijst.size(); i++){
            System.out.println("Naam: " + optielijst.get(i).getNaam());
            System.out.println("Beschrijving: " + optielijst.get(i).getBeschrijving());
            System.out.println("Prijs: " + optielijst.get(i).getPrijs());
            if (optielijst.get(i).getIsEssentieel()) {
                System.out.println("Essentieel: Ja");
            } else {
                System.out.println("Essentieel: Nee");
            }
            if (optielijst.get(i).getMiliuekorting()) {
                System.out.println("Miliuekorting: Ja");
            } else {
                System.out.println("Miliuekorting: Nee");
            }
            System.out.println();
        }
    }
}
