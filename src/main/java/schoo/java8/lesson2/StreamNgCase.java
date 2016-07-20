package schoo.java8.lesson2;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamNgCase {

    public static void main(String[] args) throws IOException {

        ng();
        //ok();
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

        // NG. 最初の1件が並列化するとわからない。
        OptionalInt res =  IntStream.range(1, 2000)
                .parallel()
                .peek(n -> System.out.println(n))
                .filter(n -> n % 4 == 0)
                .findFirst();

        System.out.println("Answer=" + res.getAsInt());
    }

}
