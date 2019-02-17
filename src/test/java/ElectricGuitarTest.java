import instruments.ElectricGuitar;
import instruments.GuitarType;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    ElectricGuitar electricGuitar;

    @Before
    public void setUp() {
        electricGuitar = new ElectricGuitar("Plastic","Black", InstrumentType.GUITAR, GuitarType.Electric,6,50.00, 78.99);
    }

    @Test
    public void getMaterials() {
        assertEquals("Plastic", electricGuitar.getMaterials());
    }

    @Test
    public void getColour() {
        assertEquals("Black", electricGuitar.getColour());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.GUITAR, electricGuitar.getInstrumentType());
    }

    @Test
    public void getGuitarType() {
        assertEquals(GuitarType.Electric, electricGuitar.getGuitarType());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(6, electricGuitar.getNumberOfStrings());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(50.00, electricGuitar.getBuyPrice(),1.00);
    }

    @Test
    public void getSellPrice() {
        assertEquals(78.99, electricGuitar.getSellPrice(),1.00);
    }

    @Test
    public void getMarkUp() {
        assertEquals(28.99, electricGuitar.markUp(),1.00);
    }

    @Test
    public void canPlay() {
        assertEquals("Rocking out on the Guitar", electricGuitar.play());
    }
}
