package ashton.antoun.realfakedoors.inventory.dao;


import ashton.antoun.realfakedoors.inventory.model.Item;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("ItemDao")
public interface ItemDao extends CrudRepository<Item, Integer> {

    public Optional<Item> findById(Integer id);

    public List<Item> findAll();

    public Item save(Item item);


}
