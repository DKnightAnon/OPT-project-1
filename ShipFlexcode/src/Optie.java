import java.util.ArrayList;

class Optie  {

    private String naam;
    private boolean isEssentieel;
    private double prijs;
    private boolean miliuekorting;
    private double percentageMiliuekorting = 10;

    public Optie(String naam,boolean isEssentieel, double prijs, boolean miliuekorting){
        this.naam = naam;
        this.isEssentieel = isEssentieel;
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

    public String getNaam(){
        return naam;
    }
    public boolean getIsEssentieel() {return isEssentieel;}
    public double getPrijs() {
        if (this.miliuekorting) {
            return prijs * (1 - (percentageMiliuekorting / 100));
        } else {
            return prijs;
        }
    }
    public boolean getMiliuekorting() {return miliuekorting;}
}