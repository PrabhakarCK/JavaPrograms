import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaSortExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Aaaa", "Bbb", "Cc", "Z", "D");
        //1. Sort Ascending order
        Collections.sort(list);
        System.out.println("Sort Ascending order" + list);

        //2.  sort by name length
        list.sort((o1, o2) -> o1.length() - o2.length());
        System.out.println("Sort by name length" + list);

        //3. sort in descending order
        list.sort(Comparator.reverseOrder());
        System.out.println("sort in descending order" + list);

        //4. search using binary search
        Collections.sort(list);
        int i = Collections.binarySearch(list, "Aaaa");
        System.out.println("search using binary search" + i);

        //5.  reverse the list order
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("reverse the list order" + list);

        //6.  shuffle list for random order
        Collections.shuffle(list);
        System.out.println("Shuffle list for random order" + list);

        //7. swap elements at specified indices
        System.out.println("Before Swap elements at specified indices" + list);
        Collections.swap(list, 2, list.size() - 1);
        System.out.println("After Swap elements at specified indices" + list);

    }
}
