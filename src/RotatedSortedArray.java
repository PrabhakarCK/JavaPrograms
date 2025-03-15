public class RotatedSortedArray {

        public static boolean isRotatedSorted(int[] numbers) {
            int count = 0; // To count the number of drop points (where numbers[i] > numbers[i + 1])

            for (int i = 0; i < numbers.length; i++) {
                // Compare current element with next, considering the array is circular
                if (numbers[i] > numbers[(i + 1) % numbers.length]) {
                    count++;
                }
            }

            // If there is exactly one drop point or zero (indicating the array is already sorted)
            return count <= 1;
        }

        public static void main(String[] args) {
            int[] numbers = {3, 4, 5, 1, 2};
            System.out.println(isRotatedSorted(numbers));  // Output: true
        }
}
