package tcsLogicals;
// give a number be have to return 1 if the sum of factorial of digits of the numbers are equal else return 0

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int originalNum = num;  // Store the original number
        int sum = 0;
        
        // Precompute factorials for digits 0-9
        int[] factorial = new int[10];
        factorial[0] = 1;
        for (int i = 1; i <= 9; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        
        // Calculate the sum of the factorials of the digits
        while (num != 0) {
            int digit = num % 10;    // Get the last digit
            sum += factorial[digit]; // Add the precomputed factorial of the digit
            num = num / 10;          // Remove the last digit
        }
        
        // Compare the sum of the factorials with the original number
        if (originalNum == sum) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
