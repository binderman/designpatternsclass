package transactionscript;

import java.util.Map;

public class SimpleInventoryService implements InventoryService {
    @Override
    public void decreaseStock(Map<Item, Integer> items) {
        items.forEach((item, quantity) -> 
            System.out.println("Decreasing stock of " + item.getName() + " by " + quantity));
    }
}
