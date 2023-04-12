import Commands.Commands;
import Klant_types.KlantLijst;
import Offerte.OfferteNieuw;
import Opties.Optie;
import Opties.OptieLijst;

public class RuntimeTests {
    static OptieLijst testlijst = new OptieLijst();
    static KlantLijst testlKlantLijst = new KlantLijst();
    static OfferteNieuw testOfferte = new OfferteNieuw();

    public static void initialize(){
        Commands.initializeCommands();
        testlijst.readFromCSV();
        testOfferte.geselecteerdeOpties.add(
                new Optie(false,
                        "placeHolder",
                        "Placeholder zodat index vanaf 1 kan beginnen",
                        00.00,
                        false)
        );
        testlKlantLijst.readFromCSV();
    }

    public static void testOfferteNieuwBorderLines(){
        initialize();
        testOfferte.addKlant(testlKlantLijst.KlantenLijst.get(2));
        testlijst.readFromCSV();
        testOfferte.geselecteerdeOpties.add(testlijst.optielijst.get(2));
        testOfferte.printKlant();
        testOfferte.printGeselecteerdeOpties();
        testOfferte.printPrijsBerekening();
    }

    public static void main (String[] args) {
        testOfferteNieuwBorderLines();
    }
}
