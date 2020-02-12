package ashton.antoun.realfakedoors.inventory.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer price;


    public Item(@JsonProperty("id") Integer id,
                @JsonProperty("name") String name,
                @JsonProperty("price") Integer price){
        this.name = name;
        this.price = price;
        this.id = id;
    }

    Item create(String name, Integer price){
        return new Item(null, name, price);
    }


    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
