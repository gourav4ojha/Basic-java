package classbasicPrograms;

public class Operators {

	public static void main(String[] args) {
		
//		Arithmetic operation
       int a=3;
       int b=4;
       System.out.println("Arithmetic Operators");
       System.out.println(a+b);
       System.out.println(a-b);
       System.out.println(a*b);
       System.out.println(a/b);
       System.out.println(a%b);
       
//       Relational Operator
//       a=3 b=4
       System.out.println();
       System.out.println("Relational operators");
       System.out.println(a<b);
       System.out.println(a>b);
       System.out.println(a<=b);
       System.out.println(a>=b);
       System.out.println(a==b);
       System.out.println(a!=b);
       
//     Assignment Operator
       System.out.println();
       System.out.println("Assignment Operators");
       int c=10;
       int d=5;
       System.out.println(c); //10
       c += 10;
       System.out.println(c); //20
       d += c;
       System.out.println(d); //25
       c += d;
       System.out.println(c);//45
       c *= d;
       System.out.println(c); //1125
       c /=d;
       System.out.println(d); //25
       c %=d;
       System.out.println(c); //20
       
//     Logical Operator
//     a=3 b=4
       System.out.println();
       System.out.println("Logical operators");
       System.out.println(a==b && a>b); //false && false 
       System.out.println(a>b || a != b); //false || true
       System.out.println(!(a==b && a<b)); //!(false && true)
       
//     Bitwise Operator
//     a=3 b=4
       System.out.println();
       System.out.println("Bitwise");
       System.out.println(a&b);
       System.out.println(a|b);
       System.out.println(13&15);
       System.out.println(13|15);
       System.out.println(15&23);
       System.out.println(23|15);
       
       
//     Unary Operator
       System.out.println();
       int Q=10;
       System.out.println("Unary");
       Q--;
       System.out.println(Q);
       Q++;
       System.out.println(Q);
       
//     Ternary Operator
       System.out.println();
       System.out.println("Ternary");
       String res = a>0 ? "Positive" : "negative";
       System.out.println(res);
       String st = b%2==0 ? "Even" : "Odd";
       System.out.println(st);
	}
}
