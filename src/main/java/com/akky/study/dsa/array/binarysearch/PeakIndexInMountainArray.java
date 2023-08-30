package com.akky.study.dsa.array.binarysearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
//https://leetcode.com/problems/find-peak-element/submissions/
public class PeakIndexInMountainArray {
	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 5, 6, 4, 3, 2 };
//		int[] arr = { 0, 10, 5, 2 };
//		int[] arr = { 0, 2, 1, 0 };
//		int[] arr = { 0, 1, 0 };
//		int[] arr = { 1, 2, 3, 5, 6 };
		int[] arr = { 3, 5, 3, 2, 0 };
		System.out.println("Peak index of given moutain array is: " + binarySearchPeakIndex(arr));
	}

	static int binarySearchPeakIndex(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1])
				end = mid;
			else
				start = mid + 1;
		}
		return start;
	}
}
