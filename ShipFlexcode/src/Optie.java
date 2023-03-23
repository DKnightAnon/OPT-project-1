import java.util.ArrayList;

class Optie  {

    private String naam;
    private boolean essentieel;
    private double prijs;
    private boolean miliuekorting;
    private double percentageMiliuekorting = 10;

    public Optie(String naam,boolean essentieel, double prijs, boolean miliuekorting){
        this.naam = naam;
        this.essentieel = essentieel;
        this.prijs = prijs;
        this.miliuekorting = miliuekorting;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setEssentieel(boolean essentieel) {this.essentieel = essentieel;}
    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
    public void setMiliuekorting(boolean miliuekorting) {this.miliuekorting = miliuekorting;}

    public String getNaam(){
        return naam;
    }
    public boolean getEssentieel() {return essentieel;}
    public double getPrijs() {
        if (this.miliuekorting) {
            return prijs * (1 - (percentageMiliuekorting / 100));
        } else {
            return prijs;
        }
    }
    public boolean getMiliuekorting() {return miliuekorting;}
}