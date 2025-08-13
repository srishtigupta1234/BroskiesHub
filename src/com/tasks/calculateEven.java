package com.tasks;

import java.util.Scanner;

public class calculateEven {
    public static boolean calculate(int n) {
    	if(n%2==0) return true;
    	return false;
    }
	public static void main(String[] args) {
		System.out.println("Welcome!");
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to find if it is even or not : ");
        int number = sc.nextInt();
        boolean ans = calculate(number);
        if(ans == true) {
        	System.out.println(number+" is even.");
        }else {
        	System.out.println(number+" is odd.");
        }
	}

}
