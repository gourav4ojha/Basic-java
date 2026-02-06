package tcsLogicals;
// here is given two string we have to fing uncommon characters betwee two string
// input  digital
//        ninja
// output  dtgjln
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class UncommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.next();
        System.out.println("Enter the second string:");
        String str2 = sc.next();        
        Set<Character> ans = new HashSet<>();
        // Use Boolean (wrapper class) instead of primitive boolean
        Map<Character, Boolean> Map1 = new HashMap<>();
        Map<Character, Boolean> Map2 = new HashMap<>();
        // Fill Map1 for str1
        for (char ch : str1.toCharArray()) {
            Map1.put(ch, true);
        }
        // Fill Map2 for str2 and check for uncommon characters from str2
        for (char ch : str2.toCharArray()) {
            if (!Map1.containsKey(ch)) {
                ans.add(ch);
            }
            Map2.put(ch, true);
        }         
        // Check for uncommon characters from str1
        for (char ch : str1.toCharArray()) {
            if (!Map2.containsKey(ch)) {
                ans.add(ch);
            }
        }
        // Output the result
        System.out.println("Uncommon characters: " + ans);
    }
}
