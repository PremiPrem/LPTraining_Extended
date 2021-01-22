package com.java.practices;

import java.util.Arrays;

public class SortArrayInt {

	public static void main(String[] args) {
		int arr[]= {7,33,22,11,20,5,2};		
		System.out.println("Before Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] +" ");
		}
		Arrays.sort(arr);
		System.out.println();
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] +" ");
		}
		

	}

}
