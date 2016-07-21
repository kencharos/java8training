package schoo.java8.lesson2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample1 {

    public static void main(String[] args) {
        boolean anyNegative = Stream.of(1, 2, 23, -4, 5, -6)
                .anyMatch(n -> n < 0);
        System.out.println(anyNegative); // true
        boolean allNegative = Stream.of(1, 2, 23, -4, 5, -6)
                .allMatch(n -> n < 0);
        System.out.println(allNegative); // false

        byLoop();
    }

    private static void byLoop() {

        int[] array = {1, 2, 23, -4, 5, -6};
        boolean anyNegative = false;
        for(int n : array) {
            if (n < 0) {
                anyNegative = true;
            }
        }
        System.out.println(anyNegative); // true

        boolean allNegative = true;
        for(int n : array) {
            if (n < 0) {
                allNegative = false;
            }
        }
        System.out.println(allNegative); // false


    }
}
