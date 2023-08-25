package com.akky.study.dsa.array.binarysearch;

public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {
		int[] arr = { -19, -13, -7, 0, 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
		System.out.println(binarySearchTarget(arr, 0, arr.length - 1, 48));

		int[] arr2 = { 48, 36, 20, 14, 12, 11, 9, 6, 4, 2, 0, -7, -13, -19 };
		System.out.println(binarySearchTarget(arr2, 0, arr2.length - 1, 6));

		int[] arr3 = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
		System.out.println(binarySearchTarget(arr3, 0, arr3.length - 1, 5));
	}

	static int binarySearchTarget(int[] arr, int start, int end, int target) {
		if (end == start)
			return ((arr[end] == target) ? end : -1);
		else if (end < start)
			return -1;

		boolean isAsc = arr[start] < arr[end];

		int mid = start + (end - start) / 2;
		if (arr[mid] == target)
			return mid;

		if (isAsc) {
			if (target < arr[mid])
				return binarySearchTarget(arr, start, mid - 1, target);
			else if (target > arr[mid])
				return binarySearchTarget(arr, mid + 1, end, target);
		} else {
			if (target > arr[mid])
				return binarySearchTarget(arr, start, mid - 1, target);
			else
				return binarySearchTarget(arr, mid + 1, end, target);
		}
		return -1;
	}
}
