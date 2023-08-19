package com.akky.study.dsa.array.linearsearch;

public class LinearSearchIn2DArray {
	public static void main(String[] args) {
		int[][] arr = {
				{ 56, 78, 12 },
				{ 32, 43 },
				{ 100, 24, 80, 61 },
				{ 47, 95, 39, 10 }
		};
		search(arr, 10);
		System.out.println(findMax(arr));
		System.out.println(findMin(arr));
	}

	static void search(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target)
					System.out.println("row: " + (row+1) + "; col: " + (col+1));
			}
		}
		System.out.println("Target not found");
	}
	
	static int findMax(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > max)
					max = arr[row][col];
			}
		}
		return max;
	}

	static int findMin(int[][] arr) {
		int min = Integer.MAX_VALUE;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] < min)
					min = arr[row][col];
			}
		}
		return min;
	}
}
