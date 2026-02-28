package classTest;

public class SecondRepeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {2,5,3,7,3,1,7,9};
        int ans[] = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length; i++) {
        	boolean repet = false;
        	for(int j=i+1; j<arr.length; j++) {
        		if(arr[i]==arr[j]) repet = !repet;
        	}
        	if(!repet) {
        		ans[k++] = arr[i];
        	}
        }
        System.out.println(ans[1]);
	}

}
