package schoo.java8.lesson1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {


		List<String> list = Arrays.asList("qqq", "abbc", "wxs");

		Collections.sort(list, (o1, o2) -> o1.length() - o2.length());

		String s = list.stream().collect(Collectors.reducing("", (a,b) -> a + b));

		System.out.println(list + s);

		Function<Integer, Integer> p1 =
				(Integer x) -> {return x + 1;}
				;
		BiFunction<Integer, Integer, Integer> add =
				(a, b) -> a + b
				;


	}

	public static class LengthCompare implements Comparator<String> {
		public int compare(String o1, String o2) {
			return o1.length() - o2.length();
		}
	}

}
