package com.akky.study.dsa.array.binarysearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
	public static void main(String[] args) {
		int[] nums = { 5, 1, 3 };
		int target = 5;
		System.out.println(search(nums, target));
	}

	static int search(int[] nums, int target) {
		int peakIndex = findPeakIndex(nums);
		if (peakIndex == -1)
			return binarySearch(nums, 0, nums.length - 1, target);
		if (target == nums[peakIndex])
			return peakIndex;
		if (target >= nums[0])
			return binarySearch(nums, 0, peakIndex - 1, target);
		else
			return binarySearch(nums, peakIndex + 1, nums.length - 1, target);
	}

	static int findPeakIndex(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && nums[mid] > nums[mid + 1])
				return mid;
			if (mid > start && nums[mid] < nums[mid - 1])
				return mid - 1;
			if (nums[mid] <= nums[start])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

	static int binarySearch(int[] nums, int start, int end, int target) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < nums[mid])
				end = mid - 1;
			else if (target > nums[mid])
				start = mid + 1;
			else
				return mid;
		}
		return -1;
	}
}
