package org.example;

public final class LoopFunctions {
    public static int maximumUsingForLoop(int[] nums) {
        if (nums.length == 0) { throw new IllegalArgumentException("Array is empty."); }
        int maximum = nums[0];
        for (int num : nums) {
            if (num > maximum) { maximum = num; }
        }
        return maximum;
    }

    public static int minimumUsingForLoop(int[] nums){
        if (nums.length == 0) { throw new IllegalArgumentException("Array is empty."); }
        int minimum = nums[0];
        for (int num : nums) {
            if (num < minimum) { minimum = num; }
        }
        return minimum;
    }

    public static int sumUsingForLoop(int[] nums){
        if (nums.length == 0) { throw new IllegalArgumentException("Array is empty."); }
        int sum = 0;
        for (int num : nums) {
            sum += num; 
        }
        return sum;
    }

    public static int averageUsingForLoop(int[] nums){
        if (nums.length == 0) { throw new IllegalArgumentException("Array is empty."); }
        int sum = 0;
        for (int num : nums) { sum += num; }
        return (sum / nums.length);
    }
}
