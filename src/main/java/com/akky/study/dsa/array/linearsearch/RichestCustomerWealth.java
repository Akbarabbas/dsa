package com.akky.study.dsa.array.linearsearch;

public class RichestCustomerWealth {
	public static void main(String[] args) {
		int[][] accounts = { {2,8,7}, {7,1,3}, {1,9,5} };
		int maxTotalWealth = Integer.MIN_VALUE;
		for (int[] account : accounts) {
			int totalWealth = 0;
			for (int wealth : account) {
				totalWealth += wealth;
			}
			if (totalWealth > maxTotalWealth)
				maxTotalWealth = totalWealth;
		}

		System.out.println(maxTotalWealth);
	}

}
