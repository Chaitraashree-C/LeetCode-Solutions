package com.example;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i ++)
		{
			nums[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
	
	public static int[] twoSum(int[] nums, int target)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i ++)
		{
			int complement = target - nums[i];
			
			if(map.containsKey(complement))
			{
				return new int[] {map.get(complement), i};
			}
			
			map.put(nums[i], i);
		}
		
		return new int[] {};
	}

}


