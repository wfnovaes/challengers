package algorithm.adjacentproduct;


// Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
//
// Example
//
// For inputArray = [3, 6, -2, -5, 7, 3], the output should be
// solution(inputArray) = 21.
//
// 7 and 3 produce the largest product.

import java.util.stream.IntStream;

public abstract class AdjacentElementsProduct {

    public static int check(int[] inputArray) {
        return IntStream.range(1, inputArray.length)
                .map(index -> inputArray[index]*inputArray[index-1])
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Illegal array as received"));
    }
}
