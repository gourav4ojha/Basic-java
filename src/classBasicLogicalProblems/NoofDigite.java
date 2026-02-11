package classBasicLogicalProblems;

public class NoofDigite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 107870;
		int count=0;
		while(num>0) {
			num /= 10;
			count++;
		}
		System.out.println(count);

	}

}
