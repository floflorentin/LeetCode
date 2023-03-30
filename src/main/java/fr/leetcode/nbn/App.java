package fr.leetcode.nbn;


public class App {

    public static void main(String[] args) {
        System.out.println(computeMultiplesSum(0));
    }

    // If two temperatures are equally close to zero, then the positive integer has to be considered closest to zero
    static int computeClosestToZero(int[] ts) {
        if(ts.length == 0) {
            return 0;
        }
        int closest = Integer.MAX_VALUE;
        for (int t : ts) {
            if (Math.abs(t) < Math.abs(closest) || (Math.abs(t) == Math.abs(closest) && t > 0)) {
                closest = t;
            }
        }
        return closest;
    }


    // computeMutliplesSum should return the sum of all the positive integers which are multiples of 3 or 5 or 7 below the number passed in parameter
    // using streams
    static int computeMultiplesSum(int n) {
        return java.util.stream.IntStream.range(0, n)
                .filter(i -> i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                .sum();
    }

    // 0 <= n1 <= n2
    // value between n1 and n2
    // Using streams
    public int cacl(int[] array, int n1, int n2) {
        return java.util.stream.IntStream.of(array)
                .filter(i -> i >= n1 && i <= n2)
                .sum();
    }
}
