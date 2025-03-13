import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PrintRomanNumber {


    public static String toRoman(int number) {
        TreeMap<Integer, String> map = getTreeMap();
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number - l);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(number + " -> " + "\"" + PrintRomanNumber.toRoman(number) + "\"");
    }

    private static TreeMap<Integer, String> getTreeMap() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        return map;
    }
}
