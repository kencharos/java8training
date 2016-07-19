package schoo.java8.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSample4 {

    public static void main(String[] args) throws IOException{

        Arrays.asList(1,2,3,4,5).stream()
                .collect(Collectors.reducing((a,b) -> a * b))
                .ifPresent(System.out::println);

        byLoop();

    }

    private static void byLoop() throws IOException{

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int product = 1;
        for (Integer x : list) {
            product = product * x;
        }
        System.out.println(product);

    }

}
