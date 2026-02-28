package practiceLogicalPrograms;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		******
//		*****
//		****
//		***
//		**
//		*
	
//		for(int i=5; i>=0; i--) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
//		*
//		**
//		***
//		****
//		*****
//		******
		
//		for(int i=0; i<=5; i++) {
//			for(int j=i; j>=0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		*            **
//		**          ***
//		***        ****
//		****      *****
//		*****    ******
//		******  *******
//		      **      *
//		     ****     *
//		    ******    *
//		   ********   *
//		  **********  *
//		 ************ *
//		 ************ *
//		  **********  *
//		   ********   *
//		    ******    *
//		     ****     *
//		      **      *
//		******  *******
//		*****    ******
//		****      *****
//		***        ****
//		**          ***
//		*            **

		
		
//		for(int i=0; i<=5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			for(int k=i; k<=5; k++) {
//				System.out.print(" ");
//			}
//			for(int k=5; k>=i; k--) {
//				System.out.print(" ");
//			}
//			for(int l=0; l<=i; l++) {
//				System.out.print("*");
//			}
//			System.out.println("*");	
//		}
//		
//		
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=i; k>=0; k--) {
				System.out.print("*");
			}
			for(int k=i; k>=1; k--) {
				System.out.print("*");
			}
			for(int l=5; l>=i; l--) {
				System.out.print(" ");
			}
			System.out.println();	
		}
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<=5; k++) {
				System.out.print("*");
			}
			for(int k=4; k>=i; k--) {
				System.out.print("*");
			}
			for(int l=0; l<=i; l++) {
				System.out.print(" ");
			}
			System.out.println("");	
		}
//		
//		for(int i=0; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print("*");
//			}
//			for(int k=i; k>=0; k--) {
//				System.out.print(" ");
//			}
//			for(int k=i; k>=0; k--) {
//				System.out.print(" ");
//			}
//			for(int l=5; l>=i; l--) {
//				System.out.print("*");
//			}
//			System.out.println("");	
//		}

//		1
//		01
//		010
//		1010
//		10101	
		
//         boolean num = true;
//       for(int i=0; i<5; i++) {
//	for(int j=0; j<=i; j++) {
//		if(num)System.out.print(1);
//		else System.out.print(0);
//		num =! num; 
//	}
//	System.out.println("");
//}

//	      1
//	     212
//	    32123
//	   4321234
//	  543212345
		
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print(" ");
//			}
//			for(int j=i; j>=1; j--) {
//				System.out.print(j);
//			}for(int j=2; j<=i; j++) {
//				System.out.print(j);
//			}
//
//			System.out.println("");
//		}
		
//		 1 2 3 4 5 
//		  2 3 4 5 
//		   3 4 5 
//		    4 5 
//		     5 
		     
//		for(int i=1; i<=5; i++) {
//		for(int j=1; j<=i; j++) {
//			System.out.print(" ");
//		}	
//		for(int j=i; j<=5; j++) {
//			System.out.print(j+" ");
//		}
//        System.out.println("");
//		}
		
//		* * * * * 
//		 *     * 
//		  *   * 
//		   * * 
//		    * 
		    
//		 for (int i = 1; i <= 5; i++) {
//	            for (int j = 1; j < i; j++) {
//	                System.out.print(" ");
//	            }
//	            for (int j = i; j <= 5; j++) {
//	                if(j==i||j==5||i==1)
//	                    System.out.print("* ");
//	                else
//	                    System.out.print("  ");
//	          }
//	            System.out.println();
//	    }
		
//		***** 
//		*   * 
//		*   * 
//		*   * 
//		***** 
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(i==1||i==5|| j==1|| j==5) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println(" ");
//			
//		}
		
		for(int i=1;i<=5;i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
