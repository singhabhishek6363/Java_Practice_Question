package com.kodnest.twodarray;

import java.util.Scanner;

public class SumOfRowAndColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int sum =0;
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
	    		   if(j==1||i==0) {
	    			   sum= sum+arr[i][j];
	    		  // System.out.print(arr[i][j]+"\t");
	    		   }
	    	   }
	    	   
	       }
	       System.out.println(sum);

	}

}
