package fr.leetcode.medium.smallest_infinite;

import java.util.TreeSet;

/**
 * <a href="https://leetcode.com/problems/smallest-number-in-infinite-set/description/">smallest in infinite set</a>
 */
public class SmallestInfiniteSet {
    private final TreeSet<Integer> addedBackValues = new TreeSet<>();
    private long count;

    public SmallestInfiniteSet() {
        this.count = 1;
    }

    public int popSmallest() {
        if(addedBackValues.isEmpty()) {
            return (int) count++;
        }
        return addedBackValues.pollFirst();
    }

    public void addBack(int num) {
        if(!addedBackValues.contains(num) && num < count) {
            addedBackValues.add(num);
        }
    }
}
