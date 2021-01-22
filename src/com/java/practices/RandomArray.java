package com.java.practices;

public class RandomArray {
	private int[] theArray = new int[50];
	
	private int arraySize = 10;
	
	public void generateRandomArray(){
		
		for(int i = 0; i < arraySize; i++){
			
			theArray[i] = (int)(Math.random()*10)+10;
			
		}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomArray newArray=new RandomArray();
		newArray.generateRandomArray();
		
				
	}
			
			public void printArray(){
				
				System.out.println("----------");
				for(int i = 0; i < arraySize; i++){
					
					System.out.print("| " + i + " | ");
					System.out.println(theArray[i] + " |");
					
					System.out.println("----------");
					
				}
				
			}
		]	


