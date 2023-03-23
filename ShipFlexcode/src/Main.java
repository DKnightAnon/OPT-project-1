import java.util.ArrayList;

class Bon {
    public ArrayList<Product> producten = new ArrayList<Product>();

    public void maakBon(){
        double totaalprijs = 0;

        for (int i = 0; i < producten.size(); i++) {
            System.out.printf("%-11s = €%8.2f%n", producten.get(i).getNaam() , producten.get(i).getPrijs());
            totaalprijs += producten.get(i).getPrijs();
        }
        System.out.println("-----------------------");
        System.out.printf("%-11s = €%8.2f%n", "totaalprijs", totaalprijs);
    }
}
class Product  {

    private String naam;
    private double prijs;

    public Product(String naam, double prijs){
        this.naam = naam;
        this.prijs = prijs;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getNaam(){
        return naam;
    }
    public double getPrijs(){
        return prijs;
    }
}

public class Main {
    public static void main(String args[]) {

        Bon bon1 = new Bon();
        Product product1 = new Product("motor", 24.55);
        Product product2 = new Product("mast", 38.43);
        Product product3 = new Product("vrouw", 196.12);
        Product product4 = new Product("zeil", 25.98);
        Product product5 = new Product("anker", 47.66);
        Product product6 = new Product("pannenkoek", 5.99);

        bon1.producten.add(product1);
        bon1.producten.add(product2);
        bon1.producten.add(product3);
        bon1.producten.add(product4);
        bon1.producten.add(product5);
        bon1.producten.add(product6);

        bon1.maakBon();

    }
}