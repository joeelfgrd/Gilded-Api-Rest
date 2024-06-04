package edu.badpals;    
import edu.badpals.items.Conjured;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ConjuredTest{

    @Test
    public void testSellIn() {
        int initialSellIn1 = 10;
        int quality1 = 20;
        Conjured item1 = new Conjured("Conjured item", initialSellIn1, quality1);
        item1.update_sellIn();
        assertEquals(9, item1.getSellIn());

        int initialSellIn2 = -1;
        int quality2 = 9;
        Conjured item2 = new Conjured("Conjured item", initialSellIn2, quality2);
        item2.update_sellIn();
        assertEquals(-2, item2.getSellIn());

        int initialSellIn3 = 0;
        int quality3 = 10;
        Conjured item3 = new Conjured("Conjured item", initialSellIn3, quality3);
        item3.update_sellIn();
        assertEquals(-1, item3.getSellIn());
    }


    @Test 
    public void testQuality1() {
        Conjured item = new Conjured("Conjured item", 10, 20);
        item.update_quality();
        assertEquals(18, item.getQuality());
    }

    @Test 
    public void testQuality2() {
        Conjured item = new Conjured("Conjured item", -1, 10);
        item.update_quality();
        assertEquals(6, item.getQuality());
    }

    @Test
    public void testQuality3() {
        Conjured item = new Conjured("Conjured item", 0, 10);
        item.update_quality();
        assertEquals(6, item.getQuality());
    }
    @Test
    public void testQuality4() {
        Conjured item = new Conjured("Conjured item", 1, 10);
        item.update_quality();
        assertEquals(8, item.getQuality()); }
}