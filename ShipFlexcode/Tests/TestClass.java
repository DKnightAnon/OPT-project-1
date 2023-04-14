import Commands.Commands;
import Klant_types.KlantLijst;
import Offerte.OfferteNieuw;
import Offerte.Offerte;
import Opties.Optie;
import Opties.OptieLijst;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Commands.TextColors;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass {

    @Test
    public void testTextColors(){
        // dit test of je de kleur moet resetten voordat je hem verandert & of een if statement werkt met dezelfde variabele waar alleen de kleur anders is
        TextColors.initialize();
        String testgeel = TextColors.Text.ANSI_YELLOW+"Testgeel\n";
        String testblauw = TextColors.Text.ANSI_BLUE+"TestBlauw\n";
        String testwit = TextColors.Text.ANSI_RESET+"Testwit/reset\n";
        boolean kleurklopt = false;
        if(testgeel.equals(TextColors.Text.ANSI_YELLOW+"Testgeel\n")){
            kleurklopt = true;
        }

        System.out.println("Voer de optienummer in van de optie dat u wilt verwijderen van de offerte.\n"
                + TextColors.Text.ANSI_YELLOW
                + "     Let erop dat u het optienummer kiest dat vermeldt staat in de offerte.\n"
                + testwit
                + testblauw
                + testgeel);
        System.out.println(kleurklopt);

        assertTrue(kleurklopt);

    }

    //Dit is gemaakt door david.
    @Test
    public void testVoegAlleOptiesToeAanLijst() {
        //Arrange
        OptieLijst optielijstTest = new OptieLijst();
        //Act
        optielijstTest.voegAlleOptiesToeAanLijst(optielijstTest);
        //Assert
        assertEquals(8, optielijstTest.optielijst.size());
    }


    //Dit is gemaakt door david.
    @Test
    public void testMaakOptieAan() throws FileNotFoundException {
        //Arrange
        OptieLijst optielijstTest = new OptieLijst();
        //Act
        optielijstTest.nieuweOptie(true, "Anker", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, false);
        //Assert
        assertEquals(1, optielijstTest.optielijst.size());
    }

    //Dit is gemaakt door david.
    @Test
    public void testVoegOptieToe() {
        //Arrange
        Offerte offerteTest = new Offerte();
        OptieLijst optielijstTest = new OptieLijst();
        //Act
        offerteTest.voegOptieToe(optielijstTest.Anker);
        offerteTest.voegOptieToe(optielijstTest.Brandstoftank);
        //Assert
        assertEquals(2, offerteTest.geselecteerdeOpties.size());
    }



    //Checks if a file was actually made when the corresponding method is called.
    @Test
    public void checkIfOfferteBestandIsActuallyMade_ReturnBoolean() {
        //Prepare
        boolean fileMade = true;
        boolean folderMade = true;

        //Prepare2
        OptieLijst testlijst = new OptieLijst();
        KlantLijst testlKlantLijst = new KlantLijst();
        OfferteNieuw testOfferte = new OfferteNieuw();
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

        testOfferte.addKlant(testlKlantLijst.KlantenLijst.get(2));
        testlijst.readFromCSV();
        testOfferte.getGeselecteerdeOpties().add(testlijst.optielijst.get(2));
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

        //Act
        File offerte = new File(path);
        File offerteFolder = new File(folderPath);


        //Assert
        Assertions.assertEquals(folderMade, offerteFolder.exists());
        Assertions.assertEquals(fileMade, offerte.exists());
    }

}