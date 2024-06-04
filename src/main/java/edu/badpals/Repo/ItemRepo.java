package edu.badpals.Repo;
import edu.badpals.Item;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import java.util.List;

public class ItemRepo implements PanacheRepositoryBase <Item, Long>{
    public Item cargaItem(String nombre){
        List<Item> items = this.listAll();
        return items.stream().filter(item -> item.name.equals(nombre)).findFirst().orElse(new Item());
    }

}
