package com.codegym;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Client client = new Client(new CollectionUtilsAdapter());
        Set<Integer> numbersList = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            int randomNumber = (int) Math.round(Math.random() * 1000);
            numbersList.add(randomNumber);
        }
        client.printMaxValue(numbersList);
    }
}