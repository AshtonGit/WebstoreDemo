package ashton.antoun.realfakedoors.inventory.api;

import ashton.antoun.realfakedoors.inventory.model.Item;
import ashton.antoun.realfakedoors.inventory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/inventory")
@RestController
public class ItemController {

    private final ItemService itemservice;

    @Autowired
    public ItemController(ItemService itemservice) {
        this.itemservice = itemservice;
    }

    @PostMapping
    public Item addItem(@RequestBody Item item){
       return itemservice.addItem(item);
    }

    @GetMapping
    public List<Item> getAllItems(Item item){
        return this.itemservice.selectAllItems();
    }



}
