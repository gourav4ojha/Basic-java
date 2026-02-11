package classArraysLogicalProgramsIn;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Row: ");
        int n= sc.nextInt();
        System.out.println("Enter number of Col: ");
        int m= sc.nextInt();
        
        int m1[][] = new int[n][m];
    
        System.out.println("values of first matrix");
        for(int i=0; i<n; i++) {
      	  for(int j=0; j<m; j++) {
      		  m1[i][j]=sc.nextInt();
      	  }
      	  System.out.println();
        }
        
        int ans[][] = new int[n][m]; 
        for(int i=0; i<n; i++) {
      	  for(int j=0; j<m; j++) {
      		  ans[i][j]=m1[j][i];
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
