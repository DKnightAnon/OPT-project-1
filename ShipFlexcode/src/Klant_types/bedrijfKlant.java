package Klant_types;

public class bedrijfKlant extends Klant {

    private String klantType;
    private double klantKorting;

    public bedrijfKlant(String klantnaam, String klantType, double klantKorting) {
        super(klantnaam);
        this.klantType = klantType;
        this.klantKorting = klantKorting;
    }

    public String getKlantType() {
        return klantType;
    }

    public void setKlantType(String klantType) {
        this.klantType = klantType;
    }

    public double getKlantKorting() {
        return klantKorting;
    }

    public void setKlantKorting(double klantKorting) {
        this.klantKorting = klantKorting;
    }
}
