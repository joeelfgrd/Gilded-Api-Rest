package edu.badpals;    
import edu.badpals.items.AgedBrie;  

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AgedBrieTest {

    @Test
    void testUpdateSellIn() {
        AgedBrie brie = new AgedBrie("Test Brie", 10, 20);
        brie.update_sellIn();
        assertEquals(9, brie.getSellIn());
    }

    @Test
    void testUpdateQuality() {
        AgedBrie brie = new AgedBrie("Test Brie", 10, 20);
        brie.update_quality();
        assertEquals(21, brie.getQuality());

        brie = new AgedBrie("Test Brie", 0, 20);
        brie.update_quality();
        assertEquals(22, brie.getQuality());

        brie = new AgedBrie("Test Brie", 10, 50);
        brie.update_quality();
        assertEquals(50, brie.getQuality());
    }
    
}