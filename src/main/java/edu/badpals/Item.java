package edu.badpals;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "items")
@NoArgsConstructor
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public @Getter Long id;
    
    @Column(name = "item_nom")
    public String name;
    @Column(name = "item_sellin")
    public int sellIn;
    @Column(name = "item_quality")
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

@Override
public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
    
}