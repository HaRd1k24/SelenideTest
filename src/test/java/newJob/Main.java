package newJob;

public class Main {
    public static void main(String[] args) {
        System.out.println(random());
        String random = random();
        System.out.println(newRandom(random));
    }

    private static String random() {
        String str = String.valueOf((Math.random() * 299)-1 );
        return str;
    }

    private static String newRandom(String random){
        double b = Double.parseDouble(random);
        double c = 5;
        double result = b - c;
        String s = String.valueOf(result);
        return s;
    }


}
