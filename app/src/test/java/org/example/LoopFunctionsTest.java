package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoopFunctionsTest {
    @Test
    void maximumTest() {
        assertEquals(5, LoopFunctions.maximumUsingForLoop(new int[]{1,2,3,4,5}));
        assertEquals(-1, LoopFunctions.maximumUsingForLoop(new int[]{-5,-4,-3,-2,-1}));
        assertEquals(3, LoopFunctions.maximumUsingForLoop(new int[]{1,2,3,2,1}));
        assertThrows(IllegalArgumentException.class, () -> {LoopFunctions.maximumUsingForLoop(new int[]{});});
    }    
    @Test
    void minimumTest() {
        assertEquals(1, LoopFunctions.minimumUsingForLoop(new int[]{1,2,3,4,5}));
        assertEquals(-5, LoopFunctions.minimumUsingForLoop(new int[]{-5,-4,-3,-2,-1}));
        assertEquals(1, LoopFunctions.minimumUsingForLoop(new int[]{1,2,3,2,1}));
        assertThrows(IllegalArgumentException.class, () -> {LoopFunctions.minimumUsingForLoop(new int[]{});});
    }
    @Test
    void sumTest() {
        assertEquals(15, LoopFunctions.sumUsingForLoop(new int[]{1,2,3,4,5}));
        assertEquals(-15, LoopFunctions.sumUsingForLoop(new int[]{-5,-4,-3,-2,-1}));
        assertEquals(9, LoopFunctions.sumUsingForLoop(new int[]{1,2,3,2,1}));
        assertThrows(IllegalArgumentException.class, () -> {LoopFunctions.sumUsingForLoop(new int[]{});});
    }
    @Test
    void averageTest() {
        assertEquals(3, LoopFunctions.averageUsingForLoop(new int[]{1,2,3,4,5}));
        assertEquals(-3, LoopFunctions.averageUsingForLoop(new int[]{-5,-4,-3,-2,-1}));
        assertEquals(1, LoopFunctions.averageUsingForLoop(new int[]{1,2,3,2,1}));
        assertThrows(IllegalArgumentException.class, () -> {LoopFunctions.averageUsingForLoop(new int[]{});});
    }
}
