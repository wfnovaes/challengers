package algorithm.century;

public class CenturyFromYearTest {

    public static void main(String[] args) {
        System.out.println("Century from 1905: " + CenturyFromYear.calculate(1905));
        System.out.println("Century from 1700: " + CenturyFromYear.calculate(1700));
        System.out.println("Century from 1988: " + CenturyFromYear.calculate(1988));
        System.out.println("Century from 2001: " + CenturyFromYear.calculate(2001));
        System.out.println("Century from 1: " + CenturyFromYear.calculate(1));
    }
}
