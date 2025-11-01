import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    // Testes for array list

@Test
void testMaxDiffListSingleElement() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        int actual = Practice.maxDiffList(numbers);
        assertEquals(0, actual);
    }


@Test
void testMaxDiffList_EmptyList() {
    // Arrange
    List<Integer> numbers = new ArrayList<>();

    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> {
        Practice.maxDiffList(numbers);
    });
}

@Test
void testMaxDiffList_NullList() {
    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> {
        Practice.maxDiffList(null);
    });
}

// Hash set 
@Test
void testMaxDiffSetNegative() {
        // Arrange
        Set<Integer> numbers = new HashSet<>();
        numbers.add(-8);
        numbers.add(-2);
        numbers.add(-9);
        numbers.add(-5);

        // Act
        int actual = Practice.maxDiffSet(numbers);

        // Assert
        // Largest: -2, Smallest: -9, Difference: -2-(-9) = -11
        assertEquals(7, actual);
    }

@Test
void testMaxDiffSetMixedValues() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(8);
        numbers.add(-2);
        numbers.add(9);
        numbers.add(-5);

        int actual = Practice.maxDiffSet(numbers);
        assertEquals(14, actual); // 9 - (-5) = 14
    }

    @Test
    void testMaxDiffSetSingleValue() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);

        int actual = Practice.maxDiffSet(numbers);
        assertEquals(0, actual); // only one element
    }

    @Test
    void testMaxDiffSetEmptySet() {
        Set<Integer> numbers = new HashSet<>();
        assertThrows(IllegalArgumentException.class, () -> {
            Practice.maxDiffSet(numbers);
        });
    }

    @Test
    void testMaxDiffSetNullSet() {
        assertThrows(IllegalArgumentException.class, () -> {
            Practice.maxDiffSet(null);
        });
    }

}


