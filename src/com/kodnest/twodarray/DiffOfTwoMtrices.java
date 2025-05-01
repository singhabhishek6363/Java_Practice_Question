package com.kodnest.twodarray;

import java.util.Scanner;

public class DiffOfTwoMtrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	       System.out.println("Please enter the number of row");
	       int row=s.nextInt();
	       System.out.println("Please enter the number of column");
	       int col=s.nextInt();
	       System.out.println("Plese enter the first matrix "+(row*col)+" elements...");   
	       int[][] arr1=new int[row][col];
	       for(int i=0;i<row;i++) {
	    	   for(int j=0;j<col;j++) {
	    		   arr1[i][j]=s.nextInt();
	    	   }
	       }
	       System.out.println("Plese enter the second matrix "+(row*col)+" elements...");   
	       int[][] arr2=new int[row][col];
	       for(int i=0;i<row;i++) {
	    	   for(int j=0;j<col;j++) {
	    		   arr2[i][j]=s.nextInt();
	    	   }
	       }
	       //System.out.println("Plese enter the first matrix "+(row*col)+" elements...");   
	       int[][] arr3=new int[row][col];
	       System.out.println("Difference of two matrices is ---");
	       for(int i=0;i<row;i++) {
	    	   for(int j=0;j<col;j++) {
	    		   arr3[i][j]= arr1[i][j]- arr2[i][j];
	    		   System.out.print(arr3[i][j]+"\t");
	    	   }
	    	   System.out.println();
	       }
	    

	}

}
