package edu.badpals.Repo;
import edu.badpals.Item;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ItemRepo implements PanacheRepositoryBase <Item, Long>{
    public Item cargaItem(String nombre){
        return find("name", nombre).firstResult();
    }

}
