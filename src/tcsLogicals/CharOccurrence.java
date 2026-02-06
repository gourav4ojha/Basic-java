package tcsLogicals;

// given two string s1 and s2 we have to return 
// number of occurance of s2 string characters in s1
// import java.util.*;
// import java.util.Scanner;
// public class char_orecance {
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     String s1 = sc.next();
//     String s2 = sc.next();
//     int count =0;
//     for(int i=0; i<s2.length(); i++){
//         for(int j=0; j<s1.length(); j++){
//             if(s2.charAt(i)==s1.charAt(j)) count++;
//         }
//     }
//      System.out.println(count);
//     }
// }
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CharOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        // Map to store character frequencies in s1
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Populate the map with frequencies of characters in s1
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Count the occurrences of characters from s2 in s1
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            count += charCountMap.getOrDefault(c, 0);
        }

        System.out.println(count);
    }
}



