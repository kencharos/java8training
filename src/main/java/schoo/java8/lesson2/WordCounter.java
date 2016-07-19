package schoo.java8.lesson2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordCounter {

    public static void main(String[] args) {

        String sentence = "Java 5 was released at 2004\n" +
                "Java 6 was released at 2006\n" +
                "Java 7 was released at 2011\n" +
                "At 2014, java 8 was released.\n";

        Arrays.stream(sentence.split("[\\s.,]"))
                .forEach(System.out::println);

    }







    private static void answer(String sentence) {

        Arrays.stream(sentence.split("[\\s.,]"))
                .filter(w -> w.length() >= 2)
                .map(w -> w.toLowerCase())
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .forEach((w, c) -> System.out.println(w + ":" + c));
    }

}
