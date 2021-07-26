package StringManipulation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        String str = "aabbccd";

        method(str);
    }
    @Test
    @DisplayName("Считаем сколько раз повторяется буква")
    private static void method(String str) {
        Map<String, Integer> collect = Arrays.stream(str.split(""))
                .collect(Collectors.toMap(s -> s, s -> 1, (a, b) -> a + 1));
        System.out.println(collect.entrySet());

    }
}
