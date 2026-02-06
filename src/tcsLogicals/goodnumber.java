package tcsLogicals;
// to find the good number and bad number 
//    good number is a numbe which is divisible by its sum of digits

import java.util.*;
import java.util.Scanner;

public class goodnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = n;
        if(n > 9){
            int num =0;
            while(n != 0){
                num += n%10;
               n=n/10;
            }
           sum=num;
        }
        if(n % sum == 0) System.err.println("Good");
        else System.err.println("Bad");
    }

}



// import java.util.Scanner;

// public class GoodNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         // Store the original value of n for the final check
//         int originalN = n;
        
//         // Calculate the sum of digits
//         int sum = 0;
//         while (n != 0) {
//             sum += n % 10;
//             n = n / 10;
//         }

//         // Check if the original number is divisible by the sum of its digits
//         if (originalN % sum == 0) {
//             System.out.println("Good");
//         } else {
//             System.out.println("Bad");
//         }
//     }
// }
