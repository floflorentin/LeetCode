package fr.leetcode.longestsub;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        var arr1 = new int[] {4,5,2,1};
        var tmp = saveMaxSubForEach(arr1);
        tmp.forEach((k, v) -> System.out.println(" " + k + "  -> " + v));
    }

    public static HashMap<Integer, Integer> saveMaxSubForEach(int[] nums) {
        var hash = new HashMap<Integer, Integer>();
        var subForValueMap = new HashMap<Integer, Integer>();
        int index = 0;
        int sum = 0;

        for(int k = 0; k < nums.length; k++) {
            index = 0;
            sum = 0;
            for(int v = k; v < nums.length; v++) {
                sum+= nums[v];
                var tmp = index + 1;
                subForValueMap.putIfAbsent(tmp, sum);
                hash.putIfAbsent(sum, tmp);
                hash.compute(sum, (key, val) -> (val > tmp)?  tmp: val);
                index = tmp;
            }
        }
        return hash;
    }

    public boolean arrSubHasLess(int[] nums, int n) {
        return Arrays.stream(nums).sum() >= n;
    }

    // Sort Array
    //
}
