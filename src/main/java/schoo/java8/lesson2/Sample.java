package schoo.java8.lesson2;

import java.util.Arrays;
import java.util.List;

public class Sample {

    public static void main(String[] args) {
        Arrays.asList(-1,0,1,2).stream()
                .filter(x -> x > 0)
                .map(x -> x * 2)
                .forEach(System.out::println);
    }

    private static void byLoop() {



        List<Integer> list = Arrays.asList(-1,0,1,2);
        for(Integer x : list) {
            Integer y = x * x;
            if (y > 0) {
                System.out.println(y);
            }
        }

    }
}
