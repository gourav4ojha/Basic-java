package tcsLogicals;
// given two sorted array find their union
import java.util.*;
import java.util.Scanner;

public class union_of_arr {
    public static void main(String [] srgs){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            arr2[i]= sc.nextInt();
        }
        Set<Integer> st = new HashSet<>();
        for(int i=0; i<n; i++){
            st.add(arr1[i]);
        }
        for(int i=0; i<m; i++){
            st.add(arr2[i]);
        }
        System.out.println(st);

    }
}
