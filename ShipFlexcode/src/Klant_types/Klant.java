package Klant_types;

public class Klant implements EmptyChecker{

    private String klantNaam;
    private KlantType klantSoort = new KlantType(0, "dummy");


    public Klant(String klantNaam, KlantType klantSoort) {
        this.klantNaam = klantNaam;
        this.klantSoort = klantSoort;
    }

    public Klant(String klantNaam, String klantsoort, String KlantKorting) {
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

    public boolean isEmpty() {
        if (this.klantSoort == null && this.klantNaam == null) {
            return true;
        } else {
            return false;
        }
    }
}