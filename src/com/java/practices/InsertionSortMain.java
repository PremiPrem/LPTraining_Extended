package com.java.practices;

public class InsertionSortMain {
	
		public static void main(String[] args) {
			int arr[]= {100,20,15,30,5,75,40};
			insertionSort(arr);
		}

		public static int[] insertionSort(int arr[]) { 
			for(int i=1;i<arr.length;i++) {
				int min=arr[i];
				int j;
				for( j=i;j>0 && arr[j-1]>min;j--) {
				arr [j]=arr[j-1];
						
					}
					arr[j]=min;
				System.out.print("Iteration"+ (i) + ":");
				printArray(arr);
			}
			
			return arr;
		}
		
			
			public static void printArray(int arr[]) {
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+ "");
				}
					System.out.println();
				}
			}






