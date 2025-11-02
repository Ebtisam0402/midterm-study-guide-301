import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

    @Test
    void testLongestWordNormalCase() {
        List<String> words = List.of("apple", "apricot", "avocado", "banana");
        char letter = 'a';

        String result = Practice.longestWordList(words, letter);
        assertEquals("avocado", result); // longest word starting with 'a'
    }

    @Test
    void testLongestWordNoMatchingLetter() {
        List<String> words = List.of("apple", "banana", "cherry");
        char letter = 'z';

        String result = Practice.longestWordList(words, letter);
        assertNull(result); // no word starts with 'z'
    }

    
    // count words in hashset
    @Test
    void testCountWordsHashSetNormal() {
        Set<String> words = new HashSet<>(Set.of("apple", "banana", "pear", "kiwi", "grape"));
        int result = Practice.countWordsInRange(words, 4, 6);
        assertEquals(2, result); // "apple" and "grape"
    }


    @Test
    void testCountWordsSingleWord_ArrayList() {
       Set<String> words = Set.of("apple");
        int result = Practice.countWordsInRange(words, 3, 6); // length >3 and <6
        assertEquals(1, result); // "apple" length is 5 → counted
    }

    @Test
    void testCountWordsHashSetEmpty() {
        Set<String> words = new HashSet<>();
        int result = Practice.countWordsInRange(words, 2, 5);
        assertEquals(0, result);
    }

    //Find the difference between the how many odd and even numbers there are in:Values of HashMap
    @Test
    void testOddEvenDiffMoreOdd() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        map.put(2, 7);
        map.put(3, 2);

        int result = Practice.oddEvenDiff(map);
        assertEquals(1, result); // 2 odd (5,7), 1 even (2) → difference = 1
    }

    @Test
    void testOddEvenDiffMoreEven() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 4);
        map.put(2, 6);
        map.put(3, 3);

        int result = Practice.oddEvenDiff(map);
        assertEquals(1, result); // 2 even (4,6), 1 odd (3) → difference = 1
    }

    @Test
    void testOddEvenDiffEmptyMap() {
        Map<Integer, Integer> map = new HashMap<>();
        int result = Practice.oddEvenDiff(map);
        assertEquals(0, result); // empty map → difference = 0
    }

    @Test
    void testOddEvenDiffAllOdd() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 3);
        map.put(3, 5);

        int result = Practice.oddEvenDiff(map);
        assertEquals(3, result); // 3 odd, 0 even → difference = 3
    }
    //Find the second-largest number test in array
    @Test
    void testSecondLargestAllPositive() {
        int[] nums = {8, 3, 15, 10, 6};
        int result = Practice.secondLargest(nums);
       
         assertEquals(10, result); // largest = 15, second largest = 10
    }

    @Test
    void testSecondLargestWithNegatives() {
        int[] nums = {-10, -5, -2, -8};
        int result = Practice.secondLargest(nums);
        assertEquals(-5, result); // largest = -2, second largest = -5
    }
    @Test
    void testSecondLargestTwoElements() {
        int[] nums = {7, 9};
        int result = Practice.secondLargest(nums);
        assertEquals(7, result); // largest = 9, second largest = 7
    }

}


