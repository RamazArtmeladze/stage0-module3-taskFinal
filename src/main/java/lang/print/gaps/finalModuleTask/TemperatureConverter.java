package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
        int fahrenheitInteger = (temperatureCelsius * 9) / 5 + 32;
        int fahrenheitDecimal = ((temperatureCelsius * 9) % 5) * 10 / 5;

        System.out.print(fahrenheitInteger);
        System.out.print('.');
        System.out.print(fahrenheitDecimal);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.toFahrenheit(1); // Output will be "33.8"
    }
}

