package schoo.java8.lesson2;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTech2 {

    public static void main(String[] args) throws IOException {

        List<Integer> list = IntStream.range(1,1000)
                .boxed()
                .parallel()
                .peek(i -> System.out.println("Processe " + i + "in " + Thread.currentThread().getName()))
                .map(i -> i + 1)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
