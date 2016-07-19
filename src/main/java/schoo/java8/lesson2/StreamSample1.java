package schoo.java8.lesson2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample1 {

    public static void main(String[] args) {
        boolean negative = Stream.of(1, 2, 23, -4, 5, -6)
                .anyMatch(n -> n < 0);
    }

    private static void byLoop() {

        int[] array = {1, 2, 23, -4, 5, -6};
        boolean negative = false;
        for(int n : array) {
            if (n < 0) {
                negative = true;
            }
        }
    }
}
