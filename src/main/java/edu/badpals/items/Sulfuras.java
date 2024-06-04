package edu.badpals.items;
import edu.badpals.Item;
public class Sulfuras implements Updateable {
    private final Item item;
    

    public Sulfuras(String name, int sellIn, int quality) {
        this.item =  new Item(name, sellIn, 80);
    }

    public int getSellIn() {
        return this.item.sellIn;
    }
    public int getQuality() {
        return this.item.quality;
    } 
    
    
    public void update_sellIn() {
        this.item.sellIn = this.item.sellIn;

    }
    
    public void update_quality() {}
    
    
    @Override
    public String toString(){
        return item.toString();
    }

}