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
                .collect(Collectors.toList());

        System.out.println(nums);

        byLoop();
    }

    private static void byLoop() {

        List<Integer> nums = new ArrayList<>();
        for(String s : Arrays.asList("1","ABC","-2","090")) {
            if (s.matches("[+-]?[0-9]+")) {
                nums.add(Integer.parseInt(s));
            }
        }

        System.out.println(nums);
    }
}
