package edu.badpals;
import edu.badpals.items.*;
import java.util.*;
public class App {
    public static void main(String[] args){
        System.out.println("Bienvenido a Olivanders");
        GildedRose almacen = new GildedRose();
        int day = 4;
        List<Updateable> items =List.of( new normalItem("+5 Dexterity Vest",10,20),
                                         new AgedBrie("Aged Brie",2,0),
                                         new normalItem("Elixir of the Mongoose",5,7),
                                         new Sulfuras("Hand of Ragnaros",0,80),
                                         new Sulfuras("Hand of Ragnaros",-1,80),
                                         new BackstagePass("Backstage passes to a TAFKAL80ETC concert",15,20),
                                         new BackstagePass("Backstage passes to a TAFKAL80ETC concert",10,49),
                                         new BackstagePass("Backstage passes to a TAFKAL80ETC concert",5,49));
                                        
        
        for (Updateable item : items){
            almacen.addItem(item);
        }

        System.out.println("\t #### Day 1 #### ");
        System.out.println(almacen.toString());
        almacen.update_item();

        System.out.println("\t #### Day 2 #### ");
        System.out.println(almacen.toString());
        almacen.update_item();


        almacen.addItem(new Conjured("Conjured Mana Cake", 3, 6));
        System.out.println("\t #### New item conjured added #### "); 
        System.out.println(almacen.toString());
        
        
        System.out.println("\t #### Day 3 #### ");
        System.out.println(almacen.toString());
        
        almacen.update_item();

        while (day<31) {
        System.out.println("\t #### Day" + day + "#### ");
        System.out.println(almacen.toString());
        day = day + 1;
        almacen.update_item();
        }
    }
}