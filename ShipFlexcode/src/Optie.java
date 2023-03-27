import java.util.ArrayList;

class Optie  {

    private boolean isEssentieel;
    private String naam;
    private String beschrijving;
    private double prijs;
    private boolean miliuekorting;
    private double percentageMiliuekorting = 10;

    public Optie(boolean isEssentieel, String naam, String beschrijving, double prijs, boolean miliuekorting){
        this.isEssentieel = isEssentieel;
        this.naam = naam;
        this.beschrijving = beschrijving;
        this.prijs = prijs;
        this.miliuekorting = miliuekorting;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setEssentieel(boolean essentieel) {this.isEssentieel = essentieel;}
    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
    public void setMiliuekorting(boolean miliuekorting) {this.miliuekorting = miliuekorting;}

    public void setBeschrijving(String beschrijving) {this.beschrijving = beschrijving;}

    public void setPercentageMiliuekorting(double percentageMiliuekorting) {
        this.percentageMiliuekorting = percentageMiliuekorting;
    }

    public String getNaam(){
        return naam;
    }
    public boolean getIsEssentieel() {return isEssentieel;}

    public String getBeschrijving() {return beschrijving;}

    public double getPercentageMiliuekorting() {
        return percentageMiliuekorting;
    }

    public double getPrijs() {

        return prijs;
    }

    public double getPrijsMinKorting() {
        if (this.miliuekorting) {
            return prijs * (1 - (percentageMiliuekorting / 100));
        } else {
            return prijs;
        }
    }

    public boolean getMiliuekorting() {return miliuekorting;}
}