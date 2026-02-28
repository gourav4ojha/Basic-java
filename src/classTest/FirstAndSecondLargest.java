package classTest;

public class FirstAndSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,4,6,2,9,2,62,62};		
		int f = 0;
		int s=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>f) {
				s=f;
				f=arr[i];
			}
		}
		
		System.out.println("first largest " + f +" second largest: "+s);
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					int temp = arr[i];
//					arr[i]=arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		int n= arr.length;
//		int f=0;
//		int s=0;
//		f=arr[n-1];
//		for(int i=n-2;i>=0;i--) {
//			if(arr[i] != arr[i+1]) {
//				s=arr[i];
//				break;
//			}
//		}
//		System.out.println("first largest " + f +" second largest: "+s);


	}

}
