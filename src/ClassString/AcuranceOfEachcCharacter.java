package ClassString;
import java.util.*;
public class AcuranceOfEachcCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcomme";
//		for(int i=0; i<str.length(); i++) {
//			int cnt =0;
//			for(int j=0; j<str.length(); j++) {
//				if(str.charAt(i) == str.charAt(j))cnt++;
//			}
//			System.out.println(str.charAt(i)+" "+ cnt);
//		}
		
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
		}
		for(Map.Entry<Character, Integer > entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " -> " + entry.getValue());
		}

	}

}
