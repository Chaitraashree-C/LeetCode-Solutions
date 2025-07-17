package com.example;

import java.util.Scanner;

public class ValidAnagrams {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String t = sc.next();
		
		System.out.println(isAnagram(s, t));
	}
	
	public static boolean isAnagram(String s, String t)
	{
		if(s.length() != s.length())
		{
			return false;
		}
		
		int[] freq = new int[26];
		
		for(char c : s.toCharArray())
		{
			freq[c - 'a'] ++;
		}
		
		for(char c : t.toCharArray())
		{
			freq[c - 'a'] --;
			
			if(freq[c - 'a'] < 0)
			{
				return false;
			}
		}
		
		return true;
	}

}
