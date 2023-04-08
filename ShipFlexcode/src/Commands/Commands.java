package Commands;

import java.util.ArrayList;

public class Commands {

    public static String commandError = "Dit commando bestaat niet.";

    public class optieLijst {
        public static String optieLijst = "Optie lijst - Toont een lijst met alle beschikbare opties in het systeem.";
        public static String optieLijstCommand = "Optie lijst";
        public static String optieLijstCommandLowerCase = "optie lijst";
        public static String optieLijstCommandJoined = "Optielijst";
        public static String optieLijstCommandJoinedLowerCase = "optielijst";
        public static String optieLijstCommandJoinedAllcaps = "OPTIELIJST";
    }
    public class optieAanmaken {
        public static String optieAanmaken = "Optie aanmaken - Voegt aan de hand van ingevoerde informatie een nieuwe optie toe aan het systeem.";
        public static String optieAanmakenCommand = "Optie aanmaken";
        public static String optieAanmakenCommandLowerCase = "optie aanmaken";
        public static String optieAanmakenCommandJoined = "OptieAanmaken";
        public static String optieAanmakenCommandJoinedLowerCase = "optieaanmaken";
        public static String optieAanmakenCommandJoinedFirstUpperCase = "Optieaanmaken";
        public static String optieAanmakenCommandJoinedLastUpperCase = "optieAanmaken";
    }

    public class offerteMaken {
        public static String offerteMaken = "Offerte maken - Maakt een offerte aan en toont het op het scherm.";
        public static String offerteMakenCommand = "Offerte maken";
        public static String offerteMakenCommandeLowerCase = "offerte maken";
        public static String offerteMakenCommandJoined = "OfferteMaken";
        public static String offerteMakenCommandJoinedLowerCase = "offertemaken";
        public static String offerteMakenCommandJoinedFirstUpperCase = "Offertemaken";
    }

    public class optieToevoegen {
        public static String optieToevoegen = "Optie toevoegen - Voegt een optie toe aan de offerte.";
        public static String optieToevoegenCommand = "Optie toevoegen";
    }
    public class sluitApplicatie {
        public static String sluitApplicatie = "Afsluiten - Sluit de applicatie af.";
        public static String sluitApplicatieCommand = "Afsluiten";
        public static String sluitApplicatieCommandLowerCase = "afsluiten";
        public static String sluitApplicatieCommandAllCaps = "AFSLUITEN";
    }

    public class help {
        public static String helpCommand = "Help";
        public static String helpCommandLowerCase = "help";
        public static String helpCommandAllCaps = "HELP";
    }

    public class Test {
        public static String testColorTextCommand = "testcolor";
    }
    public static ArrayList<String> commandExplanations = new ArrayList<String>();


    public static void initializeCommands() {
        commandExplanations.add(optieLijst.optieLijst);
        commandExplanations.add(optieAanmaken.optieAanmaken);
        commandExplanations.add(optieToevoegen.optieToevoegen);
        commandExplanations.add(offerteMaken.offerteMaken);
        commandExplanations.add(sluitApplicatie.sluitApplicatie);
    }

}
