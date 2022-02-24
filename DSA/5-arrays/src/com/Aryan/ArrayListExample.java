package com.Aryan;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        ArrayList :- it is array which does not has fixed size. we can put n number of elements as we want
//        SYNTAX:-
        ArrayList<Integer> list = new ArrayList<>(10); // 10 is initial capacity

//        add(value) method in list object
        list.add(454560);
        list.add(1240);
        list.add(20);
        list.add(13450);

//        get(index_number) method to get element at that index
        int x = list.get(3);
        System.out.println(x);

//        contains(value) method check element present or not in list
        System.out.println(list.contains(20));  // return true if contains or false

//        set(index_number, new_value) method updates element or change element
        list.set(1, 10);

//        remove(index_number) method to remove element
        list.remove(0);

//        printing ArrayList
        System.out.println(list);

//        input using for loop
        for(int i=0; i < 5; i++){
            list.add(input.nextInt());
        }

//        printing using for loop
        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
