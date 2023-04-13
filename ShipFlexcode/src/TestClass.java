import org.junit.jupiter.api.Test;
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
        //Act
        optielijstTest.maakOptieAan(true,"Anker", "Dit is een test beschrijving om te kijken hoe het reageert op meerdere characters", 50, false);
        //Assert
        assertEquals(1, optielijstTest.optielijst.size());
    }
    @Test
    public void testVoegOptieToe(){
        //Arrange
        Offerte offerteTest = new Offerte();
        OptieLijst optielijstTest = new OptieLijst();
        //Act
        offerteTest.voegOptieToe(optielijstTest.Anker);
        offerteTest.voegOptieToe(optielijstTest.Brandstoftank);
        //Assert
        assertEquals(2, offerteTest.geselecteerdeOpties.size());
    }
}