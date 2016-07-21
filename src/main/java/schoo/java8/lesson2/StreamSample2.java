package schoo.java8.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample2 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList("1","ABC","-2","090").stream()
                .filter(s -> s.matches("[+-]?[0-9]+"))
                .map(s -> Integer.parseInt(s))
                .filter(s -> s > 0)
                .collect(Collectors.toList());

        System.out.println(nums); // 1,90

        byLoop();
    }

    private static void byLoop() {

        List<String> strings = Arrays.asList("1","ABC","-2","090");
        List<Integer> nums = new ArrayList<>();
        for(String s : strings) {
            if (s.matches("[+-]?[0-9]+")) {
                Integer x = Integer.parseInt(s);
                if (x > 0) {
                    nums.add(x);
                }
            }
        }

        System.out.println(nums);
    }
}
