package in.blagush.learn.patterns.templatemethod;

import in.blagush.learn.patterns.templatemethod.entities.Beverage;
import in.blagush.learn.patterns.templatemethod.entities.Cacao;
import in.blagush.learn.patterns.templatemethod.entities.Coffee;
import in.blagush.learn.patterns.templatemethod.entities.Tea;

public class Runner {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareBeverage();

        System.out.println();

        Beverage coffee = new Coffee();
        coffee.prepareBeverage();

        System.out.println();

        Beverage cacao = new Cacao();
        cacao.prepareBeverage();
    }
}
