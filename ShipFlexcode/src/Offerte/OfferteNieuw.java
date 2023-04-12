package Offerte;

import Commands.TextColors;
import Klant_types.Klant;
import Opties.Optie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class OfferteNieuw {

    private Klant geselecteerdeKlant = new Klant(null,null);


    private ArrayList<Optie> geselecteerdeOpties = new ArrayList<Optie>();

    public void addKlant(Klant klant){
        this.geselecteerdeKlant = klant;
    }

    public void removeKlant(){
        this.geselecteerdeKlant = new Klant(null,null);
    }

    public void printKlant(){

        printTableHorizontalBorder();
        System.out.printf("| %-30s| %-20s| %-10s",
                "Klantnaam",
                "Klant type",
                "Klant korting %",
                " "
        );
        for (int i = 0;i<130;i++){
            System.out.print(" ");
        }
        System.out.print("|\n");
        printTableHorizontalBorder();
        if (geselecteerdeKlant.isEmpty()){
            System.out.printf("|%-200s|%n"," ");
        }else{
            System.out.printf(
                    "| %-30s| %-20s| %-145s|%n",
                    geselecteerdeKlant.getKlantNaam(),
                    geselecteerdeKlant.getKlantSoort().getKlantSoort(),
                    geselecteerdeKlant.getKlantSoort().getKlantKorting()
            );
        }

    }

    public void printGeselecteerdeOpties() {
        printTableHorizontalBorder();
        System.out.printf("|%-15s| %-20s| %-20s| %-100s| %-10s| %-25s|%n",
                "Optie nr.",
                "Essentiele optie",
                "Naam",
                "Beschrijving",
                "Prijs",
                "Milieukorting"
        );
        printTableHorizontalBorder();
        if (geselecteerdeOpties.size()==1) {
            System.out.printf("|%200s|\n", " ");

        } else {
            for (int i = 1; i < geselecteerdeOpties.size(); i++) {
                System.out.printf("|%-15d| %-20s| %-20s| %-100s| %-10s| %-25s|%n",
                        getGeselecteerdeOpties().indexOf(geselecteerdeOpties.get(i)),
                        geselecteerdeOpties.get(i).getIsEssentieel(),
                        geselecteerdeOpties.get(i).getNaam(),
                        geselecteerdeOpties.get(i).getBeschrijving(),
                        geselecteerdeOpties.get(i).getPrijs(),
                        geselecteerdeOpties.get(i).getMiliuekorting()
                );
            }
        }
        printTableHorizontalBorder();

        }


    public void printPrijsBerekening(){
        double prijsVoorAftrek = 0;
        //Bereken totaal prijs voor korting
        for (int i = 1; i < geselecteerdeOpties.size(); i++) {
            prijsVoorAftrek += geselecteerdeOpties.get(i).getPrijs();
        }
        double prijsNaAftrekMillieuKorting = 0;
        double prijsNaAftrekKlantKorting = 0;
        String prijsMessage = "Prijs voor aftrek kortingen : ";
        String prijsMessageMilieu = "Prijs na aftrek millieukortingen : ";
        String prijsMessageKlant = "Prijs na aftrek klantkorintg : ";

        System.out.printf("| %-199s|%n","Prijsberekening");
        printTableHorizontalBorder();

        if (prijsVoorAftrek == 0){
            System.out.printf("|%200s|\n", " ");
        } else if (geselecteerdeKlant.isEmpty())
        {
            System.out.printf("|%209s|\n",
                    TextColors.Text.ANSI_YELLOW+"Voeg eerst een klant toe!"+TextColors.Text.ANSI_RESET);

        } else {
            //Bereken totaalprijs na aftrek millieukorting per onderdeel
            for (int i = 1; i < geselecteerdeOpties.size(); i++) {
                prijsNaAftrekMillieuKorting += geselecteerdeOpties.get(i).getPrijsMinKorting();
            }

            //Bereken totaalprijs na aftrek millieukorting en klantkorting
            prijsNaAftrekKlantKorting = prijsNaAftrekMillieuKorting;
            prijsNaAftrekKlantKorting = prijsNaAftrekKlantKorting * (1 - (geselecteerdeKlant.getKlantSoort().getKlantKorting() / 100));

            System.out.printf("|%192s %6.2f |%n|%192s %6.2f |%n|%192s %6.2f |\n",
                    prijsMessage,
                    prijsVoorAftrek,
                    prijsMessageMilieu,
                    prijsNaAftrekMillieuKorting,
                    prijsMessageKlant,
                    prijsNaAftrekKlantKorting);
        }
        printTableHorizontalBorder();
    }

    private void printTableHorizontalBorder(){
        for (int i = 0; i < 202; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private void printFileTableHorizontalBorder(PrintWriter Writer){
        for (int i = 0; i < 202; i++) {
            Writer.print("-");
        }
        Writer.println();
    }


    private void makeDirectoryIfNotExist(){
        String folderPath = System.getProperty("user.home") + File.separator +
                "Documents" + File.separator +
                "ShipFlexOffertes";
        File customDir = new File(folderPath);

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
    }

    //Bijna hetzelfde als de methode toonOfferte() in SystemInterface.
    //Deze methode combineert de functionaliteit van printKlant,
    // printGeselecteerdeOpties en printPrijsBerekening,
    // en zet het in een apart .txt bestand.
    public void maakOfferteBestandAan() throws FileNotFoundException {
        System.out.println("Creating directory...");
        makeDirectoryIfNotExist();
        LocalDate timestamp = LocalDate.now();
        DateTimeFormatter formatted = DateTimeFormatter.BASIC_ISO_DATE;
        String formattedDate = timestamp.format(formatted);
        String fileName = "Offerte-"+getGeselecteerdeKlant().getKlantNaam()+"-"+formattedDate+".txt";
        String path = System.getProperty("user.home") + File.separator +
                "Documents" + File.separator +
                "ShipFlexOffertes" + File.separator +
                fileName;

        PrintWriter Writer = new PrintWriter(path);

            printFileTableHorizontalBorder(Writer);
        Writer.printf("| %-30s| %-20s| %-10s",
                "Klantnaam",
                "Klant type",
                "Klant korting %",
                " "
        );
        for (int i = 0;i<130;i++){
            Writer.print(" ");
        }
        Writer.print("|\n");
            printFileTableHorizontalBorder(Writer);
        Writer.printf(
                "| %-30s| %-20s| %-145s|%n",
                geselecteerdeKlant.getKlantNaam(),
                geselecteerdeKlant.getKlantSoort().getKlantSoort(),
                geselecteerdeKlant.getKlantSoort().getKlantKorting()
        );
            printFileTableHorizontalBorder(Writer);
        Writer.printf("|%-15s| %-20s| %-20s| %-100s| %-10s| %-25s|%n",
                "Optie nr.",
                "Essentiele optie",
                "Naam",
                "Beschrijving",
                "Prijs",
                "Milieukorting"
        );
            printFileTableHorizontalBorder(Writer);
        for (int i = 1; i < geselecteerdeOpties.size(); i++) {
            Writer.printf("|%-15d| %-20s| %-20s| %-100s| %-10s| %-25s|%n",
                    getGeselecteerdeOpties().indexOf(geselecteerdeOpties.get(i)),
                    geselecteerdeOpties.get(i).getIsEssentieel(),
                    geselecteerdeOpties.get(i).getNaam(),
                    geselecteerdeOpties.get(i).getBeschrijving(),
                    geselecteerdeOpties.get(i).getPrijs(),
                    geselecteerdeOpties.get(i).getMiliuekorting()
            );
        }
            printFileTableHorizontalBorder(Writer);

        double prijsVoorAftrek = 0;
        //Bereken totaal prijs voor korting
        for (int i = 1; i < geselecteerdeOpties.size(); i++) {
            prijsVoorAftrek += geselecteerdeOpties.get(i).getPrijs();
        }
        double prijsNaAftrekMillieuKorting = 0;
        double prijsNaAftrekKlantKorting = 0;
        String prijsMessage = "Prijs voor aftrek kortingen : ";
        String prijsMessageMilieu = "Prijs na aftrek millieukortingen : ";
        String prijsMessageKlant = "Prijs na aftrek klantkorintg : ";

        Writer.printf("| %-199s|%n","Prijsberekening");
            printFileTableHorizontalBorder(Writer);
        for (int i = 1; i < geselecteerdeOpties.size(); i++) {
            prijsNaAftrekMillieuKorting += geselecteerdeOpties.get(i).getPrijsMinKorting();
        }

        //Bereken totaalprijs na aftrek millieukorting en klantkorting
        prijsNaAftrekKlantKorting = prijsNaAftrekMillieuKorting;
        prijsNaAftrekKlantKorting = prijsNaAftrekKlantKorting * (1 - (geselecteerdeKlant.getKlantSoort().getKlantKorting() / 100));

        Writer.printf("|%192s %6.2f |%n|%192s %6.2f |%n|%192s %6.2f |\n",
                prijsMessage,
                prijsVoorAftrek,
                prijsMessageMilieu,
                prijsNaAftrekMillieuKorting,
                prijsMessageKlant,
                prijsNaAftrekKlantKorting);
            printFileTableHorizontalBorder(Writer);

            Writer.flush();
            Writer.close();
            System.out.println(
                    "File "+
                    TextColors.Text.ANSI_RED+
                    fileName+
                    TextColors.Text.ANSI_RESET+
                    " should have been created in folder : "+
                    TextColors.Text.ANSI_RED+
                    path+
                    TextColors.Text.ANSI_RESET);
    }


    public Klant getGeselecteerdeKlant() {
        return geselecteerdeKlant;
    }

    public ArrayList<Optie> getGeselecteerdeOpties() {
        return geselecteerdeOpties;
    }
}
