package Sorted;

public class Main {
    public static void main(String[] args) {
        int count = 14;
        int[] array = {11, 12, 13, 17, 19, 23, 27, 29};


        //   searchMaxApproximate(17, 22, count);
        searchMaxApproximate(array, count);

    }

 /*   @Test
    @DisplayName("Находим приближенное число")
    private static void searchMaxApproximate(int a, int b, int count) {
        if (Math.abs(a - count) < Math.abs(b - count)) {
     //       System.out.println(a);
        } else if (Math.abs(a - count) == Math.abs(b - count)) {
    //        System.out.println(a + "  " + b);
        } else {
     //       System.out.println(b);
        }


    }*/

    private static void searchMaxApproximate(int[] array, int count) {
        int min = array[0];
        int max = array[1];
        for (int i = 1; i < array.length; i++) {
            min = array[i];
            max = array[i - 1];
            if (Math.abs(min - count) < Math.abs(max - count)) {
                System.out.println(min);
            } else if (Math.abs(min - count) == Math.abs(max - count)) {
                System.out.println(min + " Равны  " + max);
            } else {
                System.out.println(max);
            }
        }

    }

}

// Сделать с массивом целых чисел. Если число 15, дано 14 и 16 , то пусть выдаст их же


