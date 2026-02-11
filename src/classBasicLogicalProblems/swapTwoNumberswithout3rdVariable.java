package classBasicLogicalProblems;

public class swapTwoNumberswithout3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=23;
		int b=45;
		a=a+b;
		b=a-b;
	    a=a-b;
	    System.out.println(a);
	    System.out.println(b);
        
	    int temp=a;
	    a=b;
	    b=temp;
	    System.out.println(a);
	    System.out.println(b);
	    
	    a=a^b;
	    b=a^b;
	    a=a^b;
	    System.out.println(a);
	    System.out.println(b);
	}
}
