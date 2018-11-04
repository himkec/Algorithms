package com.practice.arrays;

import java.util.Arrays;

public class ArraysSolution {
	// Move zero's -- Given an array nums, write a function
	// to move all 0's to the end of it while maintaining the relative order of the
	// non-zero elements.
	// Shift non-zero values as far forward as possible
	// Fill remaining space with zeros

	public static int[] moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		int insertPos = 0;
		for (int num : nums) {
			if (num != 0)
				nums[insertPos++] = num;
		}

		while (insertPos < nums.length) {
			nums[insertPos++] = 0;
		}
		return nums;
	}

	// Given two binary strings, return their sum (also a binary string).
	// The input strings are both non-empty and contains only characters 1 or 0.

	public static String addBinary(String a, String b) {
		//String result="";
		int next = 0;
		char[] arrayOne = a.toCharArray();
		char[] arrayTwo = b.toCharArray();
		int sizeOne = arrayOne.length;
		int sizeTwo = arrayTwo.length;
		int s = sizeOne - sizeTwo;
		String result = new String();
		if(sizeOne >= sizeTwo) {
			for(int i=sizeOne-1; i>= s ; i--) {
				char lastArrayOne = arrayOne[i];
				//System.out.println(lastArrayOne);
				char lastArrayTwo = arrayTwo[--sizeTwo];
				//System.out.println(lastArrayTwo);
				int a1 = Character.getNumericValue(lastArrayOne);
				int b1 = Character.getNumericValue(lastArrayTwo); 
				int res = a1+ b1+ next;
				System.out.println("result is : " + a1 + b1 + next + res);
				switch(res) {
				case 0:
					result = result + 0;
					next = 0;
					break;
				case 1:
					result = result + 1;
					next = 0;
					break;
				case 2: 
					result = result + 0;
					next = 1;
					break;
				case 3:
					result = result + 1;
					next = 1;
					break;
				}
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		int[] nums = { 1, 0, 1, 0, 12 };
		int[] result = moveZeroes(nums);
		System.out.println(Arrays.toString(result));
		String a = "11001";
		String b = "1100";
		System.out.println(addBinary(a,b));
	}

}
