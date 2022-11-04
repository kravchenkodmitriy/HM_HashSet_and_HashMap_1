import java.util.HashMap;
import java.util.Map;


public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isLetter(letter)) {
                if (!map.containsKey(letter)) {
                    map.put(letter, 1);

                } else {
                    int value = map.get(letter);
                    map.put(letter, value + 1);
                }
            }
        }

        Map.Entry<Character, Integer> minValue = null;
        for (Map.Entry<Character, Integer> min : map.entrySet()) {
            if (minValue == null || min.getValue().compareTo(minValue.getValue()) < 0) {
                minValue = min;

            }
        }
        System.out.println("Минимальнo встречающийся символ " + minValue.getKey() + " - " + minValue.getValue() + "\n");

        Map.Entry<Character, Integer> maxValue = null;
        for (Map.Entry<Character, Integer> max : map.entrySet()) {
            if (maxValue == null || max.getValue().compareTo(maxValue.getValue()) > 0) {
                maxValue = max;
            }
        }
        System.out.println("Максимальный встречающийся символ " + maxValue.getKey() + " - " + maxValue.getValue() + "\n");
    }
}


