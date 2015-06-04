package com.desgin.patterns.template;

/**
 * Created by Yann on 2015/6/4.
 */
public class Main {
    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new Tea();
        CaffeineBeverage caffeineBeverage1 = new Coffee();

        caffeineBeverage.prepareRecipe();
        caffeineBeverage1.prepareRecipe();
    }
}
