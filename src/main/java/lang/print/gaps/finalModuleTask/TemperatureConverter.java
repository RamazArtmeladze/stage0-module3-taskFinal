package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
        int temperatureFahrenheit = (temperatureCelsius * 9 / 5) + 32;
        System.out.println(temperatureFahrenheit);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.toFahrenheit(0); // Output will be "32"
    }
}

