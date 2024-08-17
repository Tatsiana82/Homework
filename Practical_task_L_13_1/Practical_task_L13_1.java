package Practical_task_L_13_1;
import java.util.*;

    public class Practical_task_L13_1 {
        public static void main(String[] args) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("cat");
            arr.add("dog");
            arr.add("mouse");
            arr.add("rabbit");
            arr.add("bird");
            arr.add("bird");
            arr.add("dog");
            arr.add("horse");
            arr.add("cow");
            arr.add("pig");
            arr.add("kitty");
            arr.add("coke");
            arr.add("hen");
            arr.add("goose");
            arr.add("hen");

            Set<String> uniqueWords = new HashSet<>(arr);
            System.out.println("Unique words: " + uniqueWords);

            Map<String, Integer> wordsCount = new HashMap<>();
            for(String words: arr) {
                if (wordsCount.containsKey(words)) {
                    wordsCount.put(words, wordsCount.get(words) + 1);
                } else {
                    wordsCount.put(words, 1);
                }
            }
            System.out.println("The number of repetitions of each word:");
            for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }
}