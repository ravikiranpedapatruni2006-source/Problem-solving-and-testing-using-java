public class CalculatorUnitTesting {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Addition
        int addition = a + b;

        if (addition == 30) {
            System.out.println("Addition Test Passed.");
        } else {
            System.out.println("Addition Test Failed.");
        }

        // Division
        int x = 10;
        int y = 2;
        int division = x / y;

        if (division == 5) {
            System.out.println("Division Test Passed.");
        } else {
            System.out.println("Division Test Failed.");
        }
    }
}