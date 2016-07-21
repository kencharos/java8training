package schoo.java8.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTech1 {

    public static void main(String[] args) throws IOException{

        makeFile();

        try(Stream<String> file = Files.lines(Paths.get("sample.txt"))) {
            file.skip(100).limit(100).forEach(System.out::println);
        }

        byLoop();
    }

    private static void byLoop() throws IOException{

        try(BufferedReader r = Files.newBufferedReader(Paths.get("sample.txt"))) {
            int skip = 0;
            int count = 0;
            String line = null;
            while((line = r.readLine()) != null) {
                if (skip < 100) {
                    skip++;
                    continue;
                }
                System.out.println(line);
                count++;
                if(count >= 100) {
                    break;
                }
            }
        }
    }

    private static void makeFile() {

        try {
            Files.write(Paths.get("sample.txt"),
                    IntStream.rangeClosed(1,1000).boxed().map(i -> "Line." + i)
                            .collect(Collectors.toList()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
