package edu.badpals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ItemTest {
    @Test
    public void crearItem() {

        Item item = new Item("+5 Dexterity Vest", 10, 20);

        assertEquals("+5 Dexterity Vest", item.name);
        assertEquals(10, item.sellIn, 0);
        assertEquals(20, item.quality, 0);
        System.out.println(item);
    }
}