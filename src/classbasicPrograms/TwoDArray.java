package classbasicPrograms;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{10,20},{30,40}};
		System.out.println(arr[0][1]);
		System.out.println(arr[1][1]);
		
		for(int i=0; i<arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
//		method 2
		int arr2[][] = new int[2][2];
		arr2[0][0]=10;
		arr2[0][1]=20;
		
		arr2[1][0]=30;
		arr2[1][1]=40;
		System.out.println("method 2");
		for(int i=0; i<arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
