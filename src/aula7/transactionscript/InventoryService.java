package transactionscript;

import java.util.Map;

public interface InventoryService {
    void decreaseStock(Map<Item, Integer> items);
}
