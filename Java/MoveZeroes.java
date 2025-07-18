package com.example;

import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nums = new int[n];

		for(int i = 0; i < n; i ++)
		{
			nums[i] = sc.nextInt();
		}
		
		moveZeroes(nums);
	}
	
	public static void moveZeroes(int[] nums)
	{
		int nonZeroIdx = 0;
		
		for(int i = 0; i < nums.length; i ++)
		{
			if(nums[i] != 0)
			{
				nums[nonZeroIdx ++] = nums[i];
			}
		}
		
		while(nonZeroIdx < nums.length)
		{
			nums[nonZeroIdx ++] = 0;
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
