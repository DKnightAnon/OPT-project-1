import Commands.Commands;
import Commands.TextColors;
import Opties.OptieLijst;

import java.io.Console;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SystemInterface {
    private Commands commands = new Commands();
    private OptieLijst standardOpties = new OptieLijst();
    private boolean running = true;
    Scanner scanner = new Scanner(System.in);


    private String welcomeMessage = "Welkom bij ShipFlex!\nVoer 'help' in voor een overzicht van alle commands.";

    public void Runtime() throws FileNotFoundException {

        System.out.printf(welcomeMessage+"\n");
        initialize();
        while (running) {
            String input = scanner.nextLine();

            if (
                    input.equals(Commands.help.helpCommand)
                 || input.equals(Commands.help.helpCommandLowerCase)
                 || input.equals(Commands.help.helpCommandAllCaps)
            ){
                help();
            }
            else if (
                   input.equals(Commands.optieLijst.optieLijstCommand)
                || input.equals(Commands.optieLijst.optieLijstCommandJoined)
                || input.equals(Commands.optieLijst.optieLijstCommandLowerCase)
                || input.equals(Commands.optieLijst.optieLijstCommandJoinedLowerCase)
                || input.equals(Commands.optieLijst.optieLijstCommandJoinedAllcaps)
            ){
                printOptieLijst();
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
            }
            else if (input.equals(Commands.offerteMaken.offerteMakenCommand)) {

            }
            else if (
                    input.equals(Commands.sluitApplicatie.sluitApplicatieCommand)
                 || input.equals(Commands.sluitApplicatie.sluitApplicatieCommandLowerCase)
                 || input.equals(Commands.sluitApplicatie.sluitApplicatieCommandAllCaps)
            ) {
                exitSystem();
            }else if (input.equals(Commands.Test.testColorTextCommand)) {
                testColoredTextPrint();
            }else
                {
                    commandError();
                }
            }

        }



    private void help() {
        System.out.println("U kunt kiezen uit de volgende commando's :");
       for (int i = 0;i<commands.commandExplanations.size();i++) {
           System.out.println(commands.commandExplanations.get(i));
       }
    }

    private void exitSystem() {
        System.exit(0);
        //Status of 0 indicates successful termination.
    }

    private void initialize(){
        Commands.initializeCommands();
    }

    private void optieAanmaken() throws FileNotFoundException {
        //Deze method gooit een foutmelding in de IDE omdat er een console wordt gebruikt.
        //Om deze foutmeldingen te vermijden moet main.java via de Command Interface aangeroepen worden.
        //Navigeer naar de folder waar Main.java in staat, en gebruik het command javac 'Main.java'
        //Gebruik vervolgens het command 'java Main'
        //Momenteel wordt er nog een error gegooid omdat opties.csv dan niet gevonden kan worden.

        boolean finished = false;
        String essentieel = "";
        String naam = "";
        String beschrijving = "";
        String prijs = "";
        String korting = "";
        System.out.println("Is de nieuwe optie een essentiele optie? (j/n)");

//        standardOpties.nieuweOptie("j","testing","testingnieuweoptiehardcodedvanuitSystemInterface","13.68","n");
        while (!finished) {
            Console console = System.console();
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

    }


    private void testColoredTextPrint() {
        System.out.println(TextColors.Text.ANSI_YELLOW
                + "This text is yellow"
                + TextColors.Text.ANSI_RESET);

    }

    private void commandError(){
        System.out.println(commands.commandError);
    }
}
