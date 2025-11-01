import java.util.ArrayList;
import java.util.List;

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
    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}