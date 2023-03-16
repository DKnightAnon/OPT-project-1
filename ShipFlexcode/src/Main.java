import java.util.ArrayList;
class Product {
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
        ArrayList<Product> producten = new ArrayList<Product>();
        Product product1 = new Product("product1", 24.55);
        Product product2 = new Product("product2", 38.43);
        Product product3 = new Product("product3", 96.12);
        Product product4 = new Product("product4", 25.98);
        Product product5 = new Product("product5", 47.66);
        producten.add(product1);
        producten.add(product2);
        producten.add(product3);
        producten.add(product4);
        producten.add(product5);

        double totaalprijs = 0;

        for (int i = 0; i < producten.size(); i++) {
            System.out.printf("%-11s = €%8.2f%n", producten.get(i).getNaam() , producten.get(i).getPrijs());
            totaalprijs += producten.get(i).getPrijs();
        }
        System.out.println("-----------------------");
        System.out.printf("%-11s = €%8.2f%n", "totaalprijs", totaalprijs);
    }
}
