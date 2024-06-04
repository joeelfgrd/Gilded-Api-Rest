package edu.badpals;    
import edu.badpals.items.Sulfuras;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SulfurasTest {

    @Test
    void testUpdateSellIn() {
        Sulfuras pass = new Sulfuras("Sulfuras", 10, 20);
        pass.update_sellIn();
        assertEquals(10, pass.getSellIn());
    }

    @Test
    void testUpdateQuality() {
        Sulfuras pass = new Sulfuras("Sulfuras", 15, 80);
        pass.update_quality();
        assertEquals(80, pass.getQuality());

        
    }
}