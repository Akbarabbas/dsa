package com.akky.study.dsa.array.binarysearch;

//here the infinity of an array is defined by not using the length property of an array
public class InfiniteSortedArraySearch {
	public static void main(String[] args) {
		int[] arr = { 3, 9, 16, 20, 22, 27, 31, 36, 42, 49, 54, 69, 73, 75, 82, 87, 91, 99 };
		int target = 31;
		int[] subArrIndexes = findChunk(arr, target);
		int searchIndex = binarySearchTarget(arr, subArrIndexes[0], subArrIndexes[1], target);
		System.out.println("Index of target: " + searchIndex);
	}

	static int[] findChunk(int[] arr, int target) {
		int start = 0;
		int end = 1;
		int chunkSize = 2;
		int[] subArrayIndexes = { -1, -1 };
		while (target > arr[end]) {
			start = end + 1;
			chunkSize *= 2;
			end = start + chunkSize;
			subArrayIndexes[0] = start;
			subArrayIndexes[1] = end;
			try {
				int num = arr[end];
			} catch (ArrayIndexOutOfBoundsException e) {
				break;
			}
		}
		return subArrayIndexes;
	}

	static int binarySearchTarget(int[] arr, int start, int end, int target) {
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
