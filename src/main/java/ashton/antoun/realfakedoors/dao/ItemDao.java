package ashton.antoun.realfakedoors.dao;

import ashton.antoun.realfakedoors.model.Item;

import java.util.List;
import java.util.UUID;

public interface ItemDao {

    int insertItem(UUID id, Item item);

    default int insertItem(Item item){
        UUID id = UUID.randomUUID();
        return insertItem(id, item);
    }


    List<Item> selectAllItems();
}
