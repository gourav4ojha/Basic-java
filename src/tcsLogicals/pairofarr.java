package tcsLogicals;
// to find the pain or array such that pair divisible by 2
// input {1,3,7,2,6,2}
//output 4
// explanation (3,1) (7,1)(2,6) .. 
// should not count the duplicates
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Pairofarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        Set<String> seenPairs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (sum % 2 == 0) {
                    // Create a canonical form of the pair
                    int min = Math.min(arr[i], arr[j]);
                    int max = Math.max(arr[i], arr[j]);
                    String pair = min + "," + max;

                    if (!seenPairs.contains(pair)) {
                        seenPairs.add(pair);
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
