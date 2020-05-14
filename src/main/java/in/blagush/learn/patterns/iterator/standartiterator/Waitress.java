package in.blagush.learn.patterns.iterator.standartiterator;

import in.blagush.learn.patterns.iterator.standartiterator.interfaces.Menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    private ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        while(menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.print(menuItem.getDescription());
            if (menuItem.isVegetarian()) {
                System.out.print(", vegetarian");
            }
            System.out.println();
        }
    }

}
