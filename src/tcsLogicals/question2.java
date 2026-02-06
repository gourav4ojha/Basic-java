package tcsLogicals;
// Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems 
// before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. 
// Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit.
//  Print the positive integer value after toggling all bits”.

// Constrains-

// 1<=N<=100

// Example 1:

// Input :

// 10  -> Integer

// Output :

// 5    -> result- Integer

import java.util.*;
import java.util.Scanner;
public class question2 {
    public static void main(String [] args, int i){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int numbit = Integer.toBinaryString(n).length();
        int mask= i-1;
        int ans= n^mask;
        System.out.println(ans);
        
    }
}
