package com.example;

import java.util.Scanner;

public class MaximumSubarray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i ++)
		{
			nums[i] = sc.nextInt();
		}
		
		System.out.println(maxSubarray(nums));
	}
	
	public static int maxSubarray(int[] nums)
	{
		int currentSum = nums[0];
		
		int maxSum = nums[0];
		
		for(int i = 1; i < nums.length; i ++)
		{
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			
			maxSum = Math.max(maxSum, currentSum);
		}
		
		return maxSum;
	}

}
