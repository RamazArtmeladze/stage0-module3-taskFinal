package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
        double temperatureFahrenheit = (temperatureCelsius * 9.0 / 5.0) + 32.0;
        System.out.println("Temperature in Fahrenheit: " + temperatureFahrenheit);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.toFahrenheit(25); // Output will be temperature in Fahrenheit
    }
}
