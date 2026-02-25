package ClassString;

public class LetterFolowedByDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str= "wel1234Come";
       String lettet = new String();
       String digits = new String();
       
       for(int i=0; i<str.length(); i++) {
    	   char ch = str.charAt(i);
    	   if(Character.isLetter(ch)) {
    		   lettet += ch;
    	   }
    	   else if( Character.isDigit(ch)) {
    		   digits += ch;
    	   }
       }
       str = lettet+digits;
       System.out.println(str);
	}

}
