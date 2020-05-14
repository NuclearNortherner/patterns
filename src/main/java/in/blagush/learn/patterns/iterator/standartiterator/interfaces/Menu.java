package in.blagush.learn.patterns.iterator.standartiterator.interfaces;

import in.blagush.learn.patterns.iterator.standartiterator.MenuItem;

import java.util.Iterator;

public interface Menu {

    public Iterator<MenuItem> createIterator();

}
