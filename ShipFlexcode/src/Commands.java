import java.util.ArrayList;

public class Commands {

    static String commandError = "Dit commando bestaat niet.";

    public class optieLijst {
        static String optieLijst = "Optie lijst - Toont een lijst met alle beschikbare opties in het systeem.";
        static String optieLijstCommand = "Optie lijst";
        static String optieLijstCommandLowerCase = "optie lijst";
        static String optieLijstCommandJoined = "Optielijst";
        static String optieLijstCommandJoinedLowerCase = "optielijst";
        static String optieLijstCommandJoinedAllcaps = "OPTIELIJST";
    }
    public class optieAanmaken {
        static String optieAanmaken = "Optie aanmaken - Voegt aan de hand van ingevoerde informatie een nieuwe optie toe aan het systeem.";
        static String optieAanmakenCommand = "Optie aanmaken";
        static String optieAanmakenCommandLowerCase = "optie aanmaken";
        static String optieAanmakenCommandJoined = "OptieAanmaken";
        static String optieAanmakenCommandJoinedLowerCase = "optieaanmaken";
        static String optieAanmakenCommandJoinedFirstUpperCase = "Optieaanmaken";
        static String optieAanmakenCommandJoinedLastUpperCase = "optieAanmaken";
    }

    public class offerteMaken {
        static String offerteMaken = "Offerte maken - Maakt een offerte aan en toont het op het scherm.";
        static String offerteMakenCommand = "Offerte maken";
        static String offerteMakenCommandeLowerCase = "offerte maken";
        static String offerteMakenCommandJoined = "OfferteMaken";
        static String offerteMakenCommandJoinedLowerCase = "offertemaken";
        static String offerteMakenCommandJoinedFirstUpperCase = "Offertemaken";
    }

    public class optieToevoegen {
        static String optieToevoegen = "Optie toevoegen - Voegt een optie toe aan de offerte.";
        static String optieToevoegenCommand = "Optie toevoegen";
    }
    public class sluitApplicatie {
        static String sluitApplicatie = "Afsluiten - Sluit de applicatie af.";
        static String sluitApplicatieCommand = "Afsluiten";
        static String sluitApplicatieCommandLowerCase = "afsluiten";
    }

    public class help {
        static String helpCommand = "Help";
        static String helpCommandLowerCase = "help";
        static String helpCommandAllCaps = "HELP";
    }

    public static ArrayList<String> commandExplantions = new ArrayList<String>();


    static void initializeCommands() {
        commandExplantions.add(optieLijst.optieLijst);
        commandExplantions.add(optieAanmaken.optieAanmaken);
        commandExplantions.add(optieToevoegen.optieToevoegen);
        commandExplantions.add(offerteMaken.offerteMaken);
        commandExplantions.add(sluitApplicatie.sluitApplicatie);
    }

}
