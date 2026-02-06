package tcsLogicals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class AllSubarraysWithGivenSum {
    public static List<int[]> findAllSubarraysWithGivenSum(int[] arr, int k) {
        List<int[]> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> sumMap = new HashMap<>();
        int currentSum = 0;
        // Initialize sumMap with an empty subarray starting before index 0
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            // Check if currentSum - k exists in the map
            if (sumMap.containsKey(currentSum - k)) {
                List<Integer> startIndices = sumMap.get(currentSum - k);
                for (int startIndex : startIndices) {
                    // Add subarray to the result
                    result.add(java.util.Arrays.copyOfRange(arr, startIndex + 1, i + 1));
                }
            }
            // Add the current sum to the sumMap
            sumMap.putIfAbsent(currentSum, new ArrayList<>());
            sumMap.get(currentSum).add(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int k = 7;
        List<int[]> result = findAllSubarraysWithGivenSum(arr, k);
        if (!result.isEmpty()) {
            System.out.println("All subarrays with given sum:");
            for (int[] subarray : result) {
                for (int num : subarray) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No subarrays found with the given sum.");
        }
    }
}
