package ClassString;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GouRAvarUOG";
		str = str.toLowerCase();
		int i=0 , j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				System.out.println("not palindrome");
				return;
			}
			i++;
			j--;
		}
		System.out.println("palindrome");

	}

}
