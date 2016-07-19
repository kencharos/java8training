package schoo.java8.lesson2;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamSample5 {

    public static void main(String[] args) throws IOException{

        Arrays.asList("apple","again","banana","cat").stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)))
                .forEach((k,v) -> System.out.println(k +":" + v));

        byLoop();

    }

    private static void byLoop() throws IOException{

        Map<Character, List<String>> group = new HashMap<>();
        List<String> src = Arrays.asList("apple","again","banana","cat");
        for (String word : src) {
            char c = word.charAt(0);
            if (!group.containsKey(c)) {
                group.put(c, new ArrayList<>());
            }
            group.get(c).add(word);
        }
        group.forEach((k,v) -> System.out.println(k +":" + v));

    }

}
