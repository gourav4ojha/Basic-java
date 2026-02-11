package classArraysLogicalProgramsIn;

import java.util.Scanner;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number of Row: ");
          int n= sc.nextInt();
          System.out.println("Enter number of Col: ");
          int m= sc.nextInt();
          
          int m1[][] = new int[n][m];
          int m2[][] = new int[n][m];
          System.out.println("values of first matrix");
          for(int i=0; i<n; i++) {
        	  for(int j=0; j<m; j++) {
        		  m1[i][j]=sc.nextInt();
        	  }
          }
          System.out.println("values of second matrix");
          for(int i=0; i<n; i++) {
        	  for(int j=0; j<m; j++) {
        		  m2[i][j]=sc.nextInt();
        	  }
          }
          int ans[][] = new int[n][m]; 
          for(int i=0; i<n; i++) {
        	  for(int j=0; j<m; j++) {
        		  ans[i][j]=m2[i][j]+m1[i][j];
        	  }
          }
          System.out.println("values of second matrix");
          for(int i=0; i<n; i++) {
        	  for(int j=0; j<m; j++) {
        		  System.out.print(ans[i][j]+ " ");
        	  }
        	  System.out.println();
          }
          
	}

}
