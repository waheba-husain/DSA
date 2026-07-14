// Problem: Second Largest Element in an Array
// Link: https://takeuforward.org/plus/dsa/problems/second-largest-element?source=strivers-a2z-dsa-track
// Approach: Sort array, then scan from end to find first element different from largest, O(n log n) time, O(1) space (excluding sort's internal space)

import java.util.Arrays;

class Solution {
    public int secondLargestElement(int[] nums) {
        Arrays.sort(nums);

        int largest = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                return nums[i];
            }
        }

        return -1;
    }
} //end


//optimal solution
//Complexity: O(n) time, O(1) space

Class Solution{
    public int secondLargestElement(int[] nums){
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        for(num:nums){
            if(num > largest){
                seclargest = largest;
                largest = num;
            }else if(num>seclargest && num!=largest){
                seclargest = num
            }
        }
        return seclargest == Integer.MIN_VALUE ? -1 : seclargest;
    }
}