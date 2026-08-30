class CalcNumber {

    static <T extends Number> void showNumber(T value) {

        System.out.println(value);
    }
}

public class Problem08_GenericNumberCalculator {

    public static void main(String[] args) {

        CalcNumber.showNumber(78);
        CalcNumber.showNumber(556.7f);
        CalcNumber.showNumber(67.6d);

        // CalcNumber.showNumber("Java");
        // Not allowed because String is not a Number.
    }
}
