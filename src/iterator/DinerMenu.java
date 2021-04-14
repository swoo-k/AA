package iterator;

public class DinerMenu {
    static final int MAX_TIEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    public DinerMenu() {
        menuItems = new MenuItem[MAX_TIEMS];
        addItem("Vegetarian BLT", "Bacon with Lettuce & tomato on whole wheat", true, 2.99);
        addItem("Soup of the Day", "Soup of the Day with potato salad", false, 3.29);
        
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_TIEMS)
            System.err.println("Sorry menu is full! Cant' add any more items");
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
