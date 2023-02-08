package com.epam.mjc.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> str = new LinkedHashSet<>();

        for (String temp_str : firstSet) {
            if (secondSet.contains(temp_str) && !(thirdSet.contains(temp_str))) {
                str.add(temp_str);
            }
        }

        for (String tempStr : thirdSet) {
            if (!(firstSet.contains(tempStr)) && !(secondSet.contains(tempStr))) {
                str.add(tempStr);
            }
        }

        return str;
    }
}
