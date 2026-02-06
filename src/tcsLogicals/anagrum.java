package tcsLogicals;
// we have given two string and our tast is to check if both string has 
// exact seme characters or not order may be change

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class anagrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        if (str1.length() != str2.length()) {
            System.out.println("false");
            return;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                System.out.println("false");
                return;
            }
            map.put(ch, map.get(ch) - 1);
        }
        
        // If all frequencies in the map are zero, they are anagrams
        System.out.println("true");
    }
}
