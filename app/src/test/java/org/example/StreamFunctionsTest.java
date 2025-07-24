package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StreamFunctionsTest {
    @Test
    void maximumTest() {
        assertEquals(5, StreamFunctions.maximumUsingStream(new int[]{1,2,3,4,5}));
        assertEquals(-1, StreamFunctions.maximumUsingStream(new int[]{-5,-4,-3,-2,-1}));
        assertEquals(3, StreamFunctions.maximumUsingStream(new int[]{1,2,3,2,1}));
        assertThrows(IllegalArgumentException.class, () -> {StreamFunctions.maximumUsingStream(new int[]{});});
    }    
    @Test
    void minimumTest() {
        assertEquals(1, StreamFunctions.minimumUsingStream(new int[]{1,2,3,4,5}));
        assertEquals(-5, StreamFunctions.minimumUsingStream(new int[]{-5,-4,-3,-2,-1}));
        assertEquals(1, StreamFunctions.minimumUsingStream(new int[]{1,2,3,2,1}));
        assertThrows(IllegalArgumentException.class, () -> {StreamFunctions.minimumUsingStream(new int[]{});});
    }
    @Test
    void sumTest() {
        assertEquals(15, StreamFunctions.sumUsingStream(new int[]{1,2,3,4,5}));
        assertEquals(-15, StreamFunctions.sumUsingStream(new int[]{-5,-4,-3,-2,-1}));
        assertEquals(9, StreamFunctions.sumUsingStream(new int[]{1,2,3,2,1}));
        assertThrows(IllegalArgumentException.class, () -> {StreamFunctions.sumUsingStream(new int[]{});});
    }
    @Test
    void averageTest() {
        assertEquals(3, StreamFunctions.averageUsingStream(new int[]{1,2,3,4,5}));
        assertEquals(-3, StreamFunctions.averageUsingStream(new int[]{-5,-4,-3,-2,-1}));
        assertEquals(1, StreamFunctions.averageUsingStream(new int[]{1,2,3,2,1}));
        assertThrows(IllegalArgumentException.class, () -> {StreamFunctions.averageUsingStream(new int[]{});});
    }
}
