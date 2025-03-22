import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapStreamExample {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("Apple", 100);
        products.put("Banana", 50);
        products.put("Orange", 150);
        products.put("Grapes", 200);
        products.put("Watermelon", 120);
        List<String> list = products.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue() > 100)
                .map(Map.Entry::getKey).toList();
        System.out.println(list);
    }
}
