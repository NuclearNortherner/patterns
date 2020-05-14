package in.blagush.learn.patterns.iterator.standartiterator.interfaces;

import in.blagush.learn.patterns.iterator.standartiterator.MenuItem;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more items in menu");
        }
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("Can't delete from blank menu list");
        }
        if (items[position-1] != null) {
            for (int i = position-1; i < (items.length-1); i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
