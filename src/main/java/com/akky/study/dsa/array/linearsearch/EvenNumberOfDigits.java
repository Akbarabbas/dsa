package com.akky.study.dsa.array.linearsearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenNumberOfDigits {
	public static void main(String[] args) {
		int[] nums = { 4, 653, 45, 8906, 555, 10123, 160876, 70 };
		System.out.println(countNumbersWithEvenNumberOfDigits(nums));
		System.out.println(getNumberOfDigits(160876));
		System.out.println(getNumberOfDigitsOptimized(160876));
	}

	static int countNumbersWithEvenNumberOfDigits(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (getNumberOfDigits(arr[i]) % 2 == 0)
				count++;
		}
		return count;
	}

	static int getNumberOfDigits(int number) {
		if (number == 0) {
			return 1;
		}
		int count = 0;
		number = Math.abs(number);
		while (number > 0) {
			count++;
			number = number / 10;
		}
		return count;
	}

	static int getNumberOfDigitsOptimized(int number) {
		number = Math.abs(number);
		return (int) (Math.log10(number)) + 1;
	}
}
