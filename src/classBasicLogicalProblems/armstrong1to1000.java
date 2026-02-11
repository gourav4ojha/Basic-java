package classBasicLogicalProblems;

public class armstrong1to1000 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=1000; i++) {
			int count=0;
			int num=i;
			while(num>0) {
				num/=10;
				count++;
			}
			num=i;
			int sum = 0;
            while(num>0) {
            	int a=num%10;
            	sum += Math.pow(a, count);
            	num /= 10;
	       }
            if(sum==i) {
            	System.out.println(i);
            }		
		}
    }
}
	
