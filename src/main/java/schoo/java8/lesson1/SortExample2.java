package schoo.java8.lesson1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "xml", "lambda");
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String a, String b) {
                // 逆順でソート
                return b.compareTo(a);
            }
        });

        System.out.println(list); // xml, lambda, java
    }


}
