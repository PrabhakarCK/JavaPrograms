import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        System.out.println(map.get(3));
        System.out.println(map.floorKey(4));  // Output: 3
        System.out.println(map.floorKey(7));  // Output: 7
        System.out.println(map.floorKey(0));  // Output: null
    }
}
