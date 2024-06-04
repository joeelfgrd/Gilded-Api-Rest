package edu.badpals.items;
import edu.badpals.Item;

public class AgedBrie implements Updateable {
    private final Item item;
    

    public AgedBrie(String name, int sellIn, int quality) {
        this.item =  new Item(name, sellIn, quality);
    }
   
    public Item getItem() {
        return this.item;
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
        if (getQuality() < 50 ){
            if (getSellIn() > 0 ){
                this.item.quality +=1;
                return;
            }
            this.item.quality += 2;
    }
        else{ 
            this.item.quality = 50;}
    }
    

    @Override
    public String toString(){
        return item.toString();
    }

}  