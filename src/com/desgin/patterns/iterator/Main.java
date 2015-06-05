package com.desgin.patterns.iterator;

/**
 * Created by Yann on 2015/6/5.
 */
public class Main {
    public static void main(String[] args) {
        AMenu aMenu = new AMenu();
        BMenu bMenu = new BMenu();


        Waiteness.printMenus(aMenu.menus.iterator());
        Waiteness.printMenus(bMenu.bMenuIterator());
    }
}
