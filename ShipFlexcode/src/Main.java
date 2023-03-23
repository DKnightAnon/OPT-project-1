import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        Offerte offerte1 = new Offerte();
        Optie optie1 = new Optie("Navigatiesysteem", true, 50, false);
        Optie optie2 = new Optie("Motor", true, 50, true);
        Optie optie3 = new Optie("Roer", true, 50, false);
        Optie optie4 = new Optie("Brandstoftank", true, 50, true);
        Optie optie5 = new Optie("anker", true, 50, false);
        Optie optie6 = new Optie("Airconditioning", false,20, false);
        Optie optie7 = new Optie("Sonar", false,20, false);
        Optie optie8 = new Optie("Extra pks", false,20, false);

        offerte1.opties.add(optie1);
        offerte1.opties.add(optie2);
        offerte1.opties.add(optie3);
        offerte1.opties.add(optie4);
        offerte1.opties.add(optie5);
        offerte1.opties.add(optie6);

        offerte1.maakOfferte();

    }
}