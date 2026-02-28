package classTest;

import java.util.Arrays;

public class LargestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str[] = {"flow","flowing","flog"};
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length-1];
        int n = s1.length();
        int m = s2.length();
        int min=Math.min(n, m);
        int i=0;
        while(i<min && s1.charAt(i) == s2.charAt(i)) {
        	i++;
        }
        System.out.println(s1.substring(0,i));
	}

}
