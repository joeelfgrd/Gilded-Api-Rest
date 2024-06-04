package edu.badpals.items;
import edu.badpals.Item;
public class normalItem implements Updateable {
    private final Item item;
    

    public normalItem(String name, int sellIn, int quality) {
        this.item =  new Item(name, sellIn, quality);
    }

    public int getSellIn() {
        return this.item.sellIn;
    }
    public int getQuality() {
        return this.item.quality;
    } 
    
    
    public void update_sellIn() {
        this.item.sellIn -= 1;

    }
    
    public void update_quality() {
        if (getSellIn() > 0) {
            this.item.quality -=1;
            return;
        } 
        this.item.quality -= 2;
    }
    
    
    @Override
    public String toString(){
        return item.toString();
    }
}