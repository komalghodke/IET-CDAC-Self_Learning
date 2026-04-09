package com.selflearning.Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Q10.
Create a list of wrapper classes and perform insert/delete/search/iterate/sort.
*/
public class Q10WrapperListOperations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(20);

        System.out.println("List elements:");
        for(Integer i : list) {
            System.out.println(i);
        }

        System.out.println("Contains 5? " + list.contains(5));

        list.remove(Integer.valueOf(10));

        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}
