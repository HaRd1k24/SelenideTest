package StringManipulation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        String str = "вфыт";
        isMethodReverse(str);
    }

    @Test
    @DisplayName("Проверка палиндрома")
    private static void isMethodReverse(String str) {
        if(str.equals(new StringBuilder(str).reverse().toString())){
            System.out.println("Yes");
        }else {
            System.out.println("Not");
        }
    }
}
