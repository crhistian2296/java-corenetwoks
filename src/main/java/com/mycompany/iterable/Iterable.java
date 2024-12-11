package com.mycompany.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<Character>();
        list.add('A');
        list.add('C');
        list.add('B');
        list.add('A');
        list.add('C');
        list.add('C');

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals('B')) {
//                list.remove(i);
//            }
//        }
//        System.out.println(list);

        Iterator<Character> iterator = list.iterator();

        while (iterator.hasNext()) {
            Character character = iterator.next();
            if (character.equals('A')) iterator.remove();
        }
        System.out.println(list);
        list.forEach(System.out::println);
        list.forEach((element) -> System.out.println(element));
    }
}
