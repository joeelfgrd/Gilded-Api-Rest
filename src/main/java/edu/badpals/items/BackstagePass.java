package edu.badpals.items;
import edu.badpals.Item;
public class BackstagePass implements Updateable {
    private final Item item;
    

    public BackstagePass(String name, int sellIn, int quality) {
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
        if (getSellIn() > 10) {
            this.item.quality += 1;
            }
        else if(getSellIn() > 5) {
            this.item.quality += 2;
            }
        else if(getSellIn() >= 0) {
            this.item.quality += 3;
            }
        else if(getSellIn() < 0) {
            this.item.quality = 0;
        }
        if (this.item.quality > 50) {
            this.item.quality = 50;
        }
        
    }
        
    
    @Override
    public String toString(){
        return item.toString();
    }
}