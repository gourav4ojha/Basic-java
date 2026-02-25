package ClassString;
import java.util.*;

public class NumberAcuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str = "jfihgfjow";
         Scanner sc= new Scanner(System.in);
         char ch = sc.next().charAt(0);
         int cnt =0;
         for(int i=0; i<str.length(); i++) {
        	 if(ch == str.charAt(i)) {
        		 cnt++;
        	 }
         }
         System.out.println(cnt);
	}

}
