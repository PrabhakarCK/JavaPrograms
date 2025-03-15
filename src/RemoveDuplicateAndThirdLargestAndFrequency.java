import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateAndThirdLargestAndFrequency {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 8, 5, 6, 4, 7, 7, 8, 8, 8, 2, 3, 3, 3};

        removeDuplicate(numbers);

        findThirdLargestUniqueNumber(numbers);

        findTheFrequency(numbers);
    }

    // 1) Removes duplicates while maintaining the original order.
    private static void removeDuplicate(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).boxed().distinct().toList();
        System.out.println("Remove Duplicate" + list);
    }

    // 2) Finds the third-largest unique number in the array.
    private static void findThirdLargestUniqueNumber(int[] numbers) {
        Set<Integer> set = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        List<Integer> list = set.stream().toList();
        if (list.size() > 3)
            System.out.println("3rd element." + list.get(2));
        else
            System.out.println("There is no 3rd element.");

    }

    // 3) Groups numbers by their frequency and prints them in descending order of frequency.
    private static void findTheFrequency(int[] numbers) {
        Map<Integer, Long> map = Arrays.stream(numbers).boxed().collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
        TreeMap<Integer, Long> longTreeMap = new TreeMap<>(Collections.reverseOrder());
        longTreeMap.putAll(map);
        System.out.println("Groups numbers by their frequency and prints them in descending order of frequency." + longTreeMap);


    }


}
