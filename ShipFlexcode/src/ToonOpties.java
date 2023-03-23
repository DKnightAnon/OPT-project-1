public class ToonOpties {
    private ArrayList<Optie> optiesLijst = getOptiesExtra().addAll(getOptiesEssentieel);
    private ArrayList<Optie> optiesGeselecteerd;

    public ArrayList<Optie> getOptiesLijst() {
        return optiesLijst;
    }

    public ArrayList<Optie> getOptiesGeselecteerd() {
        return optiesGeselecteerd;
    }

    public void toonOptiesLijst() {
        double prijsTotaal;
        for (Optie optie : optiesLijst) {
            prijsTotaal += optie.getPrijs();
            System.out.println("Alle opties:");
            System.out.println("Naam: " + optie.getNaam());
            System.out.println("Beschrijving: " + optie.getBeschrijving());
            System.out.println("Essentieel: " + optie.getEssentieel());
            System.out.println("Prijs: " + optie.getPrijs());
            System.out.println();
        }
        System.out.println("Totaalprijs: " + prijsTotaal);
        System.out.println();
    }

    public void toonOptiesGeselecteerd() {
        double prijsTotaal;
        for (Optie optie : optiesGeselecteerd) {
            prijsTotaal += optie.getPrijs();
            System.out.println("Geselecteerde opties:");
            System.out.println("Naam: " + optie.getNaam());
            System.out.println("Beschrijving: " + optie.getBeschrijving());
            System.out.println("Essentieel: " + optie.getEssentieel());
            System.out.println("Prijs: " + optie.getPrijs());
            System.out.println();
        }
        System.out.println("Totaalprijs: " + prijsTotaal);
        System.out.println();
    }
}
