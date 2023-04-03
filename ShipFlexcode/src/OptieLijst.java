import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class OptieLijst{
    Optie Navigatiesysteem = new Optie(true,"Navigatiesysteem", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, false);
    Optie Motor = new Optie(true,"Motor", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, true);
    Optie Roer = new Optie(true,"Roer", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, false);
    Optie Brandstoftank = new Optie(true,"Brandstoftank", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, true);
    Optie Anker = new Optie(true,"Anker", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, false);
    Optie Airconditioning = new Optie(false,"Airconditioning", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters",20, false);
    Optie Sonar = new Optie(false,"Sonar", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters",20, false);
    Optie ExtraPKs = new Optie(false,"ExtraPKs", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters",20, false);

    //public List<Optie> optielijst = List.of(optie1, optie2, optie3, optie4, optie5, optie6, optie7, optie8); // is voor List

    // is handig om te houden in het geval je de List optielijst veranderd naar ArrayList
    public ArrayList<Optie> optielijst = new ArrayList<Optie>();


    /*
    public void readFromCSV() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src\\CSV_Files\\opties.csv"));
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            //optielijst.add();
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
    }
     */

    public void readFromCSV(){
        String file = "src\\CSV_Files\\opties.csv";
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for (String index : row) {
                    //optielijst.add(new Optie());
                    for (int i=0;i<row.length;i++) {
                        optielijst.add(new Optie(row[0],row[1],row[2],row[3],row[4]));
                    }

                }

            }

        }catch (Exception e) {

        }
    }

    public void voegAlleOptiesToeAanLijst(OptieLijst optielijst){
        optielijst.optielijst.add(Navigatiesysteem);
        optielijst.optielijst.add(Motor);
        optielijst.optielijst.add(Roer);
        optielijst.optielijst.add(Brandstoftank);
        optielijst.optielijst.add(Anker);
        optielijst.optielijst.add(Airconditioning);
        optielijst.optielijst.add(Sonar);
        optielijst.optielijst.add(ExtraPKs);
    }
    // tot hier
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
    public void maakOptieAan(Scanner scanner, String scan){
        System.out.println("Is de optie essentieel?");
        boolean optieIsEssentieel = false;
        String optieNaam;
        String optieBeschrijving;
        int optiePrijs = 0;
        boolean optieMilieukorting = false;
        boolean slechtAntwoord = true;
        while(slechtAntwoord) {
            String optieScan = scanner.nextLine();
            if (optieScan.equals("ja") || optieScan.equals("nee")) {
                slechtAntwoord = false;
                if (optieScan.equals("ja")) {
                    optieIsEssentieel = true;
                } else if (optieScan.equals("nee")) {
                    optieIsEssentieel = false;
                }
            } else {
                System.out.println("ja of nee");
            }
        }
        System.out.println("Hoe heet deze optie?");
        optieNaam = scanner.nextLine();
        System.out.println("Geef een beschrijving van het object:");
        optieBeschrijving = scanner.nextLine();
        System.out.println("Wat is de prijs voor deze optie?");
        boolean integer = false;
        while(integer == false) {
            System.out.print("€");
            if (scanner.hasNextInt()) {
                String optieScan = scanner.nextLine();
                integer = true;
                optiePrijs = Integer.parseInt(optieScan);
            } else {
                String optieScan = scanner.nextLine();
            }
        }
        System.out.println("Heeft deze optie milieu korting?");
        boolean slechtAntwoord2 = true;
        while(slechtAntwoord2) {
            String optieScan2 = scanner.nextLine();
            if (optieScan2.equals("ja") || optieScan2.equals("nee")) {
                slechtAntwoord2 = false;
                if (optieScan2.equals("ja")) {
                    optieMilieukorting = true;
                } else if (optieScan2.equals("nee")) {
                    optieMilieukorting = false;
                }
            } else {
                System.out.println("ja of nee");
            }
        }
        System.out.println("De optie: "+optieNaam);
        System.out.println("is wel of niet essentieel: "+optieIsEssentieel);
        System.out.println("met beschrijving: "+optieBeschrijving);
        System.out.println("met prijs: "+optiePrijs);
        System.out.println("en heeft wel of niet miliuekorting: "+optieMilieukorting);
        System.out.println();
        System.out.println("Optie aangemaakt.");
        Optie nieuweOptie = new Optie(optieIsEssentieel, optieNaam, optieBeschrijving, optiePrijs, optieMilieukorting);
        optielijst.add(nieuweOptie);
    }
}
