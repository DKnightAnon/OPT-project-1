package Commands;

import java.util.ArrayList;

public class Commands {

    public static String commandError = "Dit commando bestaat niet.";

    private class CommandExplanations{
        private static String optieLijst = "Optie lijst - Toont een lijst met alle beschikbare opties in het systeem.";
        private static String optieAanmaken = "Optie aanmaken - Voegt aan de hand van ingevoerde informatie een nieuwe optie toe aan het systeem.";
        public static String offerteTonen = "Offerte tonen - Weergeeft de huidige offerte weer op het scherm.";
        public static String offerteMaken = "Offerte maken - Maakt een offerte aan en toont het op het scherm.";
        public static String sluitApplicatie = "Afsluiten - Sluit de applicatie af.";
        public static String optieToevoegen = "Optie toevoegen - Voegt een optie toe aan de offerte.";
        public static String optieVerwijderen = "Optie verwijderen - Verwijdert een optie uit de offerte.";
        public static String KlantenTonen = "Toon klanten - Print een lijst met alle geregistreerde klanten.";
        public static String KlantAanmaken = "Klant aanmaken - Registreert een nieuwe klant.";
        public static String KlantTypesTonen = "Klanttypes tonen - Print een lijst met alle geregistreerde klanttypes.";
        public static String KlantTypeAanmaken = "Klanttype aanmaken - Maakt een nieuw type klant aan.";
        public static String KlantToewijzen = "Klant toewijzen - Wijst een klant toe aan de huidige offerte.";
    }

    public class KlantAanmaken{
        public static String klantAanmakenCommand = "Klant aanmaken";
        public static String klantAanmakenCommandLowerCase = "klant aanmaken";
    }
    public class klantenTonen{
        public static String klantTonenCommand = "Toon klanten";
        public static String klantTonenCommandLowerCase = "toon klanten";
        public static String klantTonenCommandJoined = "Toonklanten";
        public static String klantTonenCommandJoinedLowerCase = "toonklanten";
    }


    public class KlantTypeAanmaken{
        public static String klantTypeAanmakenCommand = "Klanttype aanmaken";
        public static String klantTypeAanmakenCommandLowerCase = "klanttype aanmaken";
    }

    public class KlantTypesTonen{
        public static String klantTypesTonenCommand = "Klanttypes tonen";
        public static String klantTypesTonenCommandLowerCase = "klanttypes tonen";
    }

    public class optieLijst {
        public static String optieLijstCommand = "Optie lijst";
        public static String optieLijstCommandLowerCase = "optie lijst";
        public static String optieLijstCommandJoined = "Optielijst";
        public static String optieLijstCommandJoinedLowerCase = "optielijst";
        public static String optieLijstCommandJoinedAllcaps = "OPTIELIJST";
    }
    public class optieAanmaken {
        public static String optieAanmakenCommand = "Optie aanmaken";
        public static String optieAanmakenCommandLowerCase = "optie aanmaken";
        public static String optieAanmakenCommandJoined = "OptieAanmaken";
        public static String optieAanmakenCommandJoinedLowerCase = "optieaanmaken";
        public static String optieAanmakenCommandJoinedFirstUpperCase = "Optieaanmaken";
        public static String optieAanmakenCommandJoinedLastUpperCase = "optieAanmaken";
    }

    public class offerteTonen{
        public static String offerteTonenCommand = "Offerte tonen";
        public static String offerteTonenCommandLowerCase = "offerte tonen";
        public static String offerteTonenCommandJoined = "OfferteTonen";
        public static String offerteTonenCommandJoinedLowerCase = "offertetonen";
        public static String offerteTonenCommandJoinedFirstUpperCase = "Offertetonen";
        public static String offerteTonenCommandJoinedLastUpperCase = "offerteTonen";
        public static String offerteTonenCommandAllCaps = "OFFERTE TONEN";
        public static String offerteTonenCommandJoinedAllCaps = "OFFERTETONEN";

    }

    public class offerteMaken {
        public static String offerteMakenCommand = "Offerte maken";
        public static String offerteMakenCommandeLowerCase = "offerte maken";
        public static String offerteMakenCommandJoined = "OfferteMaken";
        public static String offerteMakenCommandJoinedLowerCase = "offertemaken";
        public static String offerteMakenCommandJoinedFirstUpperCase = "Offertemaken";
    }

    public class optieVerwijderen{
        public static String optieVerwijderenCommand = "Optie verwijderen";
        public static String optieVerwijderenCommandLowerCase = "optie verwijderen";
        public static String optieVerwijderenCommandLastUpperCase = "optie Verwijderen";
        public static String optieVerwijderenCommandJoined = "Optieverwijderen";
        public static String optieVerwijderenCommandJoinedLowerCase = "optieverwijderen";
        public static String optieverwijderenCommandJoinedLastUpperCase = "optieVerwijderen";
    }
    public class optieToevoegen {
        public static String optieToevoegenCommand = "Optie toevoegen";
        public static String optieToevoegenCommandLowerCase = "optie toevoegen";
        public static String optieToevoegenCommandJoined = "optietoevoegen";
        public static String optieToevoegenCommandJoinedAllCaps = "OPTIETOEVOEGEN";
        public static String optieToevoegenCommandJoinedFirstUpperCase = "Optietoevoegen";
        public static String optieToevoegenCommandJoinedLastUpperCase = "optieToevoegen";
    }
    public class sluitApplicatie {
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
        public static String testCommand = "test";

        public class coloredText {
            public static String testColorTextCommand = "testcolor";
        }
    }
    public static ArrayList<String> commandExplanations = new ArrayList<String>();


    public static void initializeCommands() {
        commandExplanations.add(CommandExplanations.optieLijst);
        commandExplanations.add(CommandExplanations.optieAanmaken);
        commandExplanations.add(CommandExplanations.optieToevoegen);
        commandExplanations.add(CommandExplanations.offerteMaken);
        commandExplanations.add(CommandExplanations.sluitApplicatie);
        commandExplanations.add(CommandExplanations.offerteTonen);
        commandExplanations.add(CommandExplanations.optieVerwijderen);
        commandExplanations.add(CommandExplanations.KlantenTonen);
        commandExplanations.add(CommandExplanations.KlantAanmaken);
        commandExplanations.add(CommandExplanations.KlantTypeAanmaken);
        commandExplanations.add(CommandExplanations.KlantToewijzen);
        commandExplanations.add(CommandExplanations.KlantTypesTonen);
    }

}
