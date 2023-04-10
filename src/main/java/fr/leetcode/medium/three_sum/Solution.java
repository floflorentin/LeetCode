package fr.leetcode.medium.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/3sum/description/">3sum</a>
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                var valueThreeSum = nums[i] + nums[j] + nums[k];
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> row = new ArrayList<>(List.of(nums[i], nums[j],nums[k]));
                    output.add(row);
                    int jTemp = nums[j];
                    while (j < k && jTemp == nums[j]) {
                        j++;
                    }
                    int kTemp = nums[k];
                    while (k > j && kTemp == nums[k]) {
                        k--;
                    }
                } else if (valueThreeSum > 0) {
                    k--;
                } else {
                    j++;
                }
            }

        }
        return output;
    }
}