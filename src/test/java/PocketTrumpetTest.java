import instruments.InstrumentType;
import instruments.PocketTrumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PocketTrumpetTest {

    PocketTrumpet pocketTrumpet;

    @Before
    public void setUp() throws Exception {
        pocketTrumpet = new PocketTrumpet("Brass", "Brass", InstrumentType.BASS,3,60.00,79.99);
    }

    @Test
    public void getBuyPrice() {
        assertEquals(60.00, pocketTrumpet.getBuyPrice(),1.00);
    }

    @Test
    public void getSellPrice() {
        assertEquals(79.99, pocketTrumpet.getSellPrice(),1.00);
    }

    @Test
    public void getMarkUp() {
        assertEquals(19.99, pocketTrumpet.markUp(),1.00);
    }

    @Test
    public void canPlay() {
        assertEquals("Blow a tune on the Trumpet", pocketTrumpet.play());
    }
}
