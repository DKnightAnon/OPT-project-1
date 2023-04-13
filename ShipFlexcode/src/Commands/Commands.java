package Commands;

import java.util.ArrayList;

public class Commands {

    public static final String commandError = "Dit commando bestaat niet.";

    private class CommandExplanations {
        private static final String optieLijst = "Optie lijst - Toont een lijst met alle beschikbare opties in het systeem.";
        private static final String optieAanmaken = "Optie aanmaken - Voegt aan de hand van ingevoerde informatie een nieuwe optie toe aan het systeem.";
        private static final String offerteTonen = "Offerte tonen - Weergeeft de huidige offerte weer op het scherm.";
        private static final String offerteMaken = "Offerte maken - Maakt een offerte aan en toont het op het scherm.";
        private static final String sluitApplicatie = "Afsluiten - Sluit de applicatie af.";
        private static final String optieToevoegen = "Optie toevoegen - Voegt een optie toe aan de offerte.";
        private static final String optieVerwijderen = "Optie verwijderen - Verwijdert een optie uit de offerte.";
        private static final String KlantenTonen = "Toon klanten - Print een lijst met alle geregistreerde klanten.";
        private static final String KlantAanmaken = "Klant aanmaken - Registreert een nieuwe klant.";
        private static final String KlantTypesTonen = "Klanttypes tonen - Print een lijst met alle geregistreerde klanttypes.";
        private static final String KlantTypeAanmaken = "Klanttype aanmaken - Maakt een nieuw type klant aan.";
        private static final String KlantToewijzen = "Klant toewijzen - Wijst een klant toe aan de huidige offerte.";
        private static final String KlantWeghalen = "Klant weghalen -Verwijdert de toegewezen klant van de huidige offerte.";
    }

    public class KlantAanmaken {
        public static final String klantAanmakenCommand = "Klant aanmaken";
        public static final String klantAanmakenCommandLowerCase = "klant aanmaken";
    }

    public class klantenTonen {
        public static final String klantTonenCommand = "Toon klanten";
        public static final String klantTonenCommandLowerCase = "toon klanten";
        public static final String klantTonenCommandJoined = "Toonklanten";
        public static final String klantTonenCommandJoinedLowerCase = "toonklanten";
    }

    public class KlantTypeAanmaken {
        public static final String klantTypeAanmakenCommand = "Klanttype aanmaken";
        public static final String klantTypeAanmakenCommandLowerCase = "klanttype aanmaken";
    }

    public class KlantTypesTonen {
        public static final String klantTypesTonenCommand = "Klanttypes tonen";
        public static final String klantTypesTonenCommandLowerCase = "klanttypes tonen";
    }


    public class offerteTonen {
        public static final String offerteTonenCommand = "Offerte tonen";
        public static final String offerteTonenCommandLowerCase = "offerte tonen";
        public static final String offerteTonenCommandJoined = "OfferteTonen";
        public static final String offerteTonenCommandJoinedLowerCase = "offertetonen";
        public static final String offerteTonenCommandJoinedFirstUpperCase = "Offertetonen";
        public static final String offerteTonenCommandJoinedLastUpperCase = "offerteTonen";
        public static final String offerteTonenCommandAllCaps = "OFFERTE TONEN";
        public static final String offerteTonenCommandJoinedAllCaps = "OFFERTETONEN";

    }

    public class offerteMaken {
        public static final String offerteMakenCommand = "Offerte maken";
        public static final String offerteMakenCommandeLowerCase = "offerte maken";
        public static final String offerteMakenCommandJoined = "OfferteMaken";
        public static final String offerteMakenCommandJoinedLowerCase = "offertemaken";
        public static final String offerteMakenCommandJoinedFirstUpperCase = "Offertemaken";
    }

    public class optieVerwijderen {
        public static final String optieVerwijderenCommand = "Optie verwijderen";
        public static final String optieVerwijderenCommandLowerCase = "optie verwijderen";
        public static final String optieVerwijderenCommandLastUpperCase = "optie Verwijderen";
        public static final String optieVerwijderenCommandJoined = "Optieverwijderen";
        public static final String optieVerwijderenCommandJoinedLowerCase = "optieverwijderen";
        public static final String optieverwijderenCommandJoinedLastUpperCase = "optieVerwijderen";
    }

    public class optieToevoegen {
        public static final String optieToevoegenCommand = "Optie toevoegen";
        public static final String optieToevoegenCommandLowerCase = "optie toevoegen";
        public static final String optieToevoegenCommandJoined = "optietoevoegen";
        public static final String optieToevoegenCommandJoinedAllCaps = "OPTIETOEVOEGEN";
        public static final String optieToevoegenCommandJoinedFirstUpperCase = "Optietoevoegen";
        public static final String optieToevoegenCommandJoinedLastUpperCase = "optieToevoegen";
    }

    public class KlantToewijzen {
        public static final String klantToewijzenCommand = "Klant toewijzen";
        public static final String klatToewijzenCommandLowerCase = "klant toewijzen";
    }

    public class KlantWeghalen {
        public static final String klantWeghalenCommand = "Klant weghalen";
        public static final String klantWegHalenCommandLowercase = "klant weghalen";
    }


    public class optieLijst {
        public static final String optieLijstCommand = "Optie lijst";
        public static final String optieLijstCommandLowerCase = "optie lijst";
        public static final String optieLijstCommandJoined = "Optielijst";
        public static final String optieLijstCommandJoinedLowerCase = "optielijst";
        public static final String optieLijstCommandJoinedAllcaps = "OPTIELIJST";
    }

    public class optieAanmaken {
        public static final String optieAanmakenCommand = "Optie aanmaken";
        public static final String optieAanmakenCommandLowerCase = "optie aanmaken";
        public static final String optieAanmakenCommandJoined = "OptieAanmaken";
        public static final String optieAanmakenCommandJoinedLowerCase = "optieaanmaken";
        public static final String optieAanmakenCommandJoinedFirstUpperCase = "Optieaanmaken";
        public static final String optieAanmakenCommandJoinedLastUpperCase = "optieAanmaken";
    }


    public class sluitApplicatie {
        public static final String sluitApplicatieCommand = "Afsluiten";
        public static final String sluitApplicatieCommandLowerCase = "afsluiten";
        public static final String sluitApplicatieCommandAllCaps = "AFSLUITEN";
    }

    public class help {
        public static final String helpCommand = "Help";
        public static final String helpCommandLowerCase = "help";
        public static final String helpCommandAllCaps = "HELP";
    }

    public class Test {
        public static final String testCommand = "test";

        public class coloredText {
            public static final String testColorTextCommand = "testcolor";
        }
    }

    public static final ArrayList<String> commandExplanations = new ArrayList<String>();


    public static final void initializeCommands() {
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
        commandExplanations.add(CommandExplanations.KlantWeghalen);
    }

}
