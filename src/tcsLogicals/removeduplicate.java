package tcsLogicals;
// given a sorted array be have to remove the duplicate elements

import java.util.Scanner;
import java.util.*;
class removeduplicate {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr []= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List <Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i] != arr[i-1]){
                ans.add(arr[i]);
            }
        }
        for(int num : ans){
            
        System.out.println(num);
        }
    }
}