package AnnotaciiOverloadRide;

public class TestOver {
    public int addCalculator(int a, int b){
        if(a == 0 || b == 0){
            throw new ArithmeticException("Делить на нуль нельзя");
        }
        return a / b;
    }

    public double addCalculator(double a, double b){
        if(a == 0 || b == 0){
            throw new ArithmeticException("Делить на нуль нельзя");
        }
        return a / b;
    }

    public static void main(String[] args) {
        TestOver main = new TestOver();
        System.out.println(main.addCalculator(1, 0));
        System.out.println(main.addCalculator(2.4, 1.5));

    }
}
