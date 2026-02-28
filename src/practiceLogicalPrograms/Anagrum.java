package practiceLogicalPrograms;
import java.util.*;
public class Anagrum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String st1="abca";
        String st2="bacc";
        if(st1.length() != st2.length()) {
        	System.out.println("Not armstrong");
        }
        Set<Character> st= new HashSet<>();
        for(char ch:st1.toCharArray()) {
        	st.add(ch);
        }
        for( char ch:st2.toCharArray()) {
        	if(!st.contains(ch)) {
        		System.out.println("NOT armstrong");
        		return;
        	}else {
        		st.remove(ch);
        	}
        }
        System.out.println("armstrong");
        
	}
	
	public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if length is the same
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        // Sort the character arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare the sorted arrays
        return Arrays.equals(ch1, ch2);
    }

}
