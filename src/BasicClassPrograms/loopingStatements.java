package BasicClassPrograms;

public class loopingStatements {

	public static void main(String[] args) {

		// While loop
		int a=3;
		while(a<=10) {
			System.out.println("Welcome");
			a++;
		}
		
		// do while loop
		
		do {
			System.out.println("Execute at least once");
			a++;
		}
		while(a<=0);
		
		// for loop
		
		for(int i=0; i<a; i++) {	
			System.out.println("nn");
			break;
		}
		
		//nested for loop
		for(int i=0; i<=3; i++) {
			for(int j=0; j<=3; j++) {
				System.out.print(i*j +" "); // print in rows
			}
			System.out.println();
		}
		
	}
}