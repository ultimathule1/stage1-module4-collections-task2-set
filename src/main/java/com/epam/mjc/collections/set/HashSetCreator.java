package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        Iterator<Integer> iterator = sourceList.iterator();

        for (int i = 0; i < sourceList.size(); i++) {
            Integer temp = sourceList.get(i);
            if (temp % 2 == 0) {
                hashSet.add(temp);
                temp /= 2;
                while (temp % 2 == 0) {
                    hashSet.add(temp);
                    temp /= 2;
                }
            } else {
                hashSet.add(temp);
                hashSet.add(2 * temp);
            }
        }

        return hashSet;
    }
}
