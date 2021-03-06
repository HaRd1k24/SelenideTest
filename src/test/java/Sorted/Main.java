package Sorted;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        int count = 20;

        searchMaxApproximate(17, 22, count);
    }

    @Test
    @DisplayName("Находим приближенное число")
    private static void searchMaxApproximate(int a, int b, int count) {
        if (Math.abs(a - count) < Math.abs(b - count)) {
            System.out.println(a);
        } else if (Math.abs(a - count) == Math.abs(b - count)) {
            System.out.println(a + "  " + b);
        } else {
            System.out.println(b);
        }
    }

    // Сделать с массивом целых чисел. Если число 15, дано 14 и 16 , то пусть выдаст их же
}

