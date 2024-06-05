package edu.badpals;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name="t_items")
@Data
@NoArgsConstructor
public class Item{


    @Column(name = "item_nom")
    public String name = "";

    @Column(name = "item_sellin")
    public int sellIn = 0;

    @Column(name = "item_quality")
    public int quality = 0;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }


    @Override
   public String toString() {
        return this.name + ", " + this.quality + ", " + this.sellIn;
    }
}