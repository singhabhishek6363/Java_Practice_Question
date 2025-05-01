package com.kodnest.twodarray;

import java.util.Scanner;

public class SumOfAllElements {

	public SumOfAllElements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int sum=0;
	       System.out.println("enter the number of row");
	       int row=s.nextInt();
	       System.out.println("enter the number of column");
	       int col=s.nextInt();
	       System.out.println("Plese enter the "+(row*col)+" elements...");   
	       int[][] arr=new int[row][col];
	       for(int i=0;i<row;i++) {
	    	   for(int j=0;j<col;j++) {
	    		   arr[i][j]=s.nextInt();
	    	   }
	       }
	       System.out.println("Elements in matrix are...");
	       for(int i=0;i<row;i++) {
	    	   for(int j=0;j<col;j++) {
	    		   
	    		   sum = sum+arr[i][j];
	    		  // System.out.print(sum);
	    		   
	    	   }
	    	  
	       }

	       System.out.println(sum);


	}

}
