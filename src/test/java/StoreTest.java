import Shop.Item;
import Shop.Store;
import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StoreTest {

    ElectricGuitar electricGuitar;
    GrandPiano grandPiano;
    PocketTrumpet pocketTrumpet;
    Item item;
    Store store;

    @Before
    public void setUp() {
        electricGuitar = new ElectricGuitar("Plastic","Black", InstrumentType.GUITAR, GuitarType.Electric,6,50.00, 78.99);
        grandPiano = new GrandPiano("Gold","Gold", InstrumentType.PIANO, 88, 200.00, 349.99);
        pocketTrumpet = new PocketTrumpet("Brass", "Brass", InstrumentType.BASS,3,60.00,79.99);
        item = new Item("Sheet Music",2.00, 4.99);
        store = new Store("Sound Of Metal");
    }

    @Test
    public void canAddItemToInventory() {
        store.addToInventory(electricGuitar);
        assertEquals(1, store.getInventory());
    }

    @Test
    public void canRemoveItemFromInventory() {
        store.addToInventory(electricGuitar);
        store.addToInventory(item);
        store.removeFromInventory(electricGuitar);
        assertEquals(1, store.getInventory());
    }

    @Test
    public void canGetTotalMarkupForStore() {
        store.addToInventory(electricGuitar);
        store.addToInventory(item);
        store.addToInventory(grandPiano);
        store.addToInventory(pocketTrumpet);
        assertEquals(201.96, store.allStockMarkup(),1.00);
    }
}
