package tcsLogicals;
// given a list of string be have to find the common prefix 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        
        int n = sc.nextInt();
        
        if (n == 0) {
            System.out.println("");
            return;
        }
        
        for (int i = 0; i < n; i++) {
            String st = sc.next();
            str.add(st);
        }
        
        String prefix = str.get(0);
        for (String currentString : str) {
            while (!currentString.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }
        System.out.println("Longest common prefix: " + prefix);
    }
}
