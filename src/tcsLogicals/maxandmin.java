package tcsLogicals;
// you are given a number the target is to fing the lar

import java.util.Scanner;
class maxandmin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int arr[] = new int[2];
        
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int m=0;
        while(n != 0){
            m = n%10;
            n=n/10;
            maxi= Math.max(maxi,m);
            mini=Math.min(mini,m);
        }
        arr[0]= mini;
        arr[1] = maxi;
        for(int i=0;i<2;i++){
            System.out.println(arr[i]);
        }
    }
}
