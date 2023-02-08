package com.epam.mjc.collections.set;

import java.util.*;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new LinkedHashSet<>();

        for (Integer temp : sourceList) {
            if (temp % 2 == 0) {
                hashSet.add(temp);
                temp /= 2;
                if (temp % 2 == 1) {
                    hashSet.add(temp);
                }
                while (temp % 2 == 0) {
                    hashSet.add(temp);
                    temp /= 2;
                }
                hashSet.add(temp);
            } else {
                hashSet.add(temp);
                hashSet.add(2 * temp);
            }
        }

        return hashSet;
    }
}
