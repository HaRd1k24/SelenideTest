package Sorted;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Reapet {
    public static void main(String[] args) {
        int[] arr = {2, 15, 3, 7, 11, 36, 17, 58, 39, 10};

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
        }

        bubbleSort(arr);
        insertionSort(arr);
        selectionSort(arr);
    }
    @Test
    @DisplayName("Пузырьковая сортировка")
    private static void bubbleSort(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
        System.out.println();
    }

    @Test
    @DisplayName("Сортировка вставками")
    private static void insertionSort(int[] array) {
        int current = 0;
        for (int i = 0; i < array.length; i++) {
            current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j +1] = current;

            System.out.print(current + ",");
        }
        System.out.println();

    }

    @Test
    @DisplayName("Сортировка выбором")
    public static void selectionSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            temp = array[i];
            array[i] = min;
            array[minId] = temp;
            System.out.print(temp + ",");
        }
    }

}
