package schoo.java8.lesson1;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Calc {

    public static void main(String[] args) {
        System.out.println(calc(3, 4, (a,b) -> a + b));
        System.out.println(calc(3, 4, (a,b) -> a * b));
        System.out.println(calc(3, 4, (a,b) -> a > b ? a : b));
        System.out.println(calc(3, 4, Math::max));


    }

    public static Integer calc(Integer a, Integer b, BiFunction<Integer,Integer,Integer> func) {
                                                    //BinaryOperator<Integer>
        return func.apply(a,b);
    }
}
