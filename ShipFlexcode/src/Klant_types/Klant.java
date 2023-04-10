package Klant_types;

public class Klant {

    private String klantNaam;
    private KlantType klantSoort;

    public Klant(String klantNaam, KlantType klantSoort) {
        this.klantNaam = klantNaam;
        this.klantSoort = klantSoort;
    }

    public Klant(String klantNaam, String klantsoort, String KlantKorting){
        this.klantNaam = klantNaam;
        this.klantSoort.setKlantSoort(klantsoort);
        this.klantSoort.setKlantKorting(Double.valueOf(KlantKorting));
    }

    public String getKlantNaam() {
        return klantNaam;
    }

    public void setKlantNaam(String klantNaam) {
        this.klantNaam = klantNaam;
    }

    public KlantType getKlantSoort() {
        return klantSoort;
    }

    public void setKlantSoort(KlantType klantSoort) {
        this.klantSoort = klantSoort;
    }
}