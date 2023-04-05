package Opties;

import java.io.*;
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

    //public List<Opties.Optie> optielijst = List.of(optie1, optie2, optie3, optie4, optie5, optie6, optie7, optie8); // is voor List

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

    String csvPath = "CSV_Files/opties.csv";
    String Path2 = "ShipFlexcode/src/CSV_Files/opties.csv";
    //Bovenstaande path is een relatief path naar de juiste plek voor het bestand. Dit betekent dat de code op elk andere computer hoort te werken.
    public void writeToCSV() throws FileNotFoundException {
        readFromCSV(); //Vul de arraylist eerst in zodat het csv bestand overschreven kan worden.
        StringBuilder builder = new StringBuilder();
        File csv = new File(Path2);
        PrintWriter pw = new PrintWriter(csv);

        try {
            for (int i = 0; i < optielijst.size(); i++) {
                builder.append(optielijst.get(i).getIsEssentieel());
                builder.append(",");
                builder.append(optielijst.get(i).getNaam());
                builder.append(",");
                builder.append(optielijst.get(i).getBeschrijving());
                builder.append(",");
                builder.append(optielijst.get(i).getPrijs());
                builder.append(",");
                builder.append(optielijst.get(i).getMiliuekorting());
                builder.append("\n");
            }
            pw.write(String.valueOf(builder));
            pw.flush();
            pw.close();
            //System.out.println(builder);
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    //Deze methode leest dingen uit een csv bestand en maakt hiermee objecten van het type Opties.Optie aan.
    public void readFromCSV(){

        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(Path2));
            optielijst.clear();
            while ((line = reader.readLine()) != null)
            {
                String[] row = line.split(",");
                optielijst.add(new Optie(row[0],row[1],row[2],row[3],row[4]));
            }
        }catch (Exception e) {
        }
        for (int i = 0; i<optielijst.size();i++) {
            System.out.println(
                    optielijst.get(i).getIsEssentieel() +
                    "," +
                    optielijst.get(i).getNaam() +
                    "," +
                    optielijst.get(i).getBeschrijving() +
                    "," +
                    optielijst.get(i).getPrijs() +
                    "," +
                    optielijst.get(i).getMiliuekorting()
            );

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
        /*
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

         */
        readFromCSV();

        System.out.printf("%-20s %-20s %-100s %-10s %-25s%n",
                "Essentiele optie",
                "Naam",
                "Beschrijving",
                "Prijs",
                "Milieukorting"
        );
        for (int i = 0; i<167;i++) {
            System.out.print("-");
        }
            System.out.println();
        for (int i = 0;i<optielijst.size();i++) {
            String prijs = String.valueOf(optielijst.get(i).getPrijs()); //Dit was eerst 'doubleprijs'
            //String prijs = "\u20ac" + doubleprijs; //De bedoeling hiervan was om een eurosymbool te printen, maar dat lijkt niet te werken met printf
            if (optielijst.get(i).getIsEssentieel()) {
                System.out.printf("%-20s %-20s %-100s %-10s %-25s%n",
                        optielijst.get(i).getIsEssentieel(),
                        optielijst.get(i).getNaam(),
                        optielijst.get(i).getBeschrijving(),
                        optielijst.get(i).getPrijs(),
                        optielijst.get(i).getMiliuekorting()
                );
            }
            if (!optielijst.get(i).getIsEssentieel()) {
                System.out.printf("%-20s %-20s %-100s %-10s %-25s%n",
                        optielijst.get(i).getIsEssentieel(),
                        optielijst.get(i).getNaam(),
                        optielijst.get(i).getBeschrijving(),
                        optielijst.get(i).getPrijs(),
                        optielijst.get(i).getMiliuekorting()
                );
            }
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
        System.out.println("Opties.Optie aangemaakt.");
        Optie nieuweOptie = new Optie(optieIsEssentieel, optieNaam, optieBeschrijving, optiePrijs, optieMilieukorting);
        optielijst.add(nieuweOptie);
    }
}
