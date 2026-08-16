package com.app;

/*
 * 136. Single Number
Easy
Topics
premium lock icon
Companies
Hint
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1
 */
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {5, 4, 6, 4, 5};
		SingleNumber sn = new SingleNumber();
		System.out.println(sn.singleNumber(nums));
		//System.out.println(5^3);
		
	}
	
	 public int singleNumber(int[] nums) {
	       	        
//	        for(int i=0; i<nums.length; i++) {
//	        	int count = 0;
//	        	for(int j=0; j<nums.length; j++) {
//	        		if(nums[i] == nums[j])
//	        			count ++;
//	        	
//	        	}
//	        	if(count == 1)
//	        		return nums[i];
//	        }
//	        
//	        
//	       return -1;
		 int result = 0;
		 for(int i=0; i<nums.length; i++) {
			 result = result ^ nums[i];
			 
		 }
		 return result;
		 
	    }

}
