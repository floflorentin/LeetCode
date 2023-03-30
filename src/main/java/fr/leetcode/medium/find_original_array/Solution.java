package fr.leetcode.medium.find_original_array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/find-original-array-from-doubled-array/description/">find-original-array-from-doubled-array</a>
 */
public class Solution {

    public int[] findOriginalArray(int[] changed) {
        int[] temp = new int[changed.length/2];
        Queue<Integer> x = new LinkedList<>();
        Arrays.sort(changed);
        int i = 0;
        for(int num : changed){
            if(!x.isEmpty() && x.peek()==num)
                temp[i++] = x.poll()/2;
            else {
                x.add(num*2);
            }
        }
        return (!x.isEmpty())? new int[]{}:temp;
    }
}
