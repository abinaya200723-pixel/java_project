package day14;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class problem3 {
    public static void main(String[] args) {

        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        Map<String, Long> count = Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(count);
    }
}