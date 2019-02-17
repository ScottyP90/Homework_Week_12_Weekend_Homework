import instruments.GrandPiano;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GrandPianoTest {

    GrandPiano grandPiano;

    @Before
    public void setUp() {
        grandPiano = new GrandPiano("Gold","Gold", InstrumentType.PIANO, 88, 200.00, 349.99);
    }

    @Test
    public void getMaterials() {
        assertEquals("Gold", grandPiano.getColour());
    }

    @Test
    public void getColour() {
        assertEquals("Gold", grandPiano.getMaterials());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.PIANO, grandPiano.getInstrumentType());
    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(88, grandPiano.getNumberOfKeys());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(200.00, grandPiano.getBuyPrice(),1.00);
    }

    @Test
    public void getSellPrice() {
        assertEquals(349.99, grandPiano.getSellPrice(),1.00);
    }

    @Test
    public void getMarkup() {
        assertEquals(149.99, grandPiano.markUp(),1.00);
    }

    @Test
    public void canPlay() {
        assertEquals("Played a melody on the piano", grandPiano.play());
    }
}
