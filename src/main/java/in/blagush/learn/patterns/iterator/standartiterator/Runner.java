package in.blagush.learn.patterns.iterator.standartiterator;

import in.blagush.learn.patterns.iterator.standartiterator.interfaces.Menu;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();

    }

}
