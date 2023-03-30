package fr.leetcode.easy.fizz;

import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public List<String> fizzBuzz(int n) {
        return IntStream.range(1, n + 1)
                .mapToObj(i -> {
                    if(i % 3 == 0) {
                        if(i % 5 == 0) {
                            return "FizzBuzz";
                        }
                        return "Fizz";
                    } else if(i % 5 == 0) {
                        return "Buzz";
                    }
                    return i + "";
                })
                .toList();
    }
}
