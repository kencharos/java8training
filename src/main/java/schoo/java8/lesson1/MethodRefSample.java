package schoo.java8.lesson1;

import java.util.*;
import java.util.function.Supplier;

public class MethodRefSample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "xml", "lambda");

        list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println);

        Supplier<List<String>> s = () -> new ArrayList<>();
        Supplier<List<String>> s2 = ArrayList::new;


    }
}