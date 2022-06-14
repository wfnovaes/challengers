package algorithm.century;

public abstract class  CenturyFromYear {

    public static int calculate(int year) {
        return 1 + (year - 1) / 100;
    }
}
