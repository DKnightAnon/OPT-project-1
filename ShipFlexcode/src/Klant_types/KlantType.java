package Klant_types;

public class KlantType {

    private double klantKorting;
    private String klantSoort;

    public KlantType(double klantKorting, String klantSoort) {
        this.klantKorting = klantKorting;
        this.klantSoort = klantSoort;
    }

    public KlantType(String klantKorting, String klantSoort) {
        this.klantKorting = Double.valueOf(klantKorting);
        this.klantSoort = klantSoort;
    }

    public double getKlantKorting() {
        return klantKorting;
    }

    public void setKlantKorting(double klantKorting) {
        this.klantKorting = klantKorting;
    }

    public String getKlantSoort() {
        return klantSoort;
    }

    public void setKlantSoort(String klantSoort) {
        this.klantSoort = klantSoort;
    }
}
