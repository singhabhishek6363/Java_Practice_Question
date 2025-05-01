package com.kodnest.twodarray;

import java.util.Scanner;

public class PrincipalDiagonal {

	public PrincipalDiagonal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
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
	       System.out.println("Principal Diagonals  Elements are...");
	       for(int i=0;i<row;i++) {
	    	   for(int j=0;j<col;j++) {
	    		   if (i==j) {
	    		   System.out.print(arr[i][j]+"\t");
	    		   }
	    	   }
	    	   System.out.println();
	       }


	}

}
