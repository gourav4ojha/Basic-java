package classTest;
import java.util.*;

public class ocuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "welcometojava";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
        	map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> mp : map.entrySet()) {
        	System.out.println(mp.getKey() +"->"+ mp.getValue());
        }
        
	}

}
