package com.desgin.patterns.iterator;

import java.util.ArrayList;

/**
 * Created by Yann on 2015/6/5.
 */
public class AMenu {

    public ArrayList<Menu> menus;

    public AMenu() {
        addItem(new Menu("1", 1.0d));
        addItem(new Menu("2", 2.0d));
        addItem(new Menu("3", 3.0d));
    }

    private void addItem(Menu menu) {
        if (this.menus == null)
            this.menus = new ArrayList<>();
        menus.add(menu);
    }

}
