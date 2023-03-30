package fr.leetcode.maxsatisfaction;

import java.util.Arrays;

public class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        var n = satisfaction.length;
        var sum = 0;
        var total = 0;
        for(int i = n - 1; i >= 0 && satisfaction[i] > -sum; --i) {
            sum += satisfaction[i];
            total += sum;
        }
        return total;
    }
}
