package classlogicalproblems;

// HCM bade main se chota minus karna hamesha jub tk dono equal na ho   
//  ex 12, 6 gcd 6 
//

public class Gcd {
	public static void main(String[] args) {
		int a=12;
		int b=3;
		while(a != b) {
			if(a>b) a=a-b;
			else b=b-a;
		}
		System.out.print(a);
	}
}
