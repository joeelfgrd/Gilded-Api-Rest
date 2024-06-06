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

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "item_nom")
    public String name = "";

    @Column(name = "item_sellin")
    public int sellIn = 0;

    @Column(name = "item_quality")
    public int quality = 0;

    
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }


    @Override
    public String toString() {
        StringBuilder itm = new StringBuilder();
        itm.append("Item{");
        itm.append("name='").append(name).append('\'');
        itm.append(", sellIn=").append(sellIn);
        itm.append(", quality=").append(quality);
        itm.append('}');
        return itm.toString();
    }
}