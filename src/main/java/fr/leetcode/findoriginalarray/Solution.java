package fr.leetcode.findoriginalarray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 4, 2, 6, 8};
        int[] zeros = {0, 0, 0, 0};
        int[] nums2 = {3, 6, 0, 1};
        int[] impair = {0, 0, 3};
        int[] result = solution.findOriginalArray(zeros);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    public int[] findOriginalArray(int[] changed) {
        int[] temp = new int[changed.length/2];
        Queue<Integer> x = new LinkedList<>();
        Arrays.sort(changed);
        int i = 0;
        for(int num : changed){
            if(!x.isEmpty() && x.peek()==num)
                temp[i++] = x.poll()/2;
            else x.add(num*2);
        }
        return x.size()>0 ? new int[]{}:temp;
    }
}
