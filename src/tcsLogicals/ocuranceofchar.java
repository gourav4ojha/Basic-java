package tcsLogicals;
// we have to return the first and last acurance of a character in the string 

import java.util.Scanner;
class ocuranceofchar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        String str = sc.next();
        char ch = sc.next().charAt(0);
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                max = Math.max(max,i);
                min = Math.min(min,i);
            }
        }
       System.out.println("{"+ max +"," + min + "}");
    }
}