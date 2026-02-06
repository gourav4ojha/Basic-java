package tcsLogicals;
// give 2d matrix contain 0,1 find row number with max 1

import java.util.*;
import java.util.Scanner;
public class rownumwithmax1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = -1;
        int max = 0;
        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<m; j++){
                if(arr[i][j] == 1) cnt++;
            }
            if(max<cnt) {
                max = cnt;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
