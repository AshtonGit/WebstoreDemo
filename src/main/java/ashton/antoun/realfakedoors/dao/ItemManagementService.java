package ashton.antoun.realfakedoors.dao;

import ashton.antoun.realfakedoors.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("ItemDao")
public class ItemManagementService implements ItemDao{

    private static List<Item> DB = new ArrayList<>();

    @Override
    public int insertItem(UUID id, Item item){
        Item idItem = new Item(id, item.getName(), item.getPrice_nzd());
        DB.add(idItem);
        return 1;
    }

    @Override
    public List<Item> selectAllItems() {
        return this.DB;
    }



}
