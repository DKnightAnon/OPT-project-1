import Commands.Commands;
import Klant_types.KlantLijst;
import Offerte.OfferteNieuw;
import Opties.Optie;
import Opties.OptieLijst;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RuntimeTests {
    static OptieLijst testlijst = new OptieLijst();
    static KlantLijst testlKlantLijst = new KlantLijst();
    static OfferteNieuw testOfferte = new OfferteNieuw();

    public static void initialize() {
        Commands.initializeCommands();
        testlijst.readFromCSV();
        testOfferte.getGeselecteerdeOpties().add(
                new Optie(false,
                        "placeHolder",
                        "Placeholder zodat index vanaf 1 kan beginnen",
                        00.00,
                        false)
        );
        testlKlantLijst.readFromCSV();
    }

    //Kleine testofferte om te checken of de tabel goed wordt geprint. Moet handmatig nagekeken worden.
    public static void testOfferteNieuwBorderLines() {
        initialize();
        testOfferte.addKlant(testlKlantLijst.KlantenLijst.get(2));
        testlijst.readFromCSV();
        testOfferte.getGeselecteerdeOpties().add(testlijst.optielijst.get(2));
        testOfferte.printKlant();
        testOfferte.printGeselecteerdeOpties();
        testOfferte.printPrijsBerekening();
    }

    //Does not print document, prints it's parent folder path instead
    //Hypothethical path, does not actually make directory
    public static void printExampleOfferteDocumentPath() throws IOException {
        initialize();
        testOfferte.addKlant(testlKlantLijst.KlantenLijst.get(2));
        LocalDate timestamp = LocalDate.now();
        DateTimeFormatter formatted = DateTimeFormatter.BASIC_ISO_DATE;
        String formattedDate = timestamp.format(formatted);
        String path = System.getProperty("user.home") + File.separator +
                "Documents" + File.separator +
                "ShipFlexOffertes" + File.separator +
                "Offerte" + testOfferte.getGeselecteerdeKlant().getKlantNaam() + formattedDate + ".txt";
        String folderPath = System.getProperty("user.home") + File.separator +
                "Documents" + File.separator +
                "ShipFlexOffertes";

        System.out.println(path);

    }



    //Makes directory and file, then deletes both. Also checks to see if directory and file were successfully created.
    public static void makeExampleOfferteFile() throws IOException {

        initialize();
        testOfferte.addKlant(testlKlantLijst.KlantenLijst.get(2));
        LocalDate timestamp = LocalDate.now();
        DateTimeFormatter formatted = DateTimeFormatter.BASIC_ISO_DATE;
        String formattedDate = timestamp.format(formatted);
        //int fileNumber;
        String path = System.getProperty("user.home") + File.separator +
                "Documents" + File.separator +
                "ShipFlexOffertes" + File.separator +
                "Offerte-" + testOfferte.getGeselecteerdeKlant().getKlantNaam() + "-" + formattedDate + ".txt";
        String folderPath = System.getProperty("user.home") + File.separator +
                "Documents" + File.separator +
                "ShipFlexOffertes";

        File offerte = new File(path);
        File offerteFolder = new File(folderPath);

        if (!offerteFolder.exists()) {
            offerteFolder.mkdirs();
            if (offerteFolder.exists()) {
                System.out.println("Successfully made the folder!");
            } else if (!offerteFolder.exists()) {
                System.out.println("Unable to make folder...");
            }
        }

        if (!offerte.exists()) {
            offerte.createNewFile();
            if (offerte.exists()) {
                System.out.println("File sucessfully made!");
            } else if (!offerte.exists()) {
                System.out.println("Unable to create file...");
            }
        }

        if (offerte.exists()) {
            if (offerte.delete()) {
                System.out.println("Sucessfully deleted file!");
            } else if (!offerte.delete()) {
                System.out.println("Unable to delete file...");
            }

        }

        if (offerteFolder.exists()) {
            if (offerteFolder.delete()) {
                System.out.println("Successfully deleted folder!");
            } else if (!offerteFolder.delete()) {
                System.out.println("Unable to delete folder...");
            }
        }

    }



    //Not a test, but returns variables for a filepath. Dynamically changes the filepath according to the user computer's language settings. Currently support English and Dutch.
    private static String userDocumentsFolder(){
        String documents = null;
        if (System.getProperty("user.language").equals("nl")){
            documents = "Documenten";
        }
        if (System.getProperty("user.language").equals("en")){
            documents = "Documents";
        }
        return documents;
    }

    //Makes directory and file, then writes content to it. Also prints the file name and in which directory it was created.
    public static void makeExampleofferteFileAndWriteTextToIt() throws IOException {

        initialize();
        testOfferte.addKlant(testlKlantLijst.KlantenLijst.get(2));
        testlijst.readFromCSV();
        testOfferte.getGeselecteerdeOpties().add(testlijst.optielijst.get(2));
        LocalDate timestamp = LocalDate.now();
        DateTimeFormatter formatted = DateTimeFormatter.BASIC_ISO_DATE;
        String formattedDate = timestamp.format(formatted);
        //int fileNumber;
        String path = System.getProperty("user.home") + File.separator +
                userDocumentsFolder() + File.separator +
                "ShipFlexOffertes" + File.separator +
                "Offerte-" + testOfferte.getGeselecteerdeKlant().getKlantNaam() + "-" + formattedDate + ".txt";
        String folderPath = System.getProperty("user.home") + File.separator +
                userDocumentsFolder() + File.separator +
                "ShipFlexOffertes";

        File offerte = new File(path);
        File offerteFolder = new File(folderPath);

        if (!offerteFolder.exists()) {
            offerteFolder.mkdirs();
            if (offerteFolder.exists()) {
                System.out.println("Successfully made the folder!");
            } else if (!offerteFolder.exists()) {
                System.out.println("Unable to make folder...");
            }
        }

        if (!offerte.exists()) {
            offerte.createNewFile();
            if (offerte.exists()) {
                System.out.println("File sucessfully made!");
            } else if (!offerte.exists()) {
                System.out.println("Unable to create file...");
            }
        }

        testOfferte.maakOfferteBestandAan();

    }

    public static void main(String[] args) throws IOException {

        testOfferteNieuwBorderLines();
        printExampleOfferteDocumentPath();
        makeExampleOfferteFile();
        makeExampleofferteFileAndWriteTextToIt();
    }
}
