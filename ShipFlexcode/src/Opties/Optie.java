package Opties;

import java.util.ArrayList;

public class Optie  {

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

    //Deze constructor wordt gebruikt in Optielijst om Opties aan te maken met waardes dat uit een csv file worden gelezen.
    public Optie(String isEssentieel, String naam, String beschrijving, String prijs, String milieukorting){
        if (isEssentieel.equals("true") || isEssentieel.equals("True")){
            this.isEssentieel = true;
        } else {
            this.isEssentieel = false;
        }
        this.naam = naam;
        this.beschrijving = beschrijving;
        Double Prijs =  Double.parseDouble(prijs);
        this.prijs = Prijs;
        if (milieukorting.equals("True") || milieukorting.equals("true")) {
            this.miliuekorting = true;
        } else {
            this.miliuekorting = false;
        }

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