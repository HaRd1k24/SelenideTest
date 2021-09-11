package Factorial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
      calculatorFactorial(1111);
    }
    @Test
    @DisplayName("Находим факториал числа")
    private static void calculatorFactorial(int n) {
        if(n == 0){
            System.out.println("Такого факториала не существует");
        }else {
            BigInteger y = new BigInteger(String.valueOf(1));
            for (int i = 1; i <= n; i++){
              y = y.multiply(BigInteger.valueOf(i));
            }
            System.out.println(y);
        }
    }
}
