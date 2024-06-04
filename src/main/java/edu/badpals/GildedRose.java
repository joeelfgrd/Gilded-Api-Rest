package edu.badpals;
import edu.badpals.items.*;
import java.util.ArrayList;
import java.util.List;


public class GildedRose {
    
    private List<Updateable> almacen = new ArrayList<>();
    public List<Updateable> almacen(){
        return almacen;
    }

    
    public void addItem(Updateable item){
        almacen().add(item);
    }
    
    public void update_item() {
        for (Updateable updateable : almacen()){
            updateable.update_quality();
            updateable.update_sellIn();
        }
        
    }

    @Override
    public String toString(){
        StringBuilder almacen = new StringBuilder();
        for (Updateable item : almacen()){
            almacen.append(item.toString());
            almacen.append('\n');
        }
        return almacen.toString();
}
}