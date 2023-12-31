package com.akky.study.dsa.array.linearsearch;

public class LinearSearch {
	public static void main(String[] args) {
		int[] nums = { 4, 653, 45, 8906, 555, 10123, 160876, 70 };
		System.out.println(linearSearch(nums, 70));

		System.out.println(searchInRange(nums, 5, 7, 10));

		System.out.println(findMin(nums));

		System.out.println(findMax(nums));
	}

	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}

		return -1;
	}

	static int searchInRange(int[] arr, int start, int end, int target) {
		if (end < start)
			return -1;
		else if (start == end)
			if (arr[start] == target)
				return start;
			else
				return -1;

		for (int i = start; i <= end; i++) {
			if (arr[i] == target)
				return i;
		}

		return -1;
	}

	static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		return min;
	}

	static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}
}
