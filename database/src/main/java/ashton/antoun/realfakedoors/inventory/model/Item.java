package ashton.antoun.realfakedoors.inventory.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.File;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer price;
    private String image;


    public Item(@JsonProperty("id") Integer id,
                @JsonProperty("name") String name,
                @JsonProperty("price") Integer price,
                @JsonProperty("image") String image){
        this.name = name;
        this.price = price;
        this.id = id;
        this.image = image;
    }

    Item create(String name, Integer price){
        return new Item(null, name, price, null);
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

    public String getImage(){return this.image;}

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", image='"+image+'\''+
                '}';
    }
}
