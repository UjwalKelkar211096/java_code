package com.app;

import java.util.Arrays;

public class ArrayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  nums[] = {1,4,3,2};
		ArrayPartition ap = new ArrayPartition();
		ap.arrayPairSum(nums);
	}
	
	
	  public int arrayPairSum(int[] nums) {
		  int sum =0;
		 // int pair []= new int[nums.length/2];
		 
		  
		  Arrays.sort(nums);		
		 System.out.println(Arrays.toString(nums));
		  for(int i=0; i<nums.length; i++) {
			if(i % 2 == 0) {
				sum = sum + nums[i];
			}
			
			
			
		  }
		
		  
		  System.out.println(sum);
		  
		  return sum;
	        
	    }

}
