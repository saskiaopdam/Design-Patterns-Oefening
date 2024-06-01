import product.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        if (item != null) {
            itemList.add(item);
        }

    }

    public void show(String mealType) {
        System.out.println(mealType);
        float totalPrice = 0;
        for (Item item : itemList) {
            System.out.println("Item: " + item.name() + ", Packing: " + item.packing() + ", Price: " + item.price());
            totalPrice += item.price();
        }
        System.out.println("Total price: " + totalPrice);
        System.out.println();
    }

}
