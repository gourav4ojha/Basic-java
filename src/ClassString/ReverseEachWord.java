package ClassString;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to java";
		String st[] = str.split(" ");
		
		for(int i=0; i<st.length; i++) {
			System.out.print(reverse(st[i])+" ");
		}
     
	}
	
	public static String reverse(String str) {
		String ans= "";
		for(int i=str.length()-1; i>=0; i--) {
			ans += str.charAt(i);
		}
		return ans;	
	}

}
