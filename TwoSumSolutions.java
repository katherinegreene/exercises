import java.util.HashMap;
import java.util.Map;

public class TwoSumSolutions {

    /**
     * Brute-force solution using two nested for-loops.
     * Time Complexity: O(n^2)
     *
     * @param nums   Input array of integers
     * @param target Target sum
     * @return Indices of the two numbers that add up to target
     */
    public static int[] twoSumBruteForce(int[] nums, int target) {
        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Start inner loop from i+1 to avoid using the same element twice
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of nums[i] and nums[j] equals the target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the indices
                }
            }
        }
        // Fallback if no solution found (problem guarantees exactly one solution)
        return new int[]{};
    }

    /**
     * Optimized solution using a HashMap.
     * Time Complexity: O(n), Space Complexity: O(n)
     *
     * @param nums   Input array of integers
     * @param target Target sum
     * @return Indices of the two numbers that add up to target
     */
    public static int[] twoSumHashMap(int[] nums, int target) {
        // Create a map to store complement -> index
        Map<Integer, Integer> complementMap = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if current number exists in map (i.e., a previous number's complement)
            if (complementMap.containsKey(nums[i])) {
                // Found the pair: return current index and the index stored in the map
                return new int[]{complementMap.get(nums[i]), i};
            }
            // Store the complement of the current number in the map
            int complement = target - nums[i];
            complementMap.put(complement, i);
        }
        // Fallback if no solution found
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Test brute-force solution
        int[] resultBruteForce = twoSumBruteForce(nums, target);
        System.out.println("Brute-force solution indices: " + resultBruteForce[0] + ", " + resultBruteForce[1]);

        // Test HashMap solution
        int[] resultHashMap = twoSumHashMap(nums, target);
        System.out.println("HashMap solution indices: " + resultHashMap[0] + ", " + resultHashMap[1]);
    }
}
