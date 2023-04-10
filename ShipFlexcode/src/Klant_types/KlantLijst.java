package Klant_types;

import java.io.*;
import java.util.ArrayList;

public class KlantLijst {


    ArrayList<Klant> KlantenLijst = new ArrayList<>();
    ArrayList<KlantType> KlantTypes = new ArrayList<>();
    private String KlantPath = "Shipflexcode/src/CSV_Files/klanten.csv" ;
    private String klantSoortPath = "Shipflexcode/src/CSV_Files/klantSoorten.csv";


    public void writeToCSV() throws FileNotFoundException {
        writeToKlantLijst();
        writeToKlantSoort();
    }

    public void readFromCSV(){

    }

    private void readFromKlantLijst(){
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(KlantPath));
            KlantenLijst.clear();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                KlantenLijst.add(new Klant(row[0],row[1],row[2]));
            }

        }catch (Exception e){
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
                KlantTypes.add(new KlantType(row[0],row[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        private void writeToKlantLijst() throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();

        File csv = new File(KlantPath);
        PrintWriter pw = new PrintWriter(csv);

        try{
            for (int i = 0;i<KlantenLijst.size();i++){
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

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void writeToKlantSoort() throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();

        File csv = new File(klantSoortPath);
        PrintWriter pw = new PrintWriter(csv);

        try {
            for (int i = 0; i<KlantTypes.size();i++){
                builder.append(KlantTypes.get(i).getKlantSoort());
                builder.append(",");
                builder.append(KlantTypes.get(i).getKlantKorting());
                builder.append("\n");
            }
            pw.write(String.valueOf(builder));
            pw.flush();
            pw.close();

        }catch (Exception e) {

        }

    }

    public void nieuweKlant(String naam, int Index){
        Klant nieuweKlant = new Klant(naam,KlantTypes.get(Index));
        readFromKlantLijst();
        KlantenLijst.add(nieuweKlant);
    }

    public void nieuweKlantSoort(Double klantkorting, String klantsoort){
        KlantType nieuwKlantType = new KlantType(klantkorting, klantsoort);

    }

}
