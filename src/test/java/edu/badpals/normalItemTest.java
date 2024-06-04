package edu.badpals;
import org.junit.jupiter.api.Test;
import edu.badpals.items.normalItem;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class normalItemTest {

    @Test
    public void testSellIn() {
        int initialSellIn1 = 10;
        int quality1 = 20;
        normalItem item1 = new normalItem("Dexterity Vest", initialSellIn1, quality1);
        item1.update_sellIn();
        assertEquals(9, item1.getSellIn());

       
        int initialSellIn2 = -1;
        int quality2 = 9;
        normalItem item2 = new normalItem("Dexterity Vest", initialSellIn2, quality2);
        item2.update_sellIn();
        assertEquals(-2, item2.getSellIn());

        
        int initialSellIn3 = 0;
        int quality3 = 10;
        normalItem item3 = new normalItem("Dexterity Vest", initialSellIn3, quality3);
        item3.update_sellIn();
        assertEquals(-1, item3.getSellIn());
    }
    
    @Test 
    public void testQuality1() {
        normalItem item = new normalItem("Dexterity Vest", 10, 20);
        item.update_quality();
        assertEquals(19, item.getQuality());
    }

    @Test 
    public void testQuality2() {
        normalItem item = new normalItem("Dexterity Vest", -1, 10);
        item.update_quality();
        assertEquals(8, item.getQuality());
    }

    @Test
    public void testQuality3() {
        normalItem item = new normalItem("Dexterity Vest", 0, 10);
        item.update_quality();
        assertEquals(8, item.getQuality());
    }

    @Test
    public void testQuality4() {
        normalItem item = new normalItem("Dexterity Vest", 1, 10);
        item.update_quality();
        assertEquals(9, item.getQuality());
    }
    
}