package com.example;

import java.util.Scanner;
import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i ++)
		{
			nums[i] = sc.nextInt();
		}
		
		System.out.println(containsDuplicate(nums));

	}
	
	public static boolean containsDuplicate(int[] nums)
	{
		HashSet<Integer> seen = new HashSet<>();
		
		for(int num : nums)
		{
			if(seen.contains(num))
			{
				return true;
			}
			
			seen.add(num);
		}
		
		return false;
	}

}
