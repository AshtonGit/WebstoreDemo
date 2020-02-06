package ashton.antoun.realfakedoors.inventory.service;

import ashton.antoun.realfakedoors.inventory.dao.ItemDao;
import ashton.antoun.realfakedoors.inventory.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ItemService {

    private final ItemDao itemDao;

    @Autowired
    public ItemService(@Qualifier("ItemDao") ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public Item addItem(Item item){
        return itemDao.save(item);
    }

    public List<Item> selectAllItems(){
        return itemDao.findAll();
    }

    public Optional<Item> selectById(Integer id){
        return itemDao.findById(id);
    }
}
