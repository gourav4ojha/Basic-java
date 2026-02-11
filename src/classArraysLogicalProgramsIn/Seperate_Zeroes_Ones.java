package classArraysLogicalProgramsIn;

public class Seperate_Zeroes_Ones {

	public static void main(String[] args) {
		int a[]= {0,1,0,0,1,0,0,0,1,1,1,0};
		int n=a.length;
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				System.out.print(a[i]+" ");
				cnt++;
			}
		}
		for (int i = cnt; i < a.length; i++) {
			System.out.print("1"+" ");
		}

	}

}
