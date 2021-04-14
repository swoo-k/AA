package iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size())
            return false;
        else
            return false;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(position++);

        return menuItem;
    }
}
