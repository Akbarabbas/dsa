package com.akky.study.dsa.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		List<Boolean> newArr = new ArrayList<Boolean>();
		int maxCandieAvailable = Integer.MIN_VALUE;
		for (int candie : candies) {
			if (candie > maxCandieAvailable)
				maxCandieAvailable = candie;
		}
		for (int candie : candies) {
			if ((candie + extraCandies) >= maxCandieAvailable)
				newArr.add(true);
			else
				newArr.add(false);
		}
		
		System.out.println(newArr.toString());
	}
}
