public class SlidingWindowMaxSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSumSubarray(arr, k));
    }

    public static int maxSumSubarray(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;

        // Calculate the sum of the first window of size K
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        // Slide the window, subtract the element going out, and add the element coming in
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k]; // Slide the window to the right
            maxSum = Math.max(maxSum, windowSum); // Update max sum
        }

        return maxSum;
    }
}
