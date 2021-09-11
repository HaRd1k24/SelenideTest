import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        double[] numbers = {0.0,32.0, 35.0, 36, 36.3, 36.7, 37.2,  38.2};
        System.out.println(medianTest(numbers));
    }

    private static double medianTest(double[] numbers) {
        Arrays.sort(numbers);
        int middle = numbers.length / 2;
        if(numbers.length % 2 == 1)
            return numbers[middle];
        else
            return (numbers[middle - 1] + numbers[middle]) / 2;
    }
}
