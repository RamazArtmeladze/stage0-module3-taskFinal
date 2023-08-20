package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversedNumber = (number % 10) * 100 + ((number / 10) % 10) * 10 + number / 100;
        System.out.println(reversedNumber);
    }

    public static void main(String[] args) {
        NumberReverter reverter = new NumberReverter();
        reverter.revert(489); // Output will be 984
    }
}
