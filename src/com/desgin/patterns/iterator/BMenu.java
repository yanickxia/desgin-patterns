package com.desgin.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Yann on 2015/6/5.
 */
public class BMenu {

    private Menu[] menus;
    private int index = 0;
    private int max = 6;

    public BMenu() {
        addItem(new Menu("1", 1.0d));
        addItem(new Menu("2", 2.0d));
        addItem(new Menu("3", 3.0d));
    }

    private void addItem(Menu menu) {
        if (this.menus == null)
            this.menus = new Menu[max];
        menus[index++] = menu;
    }

    public BMenuIterator bMenuIterator() {
        return new BMenuIterator(menus);
    }
}
