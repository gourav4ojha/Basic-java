package tcsLogicals;
// Airport security officials have confiscated several item of the passengers at the security check point. All the items have been dumped into a huge box (array). Each item 
// possesses a certain amount of risk[0,1,2]. Here, the risk severity of the items represent an array[] of N number of integer values. The task here is to sort the items based on
//  their levels of risk in the array. The risk values range from 0 to 2.
// Example :
// Input :
// 7  -> Value of N
// [1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.
// Output :
// 0 0 0 1 1 2 2  -> Element after sorting based on risk severity 


import java.util.Scanner;
class question4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int zero =0;
        int one =0;
        int two =0;
        
        for(int i=0;i<n; i++){
            if(arr[i] == 0) zero++;
            else if(arr[i] == 1)one++;
            else if(arr[i] == 2)two++;
        }
        int j=0;
        while(zero > 0){
            arr[j++] = 0;
            zero--;
        }
        while(one>0){
            arr[j++] = 1;
            one--;
        }
        while(two>0){
            arr[j++]=2;
            two--;
        }
        
        
        for(int ans : arr){
            System.out.println(ans);
        }
    }
}



// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         // Read the array elements
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         // Dutch National Flag algorithm
//         int low = 0;    // Pointer for 0s
//         int mid = 0;    // Pointer for the current element
//         int high = n - 1; // Pointer for 2s
        
//         while (mid <= high) {
//             if (arr[mid] == 0) {
//                 // Swap arr[low] and arr[mid], move both pointers
//                 swap(arr, low++, mid++);
//             } else if (arr[mid] == 1) {
//                 // Move the mid pointer
//                 mid++;
//             } else {
//                 // Swap arr[mid] and arr[high], move the high pointer
//                 swap(arr, mid, high--);
//             }
//         }
        
//         // Print the sorted array
//         for (int ans : arr) {
//             System.out.println(ans);
//         }
        
//         sc.close(); // Close the scanner
//     }
    
//     // Helper method to swap two elements in the array
//     private static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }
