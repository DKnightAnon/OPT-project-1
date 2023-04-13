package Klant_types;

import java.io.*;
import java.util.ArrayList;

public class KlantLijst {


    public ArrayList<Klant> KlantenLijst = new ArrayList<>();
    public ArrayList<KlantType> KlantTypes = new ArrayList<>();
    private String KlantPath =
            "ShipFlexcode/src/CSV_Files/klanten.csv";
    private String klantSoortPath =
            "ShipFlexcode/src/CSV_Files/klantSoorten.csv";


    public void writeToCSV() throws FileNotFoundException {
        writeToKlantLijst();
        writeToKlantSoort();
    }

    public void readFromCSV() {
        readFromKlantLijst();
        readFromKlantSoort();
    }

    private void readFromKlantLijst() {
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(KlantPath));
            KlantenLijst.clear();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                KlantenLijst.add(new Klant(row[0], row[1], row[2]));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void readFromKlantSoort() {
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(klantSoortPath));
            KlantTypes.clear();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                KlantTypes.add(new KlantType(row[0], row[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeToKlantLijst() throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();

        File csv = new File(KlantPath);
        PrintWriter pw = new PrintWriter(csv);

        try {
            for (int i = 0; i < KlantenLijst.size(); i++) {
                builder.append(KlantenLijst.get(i).getKlantNaam());
                builder.append(",");
                builder.append(KlantenLijst.get(i).getKlantSoort().getKlantSoort());
                builder.append(",");
                builder.append(KlantenLijst.get(i).getKlantSoort().getKlantKorting());
                builder.append("\n");
            }
            pw.write(String.valueOf(builder));
            pw.flush();
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeToKlantSoort() throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();

        File csv = new File(klantSoortPath);
        PrintWriter pw = new PrintWriter(csv);

        try {
            for (int i = 0; i < KlantTypes.size(); i++) {
                builder.append(KlantTypes.get(i).getKlantSoort());
                builder.append(",");
                builder.append(KlantTypes.get(i).getKlantKorting());
                builder.append("\n");
            }
            pw.write(String.valueOf(builder));
            pw.flush();
            pw.close();

        } catch (Exception e) {

        }

    }

    public void nieuweKlant(String naam, int Index) throws FileNotFoundException {
        Klant nieuweKlant = new Klant(naam, KlantTypes.get(Index));
        readFromKlantLijst();
        KlantenLijst.add(nieuweKlant);
        writeToCSV();
    }

    public void nieuweKlantSoort(Double klantkorting, String klantsoort) throws FileNotFoundException {
        KlantType nieuwKlantType = new KlantType(klantkorting, klantsoort);
        readFromKlantSoort();
        KlantTypes.add(nieuwKlantType);
        writeToKlantSoort();

    }

    public void printKlantenLijst() {
        readFromCSV();

        for (int i = 0; i < 92; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("| %-15s| %-30s| %-20s| %-16s|\n",
                "Klantnummer",
                "Klantnaam",
                "Klant type",
                "Klant korting in %"
        );
        for (int i = 0; i < 92; i++) {
            System.out.print("-");
        }
        System.out.println();
        if (KlantenLijst.isEmpty()) {
            System.out.print("|");
            for (int i = 0; i < 90; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        } else {
            for (int i = 0; i < KlantenLijst.size(); i++) {
                System.out.printf(
                        "| %-15s| %-30s| %-20s| %-18s|\n",
                        KlantenLijst.indexOf(KlantenLijst.get(i)),
                        KlantenLijst.get(i).getKlantNaam(),
                        KlantenLijst.get(i).getKlantSoort().getKlantSoort(),
                        KlantenLijst.get(i).getKlantSoort().getKlantKorting()
                );
            }
        }
        for (int i = 0; i < 92; i++) {
            System.out.print("-");
        }
        System.out.println();

    }

    public void printKlantTypes() {

        for (int i = 0; i < 57; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("| %-15s| %-20s| %-10s|\n",
                "Klanttype nr.",
                "Klant type",
                "Klant korting %"
        );
        for (int i = 0; i < 57; i++) {
            System.out.print("-");
        }
        System.out.println();
        if (KlantTypes.isEmpty()) {
            System.out.print("|");
            for (int i = 0; i < 55; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
            for (int i = 0; i < 57; i++) {
                System.out.print("-");
            }
            System.out.println();
        } else {
            for (int i = 1; i < KlantTypes.size(); i++) {
                System.out.printf(
                        "| %-15d| %-20s| %-15s|\n",
                        KlantTypes.indexOf(KlantTypes.get(i)),
                        KlantTypes.get(i).getKlantSoort(),
                        KlantTypes.get(i).getKlantKorting()
                );
            }
            for (int i = 0; i < 57; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
