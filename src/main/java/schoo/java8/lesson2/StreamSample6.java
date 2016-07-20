package schoo.java8.lesson2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamSample6 {

    public static void main(String[] args) {

        String sentence = "Java 5 was released at 2004\n" +
                "Java 6 was released at 2006\n" +
                "Java 7 was released at 2011\n" +
                "At 2014, java 8 was released.\n";

        //Arrays.stream(sentence.split("[\\s.,]+"))
        //        .forEach(System.out::println);

        byMap(sentence);
        answer(sentence);

    }

    private static void byMap(String sentence) {

        Map<String, Integer> count = new HashMap<>();
        for(String word : sentence.split("[\\s.,]+")) {
            if (!count.containsKey(word)) {
                count.put(word, 1);
            } else {
                count.put(word, count.get(word) + 1);
            }
        }
        count.forEach((w, c) -> System.out.println(w + ":" + c));

    }

    private static void answer(String sentence) {

        Arrays.stream(sentence.split("[\\s.,]+"))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .forEach((w, c) -> System.out.println(w + ":" + c));
    }

}
