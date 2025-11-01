import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
      // maxDiff with an Array
        int min = nums [0];
        int max = nums [0];

        for(int i=1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];

             }
             if (nums[i] > max){
                max = nums[i];
             }
        }
        int maxDiff = max - min;
        return maxDiff;
    }
    
    // An array list
    //“I want a list of Integers.”
   //“The variable name will be nums.”
  //“Create a new, empty ArrayList to store the numbers.”
  public static int maxDiffList(List<Integer>nums) {

    if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty");
        }

     int min = nums.get(0);
     int max = nums.get(0);

    for (int i = 1; i < nums.size(); i++){
        //Instead of writing min < numbers.get(i) 
        int currentNum = nums.get(i);
        //check for minimum
        if (currentNum < min){     
            min = currentNum;
        }
        //check for max
        if (currentNum > max){
            max = currentNum;
        }
        
    }
    int maxDiffList = max-min;
        return maxDiffList;

  }

  // HashSet
      public static int maxDiffSet(Set<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException("Set must not be null or empty");
        }

        // Get the first number from the set
        // need to use an iterator — because a Set doesn’t have order or positions.
        int firstValue = nums.iterator().next();
        int min = firstValue;
        int max = firstValue;

        // Loop through all numbers in the set
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }

        //Max difference of hashmap values
        public static int maxDiffMapValues(Map<Integer, Integer> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map must not be null or empty");
        }

        // Initialize min and max using the first value
        int firstValue = map.values().iterator().next();
        int min = firstValue;
        int max = firstValue;

        // Loop through all values
        for (int value : map.values()) {
            if (value < min) min = value;
            if (value > max) max = value;
        }

        return max - min;
    }

    // max difference of Hash Map keys
    public static int maxDiffMapKeys(Map<Integer, Integer> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map must not be null or empty");
        }

        // Initialize min and max using the first key
        int firstKey = map.keySet().iterator().next();
        int min = firstKey;
        int max = firstKey;

        // Loop through all keys
        for (int key : map.keySet()) {
            if (key < min) min = key;
            if (key > max) max = key;
        }

        return max - min;
    }

    //Find the longest word that starts with a specific character letter in:Arraylist
    //// Method just takes a list and the letter to check
       public static String longestWordList(List<String> words, char letter) {
        if (words == null || words.isEmpty()) {
            return null;
        }

        String longest = null;

        for (String word : words) {
            if (word != null && !word.isEmpty() && word.charAt(0) == letter) {
                if (longest == null || word.length() >=longest.length()) {
                    longest = word;
                }
            }
        }

        return longest;
    }

//Count how many words are longer than n characters and shorter than m characters in:Hashset
 public static int countWordsInRange(Set<String> words, int n, int m) {
    int count = 0;

    for (String word : words) {
        if (word != null && word.length() > n && word.length() < m) {
            count++;
        }
    }

    return count;
}

//Find the difference between the how many odd and even numbers there are in:Values of HashMap
public static int oddEvenDiff(Map<Integer, Integer>map){
    int oddCount = 0;
    int evenCount = 0;

    for (int num : map.values()) {
        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }

    return Math.abs(oddCount - evenCount);
}



    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}