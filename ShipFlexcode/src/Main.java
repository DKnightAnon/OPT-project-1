
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Offerte offerte1 = new Offerte();
        OptieLijst optielijst1 = new OptieLijst();

        optielijst1.voegAlleOptiesToeAanLijst(optielijst1); // is handig om te houden in het geval je de List optielijst veranderd naar ArrayList

        /*
        offerte1.maakOfferte();
        System.out.println();
        optielijst1.printOptieLijst();
         */

        Scanner scanner = new Scanner(System.in);
        boolean einde = false;
        while(einde == false){
            String scan = scanner.nextLine();
            if (scan.equals("einde")){
                einde = true;
            } else if (scan.equals("optie lijst")) {
                optielijst1.printOptieLijst();
            } else if (scan.equals("offerte")) {
                offerte1.maakOfferte();
            } else if (scan.equals("help")) {
                System.out.println("U kunt kiezen uit:");
                System.out.println("optie lijst");
                System.out.println("optie aanmaken");
                System.out.println("offerte");
                System.out.println("optie toevoegen");
                System.out.println("einde");
            } else if (scan.equals("optie toevoegen")) {
                offerte1.voegOptieToe(scanner, scan, optielijst1);
            } else if (scan.equals("optie aanmaken")) {
                optielijst1.maakOptieAan(scanner, scan);
            } else {
                System.out.println("type -help- voor meer informatie.");
            }
        }
    }

}