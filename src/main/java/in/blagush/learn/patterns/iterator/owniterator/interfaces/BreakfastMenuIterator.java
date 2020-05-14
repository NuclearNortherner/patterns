package in.blagush.learn.patterns.iterator.owniterator.interfaces;

import in.blagush.learn.patterns.iterator.owniterator.MenuItem;

import java.util.ArrayList;

public class BreakfastMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public BreakfastMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
