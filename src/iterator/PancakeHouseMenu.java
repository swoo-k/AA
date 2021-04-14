package iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems; 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("Regular Pancake Breakfast", "panckes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry pancakes", "Pancakes made with fresh blueberries", true, 3.49);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }


    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
