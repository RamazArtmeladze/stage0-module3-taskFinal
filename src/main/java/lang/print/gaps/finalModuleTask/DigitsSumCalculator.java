package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousands = number / 1000;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int units = number % 10;

        int sum = thousands + hundreds + tens + units;
        System.out.println(  sum);
    }

    public static void main(String[] args) {
        DigitsSumCalculator calculator = new DigitsSumCalculator();
        calculator.calculateSum(1111); // Output will be "Sum of digits: 4"
        calculator.calculateSum(4567); // Output will be "Sum of digits: 22"
    }
}


