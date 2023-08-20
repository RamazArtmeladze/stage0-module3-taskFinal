package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
        double temperatureFahrenheit = (temperatureCelsius * 9.0 / 5.0) + 32.0;
        int roundedFahrenheit = (int) Math.floor(temperatureFahrenheit);

        int decimalPart = (int) ((temperatureFahrenheit - roundedFahrenheit) * 10);

        System.out.print("Temperature in Fahrenheit: ");
        printInteger(roundedFahrenheit);
        System.out.print('.');
        printInteger(decimalPart);
    }

    private void printInteger(int value) {
        if (value == 0) {
            System.out.print('0');
            return;
        }

        int digits = (int) Math.floor(Math.log10(value)) + 1;
        int[] digitsArray = new int[digits];
        for (int i = digits - 1; i >= 0; i--) {
            digitsArray[i] = value % 10;
            value /= 10;
        }

        for (int digit : digitsArray) {
            char digitChar = (char) (digit + '0');
            System.out.print(digitChar);
        }
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.toFahrenheit(25); // Output will be temperature in Fahrenheit
    }
}

