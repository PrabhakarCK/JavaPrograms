import java.util.Arrays;
import java.util.List;

public class TwoPointerTechnique {
    //Given a sorted list of integers, we want to find two numbers that sum to a given target.
    public static void main(String[] args) {
        // A sorted list of integers
        List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 8, 10, 12, 15);
        int target = 10;
        findPairWithSum(numbers, target);

        // A sorted list of strings
        List<String> words = Arrays.asList("apple", "bat", "cat", "dog", "hat", "rat", "tap", "tapdog");
        String target1 = "batdog";

        // Call the function to find a pair of strings that concatenate to the target
        findPairWithConcatenation(words, target1);

    }

    private static void findPairWithSum(List<Integer> numbers, int target) {

        int left = 0;
        int right = numbers.size() - 1;

        while (left < right) {
            int sum = numbers.get(left) + numbers.get(right);
            if (sum == target) {
                System.out.println("Found a pair: " + numbers.get(left) + " and " + numbers.get(right));
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No pair found that sums to " + target);
    }

    private static void findPairWithConcatenation(List<String> words, String target) {
        int left = 0;
        int right = words.size() - 1;

        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                String concatenated = words.get(i) + words.get(j);  // Concatenate the two strings
                if (concatenated.equals(target)) {
                    System.out.println("Found a pair: " + words.get(i) + " and " + words.get(j));
                   // return;  // Exit after finding the first pair
                }
            }
        }

        while (left < right) {
            String concatenated = words.get(left) + words.get(right);  // Concatenate the two strings

            if (words.get(left).concat(words.get(right)).equalsIgnoreCase(target)) {
                System.out.println("Found a pair: " + words.get(left) + " and " + words.get(right));
                return;
            } else if (concatenated.compareTo(target) < 0) {
                left++;

            } else {
                right--;
            }
        }

        System.out.println("No pair found that concatenates to " + target);

    }

}
