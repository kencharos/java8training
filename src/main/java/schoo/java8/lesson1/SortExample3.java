package schoo.java8.lesson1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample3 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "xml", "lambda");
        Collections.sort(list,
                (String a, String b) -> {return a.compareTo(b);});
                // (String a, String b) -> a.compareTo(b)
                // (a, b) -> a.compareTo(b)
        System.out.println(list); // xml, lambda, java

        Comparator<String> lambda = (String a, String b) -> a.compareTo(b);
    }


}
