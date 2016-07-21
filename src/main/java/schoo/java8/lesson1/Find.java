package schoo.java8.lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Find {

    public static boolean find(List<String> list, Predicate<String> condition) {
        for(String x : list) {
            if (condition.test(x)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Lambda", "Method");

        boolean res = find(list, x -> x.equals("Java"));  // true
        System.out.println(res);

        res = find(list, x -> x.length() < 4);  // false
        System.out.println(res);

        res = find(list, x -> x.startsWith("M")); // true
        System.out.println(res);



    }

}
