package edu.badpals.Repo;

import edu.badpals.Item;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class Repo {

    @Inject
    ItemRepo itemRepo;

    public Repo(){}

    public Item cargaItem(Long id){
        Optional<Item> item = itemRepo.findByIdOptional(id);
        return item.orElseGet(Item::new);
    }

    public Item cargaItem(String nombre){
        return itemRepo.cargaItem(nombre);
    }

    public List<Item> cargaItems(String nombre){
        return itemRepo.listAll().stream()
        .filter(item -> item.name.equals(nombre)).toList();
    }

    @Transactional
    public Item crearItem(Item item){
        itemRepo.persist(item);
        return this.cargaItem(item.getId());
    }

    @Transactional
    public void deleteItem(Item item){
        itemRepo.delete(item);
    }
}