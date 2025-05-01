package com.kodnest.twodarray;

import java.util.Scanner;

public class EvenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("enter the number of row");
       int row=s.nextInt();
       System.out.println("enter the number of column");
       int col=s.nextInt();
       System.out.println("Plese enter the "+(row*col)+" elements...");   
       s.close();
       int[][] arr=new int[row][col];
       for(int i=0;i<row;i++) {
    	   for(int j=0;j<col;j++) {
    		   arr[i][j]=s.nextInt();
    	   }
       }
       System.out.println("Even Elements are...");
       for(int i=0;i<row;i++) {
    	   for(int j=0;j<col;j++) {
    		   if (arr[i][j]%2==0) {
    		   System.out.print(arr[i][j]+"\t");
    		   }
    	   }
    	   System.out.println();
       }
	}

}
