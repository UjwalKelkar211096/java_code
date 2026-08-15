package com.app;
/*An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 

Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false
 */

public class MonotonicArray {

	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 1};
		
		MonotonicArray mn = new MonotonicArray();
		System.out.println(mn.isMonotonic(nums));
		
	}
	
	 public boolean isMonotonic(int[] nums) {
		 int count = 1;
		if(nums[0] > nums[nums.length -1]) {
			
			for(int i=0; i<nums.length-1; i++) {
				if(nums [i+1 ] <= nums[i])
					count ++;
				System.out.println("count if"+count);
			}
		}else {
			for(int i=0; i<nums.length-1; i++) {
				if(nums[i+1] >= nums[i])
					count ++;
				System.out.println(" count else "+count);
			}
			
		}
		if(count == nums.length) {
			return true;
		}else
			return false;
		
	 }
}
