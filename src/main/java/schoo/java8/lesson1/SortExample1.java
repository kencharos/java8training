package schoo.java8.lesson1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample1 {

    static public class MyComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            // 文字列の辞書順のソート
            // 戻り値の 負、0、正 が a < b, a == b, a > b に対応する。
            return a.compareTo(b);
        }
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "xml", "lambda");
        Collections.sort(list, new MyComparator());

        System.out.println(list); // java, lambda, xml
    }


}
