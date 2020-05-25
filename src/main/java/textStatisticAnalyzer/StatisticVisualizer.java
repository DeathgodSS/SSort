package textStatisticAnalyzer;

import java.util.Map;

public class StatisticVisualizer {

    public String groupResult(Map<String, Integer> treeMap) {
        StringBuilder result = new StringBuilder();
        char previousLetter = ' ';
        char letter = ' ';
        for (Map.Entry<String, Integer> e : treeMap.entrySet()) {
            letter = e.getKey().toUpperCase().toCharArray()[0];
            if (letter == previousLetter) {
                result.append("\t" + e.getKey() + " " + e.getValue() + "\n");

            } else {
                result.append(e.getKey().toUpperCase().toCharArray()[0] +
                        ": " + " " + e.getKey() + " " + e.getValue() + "\n");
            }
            previousLetter = e.getKey().toUpperCase().toCharArray()[0];
        }
        return result.toString();
    }
}
