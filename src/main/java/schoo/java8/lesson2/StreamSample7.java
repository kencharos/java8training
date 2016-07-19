package schoo.java8.lesson2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSample7 {

    public static void main(String[] args) throws IOException {

        ng();
        ok();
    }

    private static void ok() {

        Arrays.asList(1,2,3,4,5,6).stream()
                .filter(i -> i % 2 == 0)
                .forEach(i ->System.out.println(i));


        List<Integer> list = Arrays.asList(1,2,3,4,5,6).stream()
                .parallel()
                .map(x -> x + 1)
                .collect(Collectors.toList());
        System.out.println(list);

    }

    private static void ng() {

        // NG。filterとforEachを使うべき
        Arrays.asList(1,2,3,4,5,6).stream()
                .forEach(i -> {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                });

        // NG. foreachではなく、collectを使う
        List<Integer> list = new ArrayList<>();
        Arrays.asList(1,2,3,4,5,6).stream()
                .parallel()
                .map(x -> x + 1)
                .forEach(x -> list.add(x));
        System.out.println(list);
    }

}
