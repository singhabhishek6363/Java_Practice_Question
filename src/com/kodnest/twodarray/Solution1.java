package com.kodnest.twodarray;
/*
 * WAJP to display marks of students present in different classes each .Read the
 *  marks of students using scanner statements  and display the
 *  marks with an appropriate user prompt message. 
 */

import java.util.Scanner;
public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println(" User please enter the total number of classes : ");
		int m= s.nextInt();
		System.out.println("Use please enter the total number of students: ");
		int n = s.nextInt();
		int [][] a = new int [m] [n];
		System.out.println("Enter the  "+(m*n)+" marks of  students :  ");
		for (int i =0; i<= m-1; i++) {
			for (int j = 0; j<= n-1; j++) {
				a[i][j]= s.nextInt();
			}
		}
		System.out.println(" The marks of  students are :  ");
		for (int i =0; i<=m-1; i++) {
			for (int j = 0; j<= n-1; j++) {
				System.out.println(a[i][j]);
			}
		}


	}

}
