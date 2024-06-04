package edu.badpals;    
import edu.badpals.items.BackstagePass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BackstagePassTest {

    @Test
    void testUpdateSellIn() {
        BackstagePass pass = new BackstagePass("Test Pass", 10, 20);
        pass.update_sellIn();
        assertEquals(9, pass.getSellIn());
    }

    @Test
    void testUpdateQuality() {
        BackstagePass pass = new BackstagePass("Test Pass", 15, 20);
        pass.update_quality();
        assertEquals(21, pass.getQuality());

        pass = new BackstagePass("Test Pass", 1, 49);
        pass.update_quality();
        assertEquals(50, pass.getQuality());

        pass = new BackstagePass("Test Pass", 3, 20);
        pass.update_quality();
        assertEquals(23, pass.getQuality());

        pass = new BackstagePass("Test Pass", 1, 20);
        pass.update_quality();
        assertEquals(23, pass.getQuality());

        pass = new BackstagePass("Test Pass", -1, 20);
        pass.update_quality();
        assertEquals(0, pass.getQuality());
    }
}