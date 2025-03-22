import java.util.Arrays;

public class CommonJavaPrograms {
    public static void main(String[] args) {
        //Reverse a String
        String input = "Interview";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.toCharArray()[i];
        }
        System.out.println("ReverseString : " + reversed);

        //Check for Palindrome
        String str = "madam";
        String revers = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revers += str.toCharArray()[i];
        }
        if (str.equals(revers)) System.out.println("The string is Palindrome");

        String stringBuilder = new StringBuilder(str).reverse().toString();
        if (stringBuilder.equals(str)) System.out.println("The string is Palindrome");
        //Find Factorial of a Number 5*4*3*2*1 = 120
        int factorial = 5;
        int sum = 1;
        for (int i = 1; i <= factorial; i++) {
            sum *= i;
        }
        System.out.println("Find Factorial of a Number : " + sum);

        //Fibonacci Series
        int fibonacci = 10;
        int first = 0;
        int second = 1;
        for (int i = 0; i < fibonacci; i++) {
            System.out.print(first + " ");
            int sumOfNumbers = first + second;
            first = second;
            second = sumOfNumbers;
        }
        // Prime Number Check
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, etc.
        //prime number can only be divided evenly by 1 and the number itself.
        int primeNUmber = 5;
        boolean isPrime = true;

        for (int i = 2; i < primeNUmber / 2; i++) {
            if (primeNUmber % i == 0) {
                isPrime = false;
                System.out.println("The given " + primeNUmber + " number is Not Prime");
                break;
            }
        }
        System.out.println("The given " + primeNUmber + " number is Prime");

        // Find Largest Element in an Array
        int[] arr = {12, 35, 1, 10, 34, 1};
        int largestNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }
        System.out.println("The largest number " + largestNumber);

        //Sum of Digits in a Number
        int numbers = 12345;
        int sumOfNumber = 0;
        String string = String.valueOf(numbers);
        for (int i = 0; i < string.length(); i++) {
            //System.out.println(string.charAt(i));
            // System.out.println(Integer.parseInt(String.valueOf(string.charAt(i))));
            int a = string.charAt(i) - '0';
            sumOfNumber += a;
        }
        System.out.println("Sum Of Number : " + sumOfNumber);

        //Find Missing Number in an Array
        int[] arr1 = {1, 2, 3, 5};
        Arrays.sort(arr1);
        if (arr1[0] != 1) {
            System.out.println("Missing Number in an Array : 0");
        }
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] != arr1[i - 1] + 1) {
                System.out.println("Missing Number in an Array : " + (arr1[i - 1] + 1));
            }
        }

        //Count Occurrences of a Character in a String
        String string1 = "programming";
        char character = 'g';
        long counts = string1.chars().filter(value -> value == character).count();
        System.out.println("Count Occurrences of a Character \"" +character+ "\" in a String : " + counts);

    }
}

