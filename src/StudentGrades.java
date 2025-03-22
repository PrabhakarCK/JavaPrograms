import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("Sam", new ArrayList<>(Arrays.asList(85, 92, 88)));
        map.put("Cam", new ArrayList<>(Arrays.asList(60, 70, 80)));

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            int totalGrade = 0;
            List<Integer> list = entry.getValue();
            for (Integer i : list) {
                totalGrade += i;
            }
            System.out.println("The Grades of Student Name : " + entry.getKey() + " are " + (double) totalGrade / list.size());
        }

    }
}

