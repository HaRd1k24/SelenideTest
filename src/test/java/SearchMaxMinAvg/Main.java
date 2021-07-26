package SearchMaxMinAvg;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 10, 11, 35, 31, 17, 5, 3};

        search(arr);
        searchStream(arr);

    }

    @Test
    @DisplayName("Находим максимальное,минимальное,среднее число")
    private static void searchStream(int[] arr) {
        System.out.println("Min: " + Arrays.stream(arr).min());
        System.out.println("Max: " + Arrays.stream(arr).max());
        System.out.println("Averge: " + Arrays.stream(arr).average());
    }

    @Test
    @DisplayName("Находим максимальное,минимальное,среднее число")
    private static void search(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int avg = 0;
        for (int i = 1; i < arr.length; i++) {
            avg += arr[i];
            if (arr[i] < arr[i - 1]) {
                min = arr[i];
            } else if (arr[i] > arr[i - 1]) {
                max = arr[i];

            }
        }

        System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg / arr.length);

    }

}

