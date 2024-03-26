package MySelectedQuestions;
/*
 * *******************Question Description******************************
 * Given an unsorted integer array nums. Return the smallest positive integer 
 * that is not present in nums.

 *  You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 * 
 * *******************Question Link***************************************
 * https://leetcode.com/problems/first-missing-positive/description/?envType=daily-question&envId=2024-03-26
 */

public class First_Missing_Positive {

    public static int firstMissingPositive(int[] nums) {
        boolean one = false; // Initialize a flag to track if 1 is present in the array

        int range = nums.length; // Get the length of the array
    
        // Step 1: Replace out of range or non-positive integers with 1

        for (int i = 0; i < range; i++) {
            if (nums[i] == 1) // Check if 1 is present in the array

                one = true; // Update the flag to true

            if (nums[i] > range || nums[i] < 1) { // If the number is out of range or non-positive

                nums[i] = 1; // Replace it with 1
            }
        }
    
        // Step 2: Mark the presence of each positive integer by changing its sign

        for (int i = 0; i < range; i++) {
            int idx = Math.abs(nums[i]); // Get the absolute value of the number

            nums[idx - 1] = -Math.abs(nums[idx - 1]); // Mark the presence of the number by changing its sign
        }

        if(one == false) return 1;

        // Step 3: Find the first missing positive integer

        for (int i = 0; i < range; i++) {

            if (nums[i] > 0) // If the number is positive

                return i + 1; // Return the index + 1 (as the index is 0-based)
        }
    
        // If all positive integers from 1 to range are present, return range + 1

        return range + 1;
    }
    
    public static void main(String[] args) {
        int arr [] = {-2, 1, 5, 3, 8, 9, -5, -1, 15};
        int missingPositive = firstMissingPositive(arr);
        System.err.println(missingPositive);//2
    }
}
