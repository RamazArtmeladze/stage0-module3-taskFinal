package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        boolean isPositive = (number > 0) && true;
        System.out.println(isPositive);
    }

    public static void main(String[] args) {
        NumbersPrinter printer = new NumbersPrinter();
        printer.printIsPositive(5); // Output will be "true"
        printer.printIsPositive(-3); // Output will be "false"
        printer.printIsPositive(0); // Output will be "false"
    }
}
