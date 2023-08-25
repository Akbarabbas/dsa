package com.akky.study.dsa.array.binarysearch;

public class FloorAndCeilOfNumber {
	public static void main(String[] args) {
		int[] arr = { -19, -13, -7, 0, 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
		int[] arr2 = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130 };
//		System.out.println(binarySearchCeilingOfNumber(arr, 0, arr.length - 1, 10));
		binarySearchFloorAndCeilingOfNumber(arr, 0, arr2.length - 1, -21);
	}

	static void binarySearchFloorAndCeilingOfNumber(int[] arr, int start, int end, int target) {
		if (end < start) {
			if (end >= 0)
				System.out.println("Floor: " + arr[end]);
			if (start <= arr.length - 1)
				System.out.println("Ceil: " + arr[start]);
			return;
		}

		int mid = start + (end - start) / 2;
		if (target < arr[mid])
			binarySearchFloorAndCeilingOfNumber(arr, start, mid - 1, target);
		else if (target > arr[mid])
			binarySearchFloorAndCeilingOfNumber(arr, mid + 1, end, target);
		else
			System.out.println(arr[mid]);

	}

}
