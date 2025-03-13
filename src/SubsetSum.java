public class SubsetSum {
    public static void main(String[] args) {
        int[] A1 = {2, 4, 6, 8, 9};
        int target1 = 6;

//        int[] A2 = {1, 12, 4, 6, 20};
//        int target2 = 14;
        int[] A2 = {1, 12, 6, 4, 20};
        int target2 = 18;

        System.out.println("For A1 and target " + target1 + ": " + isSubsetSum(A1, target1));

        System.out.println("For A2 and target " + target2 + ": " + isSubsetSum(A2, target2));
    }

    //The algorithm is designed for continuous subarrays
    private static boolean isSubsetSum(int[] arr, int target) {
        int i = 0;
        int j = 0;
        int sum = 0;

        while (i < arr.length) {
            sum += arr[i];
            if (sum == target) {
                return true;
            }
            i++;

            while (sum > target) {
                sum -= arr[j];
                j++;
            }
        }
        return false;
    }
}
