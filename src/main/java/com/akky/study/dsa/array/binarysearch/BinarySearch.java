package com.akky.study.dsa.array.binarysearch;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { -19, -13, -7, 0, 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
		System.out.println(binarySearchTargetRecursive(arr, 0, arr.length - 1, 48));
		System.out.println(binarySearchTarget(arr, 48));
	}

	static int binarySearchTargetRecursive(int[] arr, int start, int end, int target) {
		if (end == start)
			return ((arr[end] == target) ? end : -1);
		else if (end < start)
			return -1;

		int mid = start + (end - start) / 2;
		if (target < arr[mid])
			return binarySearchTargetRecursive(arr, start, mid - 1, target);
		else if (target > arr[mid])
			return binarySearchTargetRecursive(arr, mid + 1, end, target);
		else
			return mid;

	}

	static int binarySearchTarget(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid])
				end = mid - 1;
			else if (target > arr[mid])
				start = mid + 1;
			else
				return mid;
		}
		return -1;
	}
}
