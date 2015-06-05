package com.desgin.patterns.iterator;

import java.util.Iterator;

/**
 * Created by Yann on 2015/6/5.
 */
public class Waiteness {

    public static void printMenus(Iterator iterator) {

        while (iterator.hasNext()) {
            System.out.println(((Menu) iterator.next()).getName());
        }
    }

}
