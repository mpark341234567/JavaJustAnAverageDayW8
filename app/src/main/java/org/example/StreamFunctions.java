package org.example;

import java.util.Arrays;

public final class StreamFunctions {
    public static int maximumUsingStream(int[] nums){
        return Arrays.stream(nums).max().orElseThrow( () -> new IllegalArgumentException("Array is empty.") );
    }
    public static int minimumUsingStream(int[] nums){
        return Arrays.stream(nums).min().orElseThrow( () -> new IllegalArgumentException("Array is empty.") );
    }
    public static int sumUsingStream(int[] nums){
        if (nums.length == 0) { throw new IllegalArgumentException("Array is empty."); }
        return Arrays.stream(nums).sum();
    } 
    public static int averageUsingStream(int[] nums){
        if (nums.length == 0) { throw new IllegalArgumentException("Array is empty."); }
        return (int) Arrays.stream(nums).average().orElseThrow( () -> new IllegalArgumentException("Array is empty.") );
    }
}
