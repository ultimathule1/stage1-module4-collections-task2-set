package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (Integer value : sourceList) {
            treeSet.add(value * value);
        }

        return treeSet.subSet(lowerBound, upperBound);
    }
}
