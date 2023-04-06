import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestClass {
    @Test
    public void testVoegAlleOptiesToeAanLijst() {
        //Arrange
        OptieLijst optielijstTest = new OptieLijst();
        //Act
        optielijstTest.voegAlleOptiesToeAanLijst(optielijstTest);
        //Assert
        assertEquals(8, optielijstTest.optielijst.size());
    }
    @Test
    public void testMaakOptieAan(){
        //Arrange
        OptieLijst optielijstTest = new OptieLijst();
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        //Act
        optielijstTest.maakOptieAan(scanner, scan);
        //Assert
        assertEquals(1, optielijstTest.optielijst.size());
    }
    @Test
    public void testVoegOptieToe(){
        //Arrange
        Offerte offerteTest = new Offerte();
        Scanner scanner = new Scanner(System.in);
        OptieLijst optielijstTest = new OptieLijst();
        //Act
        offerteTest.voegOptieToe(scanner, "Roer", optielijstTest);
        offerteTest.voegOptieToe(scanner, "Anker", optielijstTest);
        //Assert
        assertEquals(2, offerteTest.geselecteerdeOpties.size());
    }
}