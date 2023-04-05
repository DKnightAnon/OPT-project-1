import java.util.ArrayList;

public class Commands {
    String optieLijst = "Optie lijst - Toont een lijst met alle beschikbare opties in het systeem.";
    String optieLijstCommand = "Optie lijst";
    String optieAanmaken = "Optie aanmaken - Voegt aan de hand van ingevoerde informatie een nieuwe optie toe aan het systeem.";
    String optieAanmakenCommand = "Optie aanmaken";
    String offerteMaken = "Offerte - Toont de offerte.";
    String offerteMakenCommand = "Offerte maken";
    String optieToevoegen = "Optie toevoegen - Voegt een optie toe aan de offerte.";
    String optieToevoegenCommand = "Optie toevoegen";
    String sluitApplicatie = "Afsluiten - Sluit de applicatie af.";
    String sluitApplicatieCommand = "Afsluiten";
    String helpCommand = "help";

    public ArrayList<String> commandExplantions = new ArrayList<String>();


    public void initializeCommands() {
        commandExplantions.add(optieLijst);
        commandExplantions.add(optieAanmaken);
        commandExplantions.add(optieToevoegen);
        commandExplantions.add(offerteMaken);
        commandExplantions.add(sluitApplicatie);
    }

}
