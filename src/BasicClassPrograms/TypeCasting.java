package BasicClassPrograms;

public class TypeCasting {

	public static void main(String[] args) {
		
//		Widening Casting
		
//		int a= 10; //4 byte
//		double b=a; //converting into double 8byte
//		System.out.println(a);
//		System.out.println(b);
//		// EX 2
//		char ch = 'B';
//		int d = ch;
//		System.out.println(d);
		
//		Narrowing
		
		double d = 10.5;
		int a = (int)d;
		System.out.println(a); // 10
	    //EX-2
		int b = 97;
		char ch = (char)b;
		System.out.println(ch); //a  
		//EX-3
		double c =10.5;
		float f = (float)c;
		System.out.println(f); // 10.5
	}

}
