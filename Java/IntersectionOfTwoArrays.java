package com.example;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		int[] nums1 = new int[n1];
		
		for(int i = 0; i < n1; i ++)
		{
			nums1[i] = sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		
		int[] nums2 = new int[n2];
		
		for(int i = 0; i < n2; i ++)
		{
			nums2[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
	
	public static int[] intersection(int[] nums1, int[] nums2)
	{
		HashSet<Integer> seen = new HashSet<>();
		
		for(int num : nums1)
		{
			seen.add(num);
		}
		
		HashSet<Integer> result = new HashSet<>();
		
		for(int num : nums2)
		{
			if(seen.contains(num))
			{
				result.add(num);
			}
		}
		
		int[] output = new int[result.size()];
		
		int i = 0;
		
		for(int num : result)
		{
			output[i ++] = num;
		}
		
		return output;
	}

}
