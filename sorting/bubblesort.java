// package sorting;

// import java.util.Scanner;

// public class bubblesort {
//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         int n = inp.nextInt();
//         int[] ar = new int[n];
//         for (int i = 0; i < n; i++)
//             ar[i] = inp.nextInt();
//         inp.close();

//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (ar[j] > ar[j + 1]) {
//                     int temp = ar[j];
//                     ar[j] = ar[j + 1];
//                     ar[j + 1] = temp;
//                 }
//             }
//         }
//         for (int i = 0; i < n; i++)
//             System.out.print(ar[i] + " ");
//     }
// }
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            
            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for left & right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        return result;
    }
}