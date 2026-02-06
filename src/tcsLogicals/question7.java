package tcsLogicals;
// A furnishing company is manufacturing a new collection of curtains. The curtains are of two colors aqua(a) and black (b). 
// The curtains color is represented as a string(str) consisting of a’s and b’s of length N. Then, they are packed (substring) 
// into L number of curtains in each box. The box with the maximum number of ‘aqua’ (a) color curtains is labeled. The task here is 
// to find the number of ‘aqua’ color curtains in the labeled box.
// Note :
// If ‘L’ is not a multiple of N, the remaining number of curtains should be considered as a substring too. In simple words, 
// after dividing the curtains in sets of ‘L’, any curtains left will be another set(refer example 1)
// Example 1:
// Input :
// bbbaaababa -> Value of str
// 3    -> Value of L
// Output:
// 3   -> Maximum number of a’s


import java.util.Scanner;
class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A string");
        String str = sc.next();
        System.out.println("Ente A number");
        int n= sc.nextInt();
        int max = 0; int cnt = 0;
        
       for(int i=0; i<str.length(); i++){
           if(i%n == 0){
               max = Math.max(max,cnt);
               cnt=0;
           }
           if(str.charAt(i) == 'a') cnt++;
       }
      max = Math.max(max,cnt);

        System.out.println("ans" + max);
    }
}