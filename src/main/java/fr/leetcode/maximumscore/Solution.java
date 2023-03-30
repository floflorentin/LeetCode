package fr.leetcode.maximumscore;

import java.util.Arrays;
import java.util.Objects;

public class Solution {

    // Using stream
    public static String[] filterWords(String[] words, String letters) {
        return Arrays.stream(words)
                .filter(word -> word.chars().anyMatch(letter -> letters.indexOf(letter) != -1))
                .toArray(String[]::new);
    }


    public static void main(String[] args) {
        String[] words = {"the", "dog", "got", "a", "bone"};
        String letters = "ae";
        String[] result = filterWords(words, letters);
        for (String word : result) {
            System.out.println(word);
        }
    }

    public int maximumScore(int[] nums, int[] multipliers) {
        // Iterate over nums
        // For each iteration
        // Call getMax
        // Remove min or max index
        // Add to result
        validation(nums, multipliers);
        int sizeNums = multipliers.length;
        var tmpNums = nums;
        var tmpMul = multipliers;
        var result = 0;
        for(int i = 0; i < sizeNums; i++) {
            var max = getMax(tmpNums, tmpMul);
            System.out.println(result);
            System.out.println(max);
            System.out.println("" + tmpNums[max.indexNums] + " * " + tmpMul[max.indexMultipliers]);
            result += tmpNums[max.indexNums] * tmpMul[max.indexMultipliers];
            tmpNums = removeIndex(tmpNums, max.indexNums);
            tmpMul = removeIndex(tmpMul, max.indexMultipliers);
        }
        return result;
    }

    public boolean validation(int[] nums, int[] multipliers) {
        int sizeNums = nums.length;
        int sizeMul = multipliers.length;
        return sizeMul <= sizeNums;
        //if(sizeNums > 100000) return false;
    }

    public int[] removeIndex(int[] arr, int index) {
        Objects.requireNonNull(arr);
        int maxSize = arr.length - 1;
        if(index != 0 && index != maxSize) {
            throw new IllegalArgumentException("Index must be equals to 0 or max length.");
        }

        if(index == 0) {
            return Arrays.copyOfRange(arr, 1, maxSize + 1);
        }
        return Arrays.copyOfRange(arr, 0, maxSize);
    }

    public MaxIndex getMax(int[] nums, int[] multipliers) {
        int indexMul = 0;
        int indexNums = 0;
        int maxIndexNums = nums.length - 1;
        int maxIndexMul = multipliers.length - 1;

        int minIndex = 0;
        if(nums[minIndex] <= nums[maxIndexNums]) {
            indexNums = maxIndexNums;
        }
        if(multipliers[minIndex] <= multipliers[maxIndexMul]) {
            indexMul = maxIndexMul;
        }
        return new MaxIndex(indexNums, indexMul);
    }

    public record MaxIndex(int indexNums, int indexMultipliers) {
    }
}
