// Problem: Largest Element in an Array
// Link: https://takeuforward.org/plus/dsa/problems/largest-element?source=strivers-a2z-dsa-track
// Approach: Single pass, track max while iterating, O(n) time, O(1) spaceclass Solution {
    public int largestElement(int[] nums) {
        int largest = nums[0];
        for(int i = 1; i< nums.length; i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
    return largest;
    }
}