package schoo.java8.lesson1;

import java.util.*;

public class LambdaExapmle {

    public static void main(String[] args) {
        byLambda();
        byNotlambda();
    }

    public static void byNotlambda() {

        List<String> list = Arrays.asList("java", "xml", "lambda");

        for (String x : list) {
            System.out.println(x);
        }


        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 4);

        if (map.containsKey("B")) {
            map.put("B", map.get("B") + 1);
        } else {
            map.put("B", 1);
        }

        if (map.containsKey("C")) {
            map.put("C", map.get("C") + 1);
        } else {
            map.put("C", 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    private static void byLambda() {
        List<String> list = Arrays.asList("java", "xml", "lambda");
        // リストの中身を表示
        list.forEach(x -> System.out.println(x));

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 4);

        // キーが存在しない場合 1, 存在する場合 元の値 +1
        map.compute("B", (key, value) -> value == null ? 1 : value + 1);
        map.compute("C", (key, value) -> value == null ? 1 : value + 1);
        // マップの中身を表示
        map.forEach((k,v) -> System.out.println(k + ":" + v));
    }


}
