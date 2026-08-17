package com.app;

/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

 
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,2, 3, 4, 4};
		ContainsDuplicate cd = new ContainsDuplicate();
		System.out.println(cd.containsDuplicate(nums));
	}
	
	
	 public boolean containsDuplicate(int[] nums) {
	        
	        for(int i= 0; i<nums.length; i++) {
	        	int count = 0;
	        	for(int j=0; j<nums.length; j++) {
	        		
	        		if(nums[j] == nums[i])
	        			count++;
	        	}
	        	if(count > 1) {
	        		return true;
	        	
	        	}
	        	
	        }
			return false;

}
}
