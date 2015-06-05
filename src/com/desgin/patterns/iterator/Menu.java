package com.desgin.patterns.iterator;

/**
 * Created by Yann on 2015/6/5.
 */
public class Menu {

    private String name;
    private Double price;

    public Menu(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
