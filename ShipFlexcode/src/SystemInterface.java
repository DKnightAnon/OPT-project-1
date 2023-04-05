import Opties.OptieLijst;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SystemInterface {
    private Commands commands = new Commands();
    private OptieLijst standardOpties = new OptieLijst();
    private boolean running = true;


    private String welcomeMessage = "Welkom bij ShipFlex!\nVoer 'help' in voor een overzicht van alle commands.";

    public void Runtime() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
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
                optieAanmaken(scanner, input);
            }
            else if (
                    input.equals(Commands.sluitApplicatie.sluitApplicatieCommand)
                 || input.equals(Commands.sluitApplicatie.sluitApplicatieCommandLowerCase)
                 || input.equals(Commands.sluitApplicatie.sluitApplicatieCommandAllCaps)
            ) {
                exitSystem();
            }else {
                commandError();
            }

        }

    }

    private void help() {
        System.out.println("U kunt kiezen uit de volgende commando's :");
       for (int i = 0;i<commands.commandExplantions.size();i++) {
           System.out.println(commands.commandExplantions.get(i));
       }
    }

    private void exitSystem() {
        System.exit(0);
        //Status of 0 indicates successful termination.
    }

    private void initialize(){
        Commands.initializeCommands();
    }

    private void optieAanmaken(Scanner scanner, String Input) throws FileNotFoundException {

        boolean finished = false;
        String essentieel = "";
        String naam = "";
        String beschrijving = "";
        String prijs = "";
        String korting = "";
        System.out.println("Is de nieuwe optie een essentiele optie? j/n");
        while (!finished) {
             String input = System.console().readLine();


            if (input.equals("j")) {
                essentieel = "true";
            } else {
                essentieel = "false";
            }

            System.out.println("Wat is de naam van deze optie?");
            if (!input.equals("")) {
                naam = input;
            }

            System.out.println("Wat is de beschrijving voor deze optie?");
            if (!input.isEmpty()) {
                beschrijving = input;
            }

            System.out.println("Voer de prijs van de nieuwe optie in : (Heel getal of een decimaal getal waarmee de decimalen achter een ' . '(punt)  staan) ");
            if (!input.isEmpty()) {
                prijs = input;
            }

            System.out.println("Heeft deze optie milieukorting? j/n");
            if (input.equals("j")) {
                korting = "true";
            }else {
                korting = "false";
            }

            standardOpties.nieuweOptie(essentieel, naam, beschrijving, prijs, korting);
        }
    }

    private void printOptieLijst(){
        standardOpties.printOptieLijst();

    }

    private void commandError(){
        System.out.println(commands.commandError);
    }
}
