package com.akky.study.dsa.array.binarysearch;

//https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {
	public static void main(String[] args) {
		MountainArray arr = new MountainArray(new int[] { 1, 2, 3, 4, 5, 3, 1 });
//		MountainArray arr = new MountainArray(new int[] { 0, 1, 2, 4, 2, 1 });
		System.out.println(searchInMountainArray(3, arr));
	}

	static int searchInMountainArray(int target, MountainArray mountainArr) {
		int peakIndex = binarySearchPeakIndex(mountainArr);
		int leftIndex = binarySearchTarget(mountainArr, 0, peakIndex, target, true);
		if (leftIndex != -1)
			return leftIndex;
		else
			return binarySearchTarget(mountainArr, peakIndex, mountainArr.length() - 1, target, false);
	}

	static int binarySearchPeakIndex(MountainArray mountainArr) {
		int start = 0;
		int end = mountainArr.length() - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (mountainArr.get(mid) > mountainArr.get(mid + 1))
				end = mid;
			else
				start = mid + 1;
		}
		return start;
	}

	static int binarySearchTarget(MountainArray mountainArr, int start, int end, int target, boolean isLeftSubArray) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < mountainArr.get(mid)) {
				if (isLeftSubArray)
					end = mid - 1;
				else
					start = mid + 1;
			} else if (target > mountainArr.get(mid))
				if (isLeftSubArray)
					start = mid + 1;
				else
					end = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}

class MountainArray {
	private int[] arr;

	public MountainArray(int[] arr) {
		this.arr = arr;
	}

	public int length() {
		return arr.length;
	}

	public int get(int index) {
		return arr[index];
	}
}