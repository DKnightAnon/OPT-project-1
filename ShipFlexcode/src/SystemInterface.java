import Opties.OptieLijst;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SystemInterface {
    Commands commands = new Commands();
    OptieLijst standardOpties = new OptieLijst();
    boolean running = true;


    private String welcomeMessage = "Welkom bij ShipFlex!\nVoer 'help' in voor een overzicht van alle commands.";

    public void Runtime() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(welcomeMessage+"\n");
        while (running) {
            String input = scanner.nextLine();

            if (input.equals(commands.helpCommand)){
                help();
            }
            if (input.equals(commands.optieLijstCommand)){
                standardOpties.printOptieLijst();
            }
            if (input.equals(commands.optieAanmakenCommand)){
                System.out.println("Is de nieuwe optie een essentiele optie? j/n");
                String essentieel = input;
                System.out.println("Wat is de naam van deze optie?");
                String naam = input;
                System.out.println("Wat is de beschrijving voor deze optie?");
                String beschrijving = input;
                System.out.println("Voer de prijs van de nieuwe optie in : (Heel getal of een decimaal getal waarmee de decimalen achter een ' . '(punt)  staan) ");
                String prijs = input;
                System.out.println("Heeft deze optie milieukorting? j/n");
                String korting = input;
                standardOpties.nieuweOptie(essentieel,naam,beschrijving,prijs,korting);
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





}
