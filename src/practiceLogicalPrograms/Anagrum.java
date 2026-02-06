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

}
