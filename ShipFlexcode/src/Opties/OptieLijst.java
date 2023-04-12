package Opties;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class OptieLijst{
    Optie Navigatiesysteem = new Optie(true,"Navigatiesysteem", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, false);
    Optie Motor = new Optie(true,"Motor", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, true);
    Optie Roer = new Optie(true,"Roer", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, false);
    public Optie Brandstoftank = new Optie(true,"Brandstoftank", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, true);
    public Optie Anker = new Optie(true,"Anker", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, false);
    Optie Airconditioning = new Optie(false,"Airconditioning", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters",20, false);
    Optie Sonar = new Optie(false,"Sonar", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters",20, false);
    Optie ExtraPKs = new Optie(false,"ExtraPKs", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters",20, false);

    //public List<Opties.Optie> optielijst = List.of(optie1, optie2, optie3, optie4, optie5, optie6, optie7, optie8); // is voor List

    // is handig om te houden in het geval je de List optielijst veranderd naar ArrayList
    public ArrayList<Optie> optielijst = new ArrayList<Optie>();

    private String Path = "ShipFlexcode/src/CSV_Files/opties.csv";
    //Bovenstaande path is een relatief path naar de juiste plek voor het bestand. Dit betekent dat de code op elk andere computer hoort te werken.
    public void writeToCSV() throws FileNotFoundException {
        //readFromCSV(); //Vul de arraylist eerst in zodat het csv bestand overschreven kan worden.
        StringBuilder builder = new StringBuilder();

        File csv = new File(Path);
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
            reader = new BufferedReader(new FileReader(Path));
            optielijst.clear();
            while ((line = reader.readLine()) != null)
            {
                String[] row = line.split(",");
                optielijst.add(new Optie(row[0],row[1],row[2],row[3],row[4]));
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
        readFromCSV();

        for (int i = 0; i<202;i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s| %-20s| %-20s| %-100s| %-10s| %-25s|%n",
                "Optie nr.",
                "Essentiele optie",
                "Naam",
                "Beschrijving",
                "Prijs",
                "Milieukorting"
        );
        for (int i = 0; i<202;i++) {
            System.out.print("-");
        }
            System.out.println();
        for (int i = 1;i<optielijst.size();i++) {
            String prijs = String.valueOf(optielijst.get(i).getPrijs()); //Dit was eerst 'doubleprijs'
            //String prijs = "\u20ac" + doubleprijs; //De bedoeling hiervan was om een eurosymbool te printen, maar dat lijkt niet te werken met printf
            if (optielijst.get(i).getIsEssentieel()) {
                System.out.printf("|%-15d| %-20s| %-20s| %-100s| %-10s| %-25s|%n",
                        optielijst.indexOf(optielijst.get(i)),
                        optielijst.get(i).getIsEssentieel(),
                        optielijst.get(i).getNaam(),
                        optielijst.get(i).getBeschrijving(),
                        optielijst.get(i).getPrijs(),
                        optielijst.get(i).getMiliuekorting()
                );
            }

        }
        for (int i = 1;i<optielijst.size();i++) {
            if (!optielijst.get(i).getIsEssentieel()) {
                System.out.printf("|%-15d| %-20s| %-20s| %-100s| %-10s| %-25s|%n",
                        optielijst.indexOf(optielijst.get(i)),
                        optielijst.get(i).getIsEssentieel(),
                        optielijst.get(i).getNaam(),
                        optielijst.get(i).getBeschrijving(),
                        optielijst.get(i).getPrijs(),
                        optielijst.get(i).getMiliuekorting()
                );
            }
        }
        for (int i = 0; i<202;i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void nieuweOptie(String isEssentieel,
                            String naam,
                            String beschrijving,
                            String prijs,
                            String milieukorting) throws FileNotFoundException {
        Optie nieuweOptie = new Optie(isEssentieel, naam, beschrijving, prijs, milieukorting);

        readFromCSV();
        optielijst.add(nieuweOptie);
        writeToCSV();

    }
    public void nieuweOptie(boolean isEssentieel,
                            String naam,
                            String beschrijving,
                            double prijs,
                            boolean milieukorting) throws FileNotFoundException {
        readFromCSV();
        Optie nieuweOptie = new Optie(isEssentieel, naam, beschrijving, prijs, milieukorting);
        optielijst.add(nieuweOptie);
        writeToCSV();
    }

}
