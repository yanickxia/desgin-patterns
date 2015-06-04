package com.desgin.patterns.template;

/**
 * Created by Yann on 2015/6/4.
 */
public abstract class CaffeineBeverage {

    public void prepareRecipe(){
        boilWater();
        pourlnCup();
        brwe();
        addCondiments();
    }

    protected void boilWater(){
        System.out.println("boil Water");
    }

    protected void pourlnCup(){
        System.out.println("purln cup");
    }

    protected void brwe(){
        System.out.println("brwe");
    }

    protected void addCondiments(){
        System.out.println("add condiments");
    }
}
