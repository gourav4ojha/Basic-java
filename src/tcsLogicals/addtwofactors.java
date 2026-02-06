package tcsLogicals;
//Add two fraction a/b and c/d and print answer in simplest form.
// Examples : 
// Input:  1/2 + 3/2
// Output: 2/1

import java.util.Scanner;
class addtwofactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        addfraction(num1, den1, num2, den2);
    }    
    public static void addfraction(int num1, int den1, int num2, int den2) {
        // Find least common denominator (LCD)
        int den3 = getGCD(den1, den2);
        den3 = (den1 * den2) / den3;        
        // Find the numerator for the result
        int num3 = (num1) * (den3 / den1) + (num2) * (den3 / den2);        
        // Reduce the fraction to its lowest form
        reduceFraction(num3, den3);
    }    
    public static void reduceFraction(int num3, int den3) {
        int common_factor = getGCD(num3, den3);        
        num3 = num3 / common_factor;
        den3 = den3 / common_factor;        
        // Print the result in reduced form
        System.out.println(num3 + "/" + den3);
    }    
    // Method to get the Greatest Common Divisor (GCD)
    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}
