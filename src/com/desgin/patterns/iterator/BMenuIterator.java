package com.desgin.patterns.iterator;

import java.util.Iterator;

/**
 * Created by Yann on 2015/6/5.
 */
public class BMenuIterator implements Iterator {

    private Menu[] menus;
    private Integer index = 0;

    public BMenuIterator(Menu[] menus) {
        this.menus = menus;
    }

    @Override
    public boolean hasNext() {
        return menus[index] != null;
    }

    @Override
    public Object next() {
        return menus[index++];
    }
}
