package SearchMaxMinAvg;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Simple {
    public static void main(String[] args) {
        Integer[] arr = {-4,-2,-1,0,1,2,3,4,5,6,7,8,9,10};

        even(arr);
    }
    @Test
    @DisplayName("Находим четные числа")
    private static void even(Integer[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 ==0){
                sb.append(arr[i] + " ");
            }
        }
        System.out.println(sb);
    }
}
