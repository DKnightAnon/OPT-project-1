import org.junit.jupiter.api.Assertions;
import java.util.Scanner;
public class TestClass {
    OptieLijst optielijstTest;
    Offerte offerteTest;
    Scanner scanner;
    public void testVoegAlleOptiesToeAanLijst() {
        //@Test
        //Arrange
        optielijstTest = new OptieLijst();
        //Act
        optielijstTest.voegAlleOptiesToeAanLijst(optielijstTest);
        //Assert
        AssertEquals(8, optielijstTest.optielijst.size());
    }
    public void testMaakOptieAan(){
        //@Test
        //Arrange
        optielijstTest = new OptieLijst();
        scanner = new Scanner(System.in);
        String scan = scanner.nextLine()
        //Act
        optielijstTest.maakOptieAan(scanner, scan);
        //Assert
        AssertEquals(1, optielijstTest.optielijst.size());
    }
    public void testVoegOptieToe(){
        //@Test
        //Arrange
        offerteTest = new Offerte();
        scanner = new Scanner(System.in);
        optielijstTest = new OptieLijst();
        //Act
        offerteTest.voegOptieToe(scanner, "Roer", optielijstTest);
        offerteTest.voegOptieToe(scanner, "Anker", optielijstTest);
        //Assert
        AssertEquals(2, offerteTest.geselecteerdeOpties.size());
    }
}