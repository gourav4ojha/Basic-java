package ClassString;

public class CountVovels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "wElcometojava";
		int cnt =0;
		int conso=0;
		for(int i=0; i<str.length(); i++) {
//			char ch = str.charAt(i);
			char ch = Character.toLowerCase(str.charAt(i));
//			ch.toLowerCase();
			if(ch=='a'||ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
				cnt++;
			}
			else conso++;
		}
		System.out.println("vovel: "+ cnt +", consonent: " + conso);
		
		// chae srray to string conversion 
//		String st = new String(ch);

	}

}
