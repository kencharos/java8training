package schoo.java8.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(-1,0,1,2);

        Stream<Integer> stream1 = list.stream();
        stream1.forEach(System.out::println);

        String[] array = {"A","B","C","D"};

        Stream<String> stream2 = Arrays.stream(array);
        stream2.forEach(System.out::println);


        String join = Arrays.asList("A","B","C","D").stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.joining(",", "(", ")"));
        System.out.println(join); //(a,b,c,d)

        double avg = Arrays.asList(1,5,8,11).stream()
                .collect(Collectors.averagingDouble(s -> (double)s));
        System.out.println(avg); // 6.25

        Arrays.asList("apple","ant","banana","character").stream()
                .collect(Collectors.groupingBy(w -> w.charAt(0)))
                .forEach((c, words) -> System.out.println(c + ":" + words));
        
        Map<String, String> map = Arrays.asList("USD:ドル", "JPN:円").stream()
                .collect(Collectors.toMap(s -> s.substring(0,3), s -> s.substring(4) ));
        System.out.println(map);




    }

}
