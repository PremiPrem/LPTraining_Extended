package com.java.practices;

public class JumpLoop {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=3;j++) {
			if(j==2) {
				break;
			}
			System.out.println(j);
		}
		System.out.println(i);
	}

}
}
