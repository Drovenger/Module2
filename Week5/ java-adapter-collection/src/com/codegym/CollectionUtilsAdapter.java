package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations {

    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> listNumber = new ArrayList<>(numbers);
        CollectionUtils collUntil = new CollectionUtils();
        return collUntil.findMax(listNumber);
    }
}