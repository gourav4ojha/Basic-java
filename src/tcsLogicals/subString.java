package tcsLogicals;
// given two string s1 and s2 check s1 contains s2

import java.util.Scanner;
import java.util.*;

class subString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String str1 = sc.next();
        String str2 = sc.next();
        if(str1.length() < str2.length()){
            System.out.println("false");
            return;
        }
        if( !str1.contains(str2)){
             System.out.println("false");
            return;
        }       
        System.out.println("true");
    }
}
