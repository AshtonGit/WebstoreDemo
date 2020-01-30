package ashton.antoun.realfakedoors.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Item {


    private UUID UUID;
    private String name;
    private String price_nzd;


    public Item(@JsonProperty("id") UUID id,
                @JsonProperty("name") String name,
                @JsonProperty("price_nzd") String price_nzd){
        this.name = name;
        this.price_nzd = price_nzd;
        this.UUID = id;
    }


    public UUID getId(){
        return this.UUID;
    }

    public String getName(){
        return this.name;
    }

    public String getPrice_nzd() {
        return price_nzd;
    }
}
