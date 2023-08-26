package com.akky.study.dsa.array.binarysearch;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPositionOfElement {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 7, 7, 7, 9, 11 };
		int target = 11;
		int[] ans = { -1, -1 };
		ans[0] = binarySearchTarget(arr, target, true);
		if (ans[0] != -1)
			ans[1] = binarySearchTarget(arr, target, false);
		System.out.println("Target: " + target);
		System.out.println("FirstIndex: " + ans[0] + "; LastIndex: " + ans[1]);
	}

	static int binarySearchTarget(int[] arr, int target, boolean isFirstIndex) {
		int ans = -1;
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid])
				end = mid - 1;
			else if (target > arr[mid])
				start = mid + 1;
			else {
				ans = mid;
				if (isFirstIndex)
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return ans;
	}
}
