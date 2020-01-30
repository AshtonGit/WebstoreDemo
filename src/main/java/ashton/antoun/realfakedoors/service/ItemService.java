package ashton.antoun.realfakedoors.service;

import ashton.antoun.realfakedoors.dao.ItemDao;
import ashton.antoun.realfakedoors.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemService {

    private final ItemDao itemDao;

    @Autowired
    public ItemService(@Qualifier("ItemDao") ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public int addItem(Item item){
        return itemDao.insertItem(item);
    }

    public List<Item> selectAllItems(){
        return itemDao.selectAllItems();
    }
}
