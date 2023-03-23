import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        Offerte offerte1 = new Offerte();
        OptieLijst optielijst1 = new OptieLijst();

        //optielijst1.voegAlleOptiesToeAanLijst(optielijst1); // is handig om te houden in het geval je de List optielijst veranderd naar ArrayList

        offerte1.geselecteerdeOpties.add(optielijst1.optie1);
        offerte1.geselecteerdeOpties.add(optielijst1.optie2);
        offerte1.geselecteerdeOpties.add(optielijst1.optie3);
        offerte1.geselecteerdeOpties.add(optielijst1.optie4);
        offerte1.geselecteerdeOpties.add(optielijst1.optie5);
        offerte1.geselecteerdeOpties.add(optielijst1.optie6);
        offerte1.geselecteerdeOpties.add(optielijst1.optie7);
        offerte1.geselecteerdeOpties.add(optielijst1.optie8);

        offerte1.maakOfferte();
        System.out.println();
        optielijst1.printOptieLijst();
    }
}