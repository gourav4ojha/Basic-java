package ClassString;

public class EvencharFolowedByOddchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeks";
		String even = "";
		String odd = "";
		for(int i=0; i<str.length(); i+=2) {
			even += str.charAt(i);
		}
		for(int i=1; i<str.length(); i+=2) {
		     odd += str.charAt(i);
		}
		System.out.println(even + " "+ odd);
		
				
	}
}
