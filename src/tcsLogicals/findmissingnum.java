package tcsLogicals;
// given the list of number from 0 to 9 be have to print the missing number

// or be can use addd and subtract method 
import java.util.Scanner;
import java.util.*;
class findmissingnum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N-1];
        for(int i=0; i<N-1; i++){
            arr[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<N-1; i++){
            set.add(arr[i]);
        }
        int ans=0;
        for(int i=1; i<N; i++){
            if(!set.contains(i)){
                ans = i;
            }
        }
        
        System.out.println("ans-" + ans);
        
    }
}
