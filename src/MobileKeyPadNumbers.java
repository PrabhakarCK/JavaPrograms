import java.util.*;

public class MobileKeyPadNumbers {
    public static void main(String[] args) {

        Map<Integer, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> list1 = new ArrayList<>(Arrays.asList("D", "E", "F"));
        List<String> list2 = new ArrayList<>(Arrays.asList("G", "H", "I"));
        map.put(2, list);
        map.put(3, list1);
        map.put(4, list2);
        List<Integer> input = new ArrayList<>(Arrays.asList(2,3));

        getCombination(input, map);

    }

    static void getCombination(List<Integer> input, Map<Integer, List<String>> map) {

        if (input.size() == 1) {
            if (map.containsKey(input.get(0))) {
                List<String> list = map.get(input.get(0));
                System.out.println(list);
            }
        } else {
            Map<Integer, List<String>> localMap = new HashMap<>();
            for (Integer digit : input) {
                if (map.containsKey(digit))
                    localMap.put(digit, map.get(digit));
            }
            // Get the keys (digits) from the localMap
            List<Integer> digits = new ArrayList<>(localMap.keySet());

            // We need to generate combinations of all the values associated with the digits
            List<List<String>> lists = new ArrayList<>();

            // Add each list of strings from the localMap into the lists
            for (Integer digit : digits) {
                lists.add(localMap.get(digit));
            }
            List<String> result = new ArrayList<>();
            // Generate combinations using a simple nested loop approach
            // We use the product of all lists to generate all combinations
            for (int i = 0; i < lists.get(0).size(); i++) {
                for (int j = 0; j < lists.get(1).size(); j++) {
                    String combination = lists.get(0).get(i) + lists.get(1).get(j);
                    result.add(combination);
                }
            }
            System.out.println(result);

        }
    }
}
