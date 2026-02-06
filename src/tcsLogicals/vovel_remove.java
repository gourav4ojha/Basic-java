package tcsLogicals;
// given a string we have to remove the vovels from the string


import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class vovel_remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine(); 
        
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!vowels.contains(ch)) {
                ans.append(ch);
            }
        }
        System.out.println(ans.toString());
    }
}
