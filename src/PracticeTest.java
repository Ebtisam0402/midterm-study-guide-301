import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;


public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffAllPositive() {
        // Arrange
        int[] numbers = {8, 2, 9, 5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: 2, Difference: 9 - 2 = 7
        assertEquals(7, actual);
    } 
    
        @Test
    void testMaxDiffSingleElement() {
        // Arrange
        int[] numbers = {10};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // only one element the difference is 0
        assertEquals(0, actual);
    } 

    // TODO: Make tests for each problem you solve
    
}


