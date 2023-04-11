import Commands.Commands;
import Commands.TextColors;
import Klant_types.KlantLijst;
import Offerte.OfferteNieuw;
import Opties.Optie;
import Opties.OptieLijst;

import java.io.Console;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class SystemInterface {
    private Commands commands = new Commands();
    private OptieLijst standardOpties = new OptieLijst();
    private OfferteNieuw huidigeOfferte = new OfferteNieuw();
    private KlantLijst standardKlanten = new KlantLijst();

    private boolean running = true;
    Scanner scanner = new Scanner(System.in);

    //ANSI_BLUE for prompts
    //ANSI_YELLOW for additional information
    //ANSI_PURPLE for Command explanations

    private String welcomeMessage = "Welkom bij ShipFlex!\nVoer 'help' in voor een overzicht van alle commands.";

    public void Runtime() throws FileNotFoundException {

        System.out.printf(welcomeMessage+"\n");
        initialize();
        promptText();
        while (running) {
            String input = scanner.nextLine();

            if (
                    input.equals(Commands.help.helpCommand)
                 || input.equals(Commands.help.helpCommandLowerCase)
                 || input.equals(Commands.help.helpCommandAllCaps)
            ){
                help();
                promptText();
            }
            else if (
                   input.equals(Commands.optieLijst.optieLijstCommand)
                || input.equals(Commands.optieLijst.optieLijstCommandJoined)
                || input.equals(Commands.optieLijst.optieLijstCommandLowerCase)
                || input.equals(Commands.optieLijst.optieLijstCommandJoinedLowerCase)
                || input.equals(Commands.optieLijst.optieLijstCommandJoinedAllcaps)
            ){
                printOptieLijst();
                promptText();
            }
            else if (
                   input.equals(Commands.optieAanmaken.optieAanmakenCommand)
                || input.equals(Commands.optieAanmaken.optieAanmakenCommandJoined)
                || input.equals(Commands.optieAanmaken.optieAanmakenCommandLowerCase)
                || input.equals(Commands.optieAanmaken.optieAanmakenCommandJoinedLowerCase)
                || input.equals(Commands.optieAanmaken.optieAanmakenCommandJoinedFirstUpperCase)
                || input.equals(Commands.optieAanmaken.optieAanmakenCommandJoinedLastUpperCase)
            ){
                optieAanmaken();
                promptText();
            }
            else if (input.equals(Commands.offerteMaken.offerteMakenCommand)) {
                WIP();
                promptText();
            }
            else if (
                  input.equals(Commands.optieVerwijderen.optieVerwijderenCommand)
                ||input.equals(Commands.optieVerwijderen.optieVerwijderenCommandLowerCase)
                ||input.equals(Commands.optieVerwijderen.optieVerwijderenCommandLastUpperCase)
                ||input.equals(Commands.optieVerwijderen.optieVerwijderenCommandJoined)
                ||input.equals(Commands.optieVerwijderen.optieVerwijderenCommandJoinedLowerCase)
                ||input.equals(Commands.optieVerwijderen.optieverwijderenCommandJoinedLastUpperCase)
                    )
            {
                verwijderOptieVanOfferte();
                promptText();
            }
            else if (
                  input.equals(Commands.optieToevoegen.optieToevoegenCommand)
                ||input.equals(Commands.optieToevoegen.optieToevoegenCommandLowerCase)
                ||input.equals(Commands.optieToevoegen.optieToevoegenCommandJoined)
                ||input.equals(Commands.optieToevoegen.optieToevoegenCommandJoinedAllCaps)
                ||input.equals(Commands.optieToevoegen.optieToevoegenCommandJoinedFirstUpperCase)
                ||input.equals(Commands.optieToevoegen.optieToevoegenCommandJoinedLastUpperCase)
            ) {
                voegOptieToeAanOfferte();
                promptText();
            }
            else if (
                    input.equals(Commands.offerteTonen.offerteTonenCommand)
                ||input.equals(Commands.offerteTonen.offerteTonenCommandJoined)
                ||input.equals(Commands.offerteTonen.offerteTonenCommandLowerCase)
                ||input.equals(Commands.offerteTonen.offerteTonenCommandAllCaps)
                ||input.equals(Commands.offerteTonen.offerteTonenCommandJoinedLowerCase)
                ||input.equals(Commands.offerteTonen.offerteTonenCommandJoinedFirstUpperCase)
                ||input.equals(Commands.offerteTonen.offerteTonenCommandJoinedLastUpperCase)
            ) {
             huidigeOfferte.printGeselecteerdeOpties();
                promptText();
            }
            else if (
                    input.equals(Commands.klantenTonen.klantTonenCommand)
                ||input.equals(Commands.klantenTonen.klantTonenCommandLowerCase)
                ||input.equals(Commands.klantenTonen.klantTonenCommandJoined)
                ||input.equals(Commands.klantenTonen.klantTonenCommandJoinedLowerCase)
            ){
                standardKlanten.printKlantenLijst();
                promptText();
            }
            else if (
                    input.equals(Commands.KlantAanmaken.klantAanmakenCommand)
                ||input.equals(Commands.KlantAanmaken.klantAanmakenCommandLowerCase)
            ){
                WIP();
                promptText();
            }
            else if (
                    input.equals(Commands.KlantTypeAanmaken.klantTypeAanmakenCommand)
                ||input.equals(Commands.KlantTypeAanmaken.klantTypeAanmakenCommandLowerCase))
            {
                klantTypeAanmaken();
                promptText();
            }
            else if (
                    input.equals(Commands.KlantTypesTonen.klantTypesTonenCommand)
                    ||input.equals(Commands.KlantTypesTonen.klantTypesTonenCommandLowerCase)
            ) {
                klantTypesTonen();
                promptText();
            }
            else if (
                    input.equals(Commands.sluitApplicatie.sluitApplicatieCommand)
                 || input.equals(Commands.sluitApplicatie.sluitApplicatieCommandLowerCase)
                 || input.equals(Commands.sluitApplicatie.sluitApplicatieCommandAllCaps)
            ) {
                exitSystem();
            }else if (input.equals(Commands.Test.testCommand)) {
                AvailableTests();
                promptText();
            }
            else if (input.equals(Commands.Test.coloredText.testColorTextCommand)){
                testColoredTextPrint();
                promptText();
            }
            else
                {
                    commandError();
                }
            }

        }

        private void voegOptieToeAanOfferte(){
        boolean optiesToevoegenFinished = false;
        System.out.println("Voer de optienummer in van de optie dat u wilt toevoegen aan de offerte.");
            while (!optiesToevoegenFinished) {
                int index = scanner.nextInt();
                voegOptieToe(index);
                optiesToevoegenFinished = true;
            }
////        while (!optiesToevoegenFinished) {
//            int index = scanner.nextInt();
//            voegOptieToe(index);
//
////Dit stuk code werkt nu nog niet, maar het is de bedoeling dat het dan loopt en je nieuwe opties laat toevoegen.
//
////            String input = scanner.nextLine();
////            System.out.println("Wilt u nog een optie toevoegen? (j/n)");
////            if (input.equals("j")){
////                System.out.println("Voer de optienummer in van de optie dat u wilt toevoegen aan de offerte.");
////                index = scanner.nextInt();
////                voegOptieToe(index);
////            }else if (input.equals("n")){
////                optiesToevoegenFinished = true;
////            }
//        }
        }
    private void verwijderOptieVanOfferte(){
        boolean optiesVerwijderenFinished = false;
        System.out.println("Voer de optienummer in van de optie dat u wilt verwijderen van de offerte.\n"
                + TextColors.Text.ANSI_YELLOW
                + "     Let erop dat u het optienummer kiest dat vermeldt staat in de offerte."
                + TextColors.Text.ANSI_RESET
        );

        while (!optiesVerwijderenFinished) {
            int index = scanner.nextInt();
            verwijderOptie(index);
            optiesVerwijderenFinished = true;
        }

    }
        private void voegOptieToe(int index) {
            huidigeOfferte.geselecteerdeOpties.add(
                    standardOpties.optielijst.get(index)
            );
            System.out.println(
                    standardOpties.optielijst.get(index).getNaam()
            );
        }

        private void verwijderOptie(int index) {
        System.out.println(huidigeOfferte.geselecteerdeOpties.get(index).getNaam() + "verwijderd!");
        huidigeOfferte.geselecteerdeOpties.remove(index);
        }

    private void help() {
        System.out.println("U kunt kiezen uit de volgende commando's :");
       for (int i = 0;i<commands.commandExplanations.size();i++) {
           System.out.println(TextColors.Text.ANSI_PURPLE + commands.commandExplanations.get(i) + TextColors.Text.ANSI_RESET);
       }
       promptText();
    }

    private void exitSystem() {
        System.exit(0);
        //Status of 0 indicates successful termination.
    }

    private void initialize(){
        Commands.initializeCommands();
        standardOpties.readFromCSV();
        huidigeOfferte.geselecteerdeOpties.add(
                new Optie(false,
                        "placeHolder",
                        "Placeholder zodat index vanaf 1 kan beginnen",
                        00.00,
                        false)
        );
        standardKlanten.readFromCSV();
    }

    private void optieAanmaken() throws FileNotFoundException {
        //Deze method gooit een foutmelding in de IDE omdat er een console wordt gebruikt.
        //Om deze foutmeldingen te vermijden moet main.java via de Command Interface aangeroepen worden.
        //Navigeer naar de folder waar Main.java in staat, en gebruik het command javac 'Main.java'
        //Gebruik vervolgens het command 'java Main'
        //Momenteel wordt er nog een error gegooid omdat opties.csv dan niet gevonden kan worden.
        //08-04-2023 : Deze methode werkt nu wel.

        boolean finished = false;
        String essentieel = "";
        String naam = "";
        String beschrijving = "";
        String prijs = "";
        String korting = "";
        System.out.println("Is de nieuwe optie een essentiele optie? (j/n)");

//        standardOpties.nieuweOptie("j","testing","testingnieuweoptiehardcodedvanuitSystemInterface","13.68","n");
        while (!finished) {
            String input = scanner.nextLine();

            if (input.equals("j")) {
                essentieel = "true";

                        System.out.println("Wat is de naam van deze optie?");
                        String input1 = scanner.nextLine();

                        if (!input1.equals("")) {
                            naam = input1;
                        }

                        System.out.println("Wat is de beschrijving voor deze optie?");
                        String input2 = scanner.nextLine();

                        if (!input2.isEmpty()) {
                            beschrijving = input2;
                        }


                        System.out.println("Voer de prijs van de nieuwe optie in : " +
                                TextColors.Text.ANSI_YELLOW +
                                "(Heel getal of een decimaal getal waarmee de decimalen achter een ' . '(punt)  staan) " +
                                TextColors.Text.ANSI_RESET
                        );
                        String input3 = scanner.nextLine();
                        if (!input3.isEmpty()) {
                            prijs = input3;
                        }

                        System.out.println("Heeft deze optie milieukorting? (j/n)");
                        String input4 = scanner.nextLine();
                        if (input4.equals("j")) {
                            korting = "true";
                        }else {
                            korting = "false";
                        }

                standardOpties.nieuweOptie(essentieel, naam, beschrijving, prijs, korting);
                        finished = true;
            } else {
                essentieel = "false";
                        System.out.println("Wat is de naam van deze optie?");
                        String input1 = scanner.nextLine();

                        if (!input1.equals("")) {
                            naam = input1;
                        }


                        System.out.println("Wat is de beschrijving voor deze optie?");
                        String input2 = scanner.nextLine();
                        if (!input2.isEmpty()) {
                            beschrijving = input2;
                        }


                        System.out.println("Voer de prijs van de nieuwe optie in : (Heel getal of een decimaal getal waarmee de decimalen achter een ' . '(punt)  staan) ");
                        String input3 = scanner.nextLine();
                        if (!input3.isEmpty()) {
                            prijs = input3;
                        }


                        System.out.println("Heeft deze optie milieukorting? (j/n)");
                        String input4 = scanner.nextLine();
                        if (input4.equals("j")) {
                            korting = "true";
                        }else {
                            korting = "false";
                        }
                standardOpties.nieuweOptie(essentieel, naam, beschrijving, prijs, korting);
                        finished = true;
            }



        }
        System.out.println(
                TextColors.Text.ANSI_YELLOW+
                "Optie hoort aangemaakt te zijn. U kunt nu verder met andere commands."+
                TextColors.Text.ANSI_RESET);

    }

    private void printOptieLijst(){
        standardOpties.printOptieLijst();
        promptText();

    }

    private void klantTypesTonen(){
        standardKlanten.printKlantTypes();
    }

    private void klantTypeAanmaken() throws FileNotFoundException {
        boolean finished = false;
        double klantkorting;
        String klantsoort;

        System.out.println("Vul in wat voor soort klant dit is.\n" +
                TextColors.Text.ANSI_YELLOW +
                "(Bijv. Overheid of Particulier)" +
                TextColors.Text.ANSI_RESET
        );

        while (!finished){
            String input = scanner.nextLine();
            klantsoort = input;

            System.out.println("Voer de prijs van het nieuwe klant type in : " +
                    TextColors.Text.ANSI_YELLOW +
                    "(Heel getal of een decimaal getal waarmee de decimalen achter een ' . '(punt)  staan) " +
                    TextColors.Text.ANSI_RESET
            );
            input = scanner.nextLine();
            klantkorting = Double.valueOf(input);

            standardKlanten.nieuweKlantSoort(klantkorting,klantsoort);
            finished = true;
        }


    }

    private void klantAanmaken() throws FileNotFoundException {
        boolean finished = false;
        String klantNaam;
        int index;


        while (!finished){
            System.out.println("Vul de naam van de nieuwe klant in.");
            String input = scanner.nextLine();
            klantNaam = input;
            System.out.println("Voer het nummer in van het klanttype waar de nieuwe klant bij hoort.");
            int inputint = scanner.nextInt();
            index = inputint;
            standardKlanten.nieuweKlant(
                    klantNaam,
                    index
            );

            System.out.println();
            finished = true;
        }
    }




    private void WIP(){
        System.out.println("Dit moet nog afgemaakt worden.");
    }
    private void commandError(){
        System.out.println(commands.commandError);
        promptText();
    }

    private void promptText(){
        String prompt = "Vul een command in.";
        System.out.println(
                TextColors.Text.ANSI_BLUE+
                prompt+
                TextColors.Text.ANSI_RESET
        );
    }
    private void testColoredTextPrint() {
        TextColors.initialize();
        for (int i = 0;i<TextColors.TextColors.size();i++){
            System.out.println(
                    TextColors.TextColors.get(i) +
                            "This text is colored!" +
                            TextColors.Text.ANSI_RESET
            );
        }

    }
    private void AvailableTests(){
        boolean testFinished = false;
        ArrayList<String> availableTests = new ArrayList<>();
        availableTests.add("placeholder, index of 0");
        availableTests.add("testColoredTextPrint");


        System.out.println("Kies een test om te runnen.");
        for (int i = 1;i<availableTests.size();i++) {
            System.out.println(
                TextColors.Text.ANSI_PURPLE+
                String.valueOf(availableTests.indexOf(availableTests.get(i)))+
                ". "+
                availableTests.get(i)+
                TextColors.Text.ANSI_RESET);
        }
        while (!testFinished) {
            int chosenTest = scanner.nextInt();

            if (chosenTest == 1) {
                testColoredTextPrint();
                testFinished=true;
            }

        }


    }
}
