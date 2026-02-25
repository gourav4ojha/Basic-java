package ClassString;

public class CountNumberOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Welcome";
        int cnt = 0;
        int i=0;
        try {
        	while(i<100) {
        		str.charAt(i);
        		cnt++;
        		i++;
        	}
        }
        catch(Exception e) {
        	System.out.println(cnt );
        }
	}

}
