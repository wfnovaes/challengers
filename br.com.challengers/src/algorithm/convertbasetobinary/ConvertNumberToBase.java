package algorithm.convertbasetobinary;

public abstract class ConvertNumberToBase {

    public static String convert(int base, int number) {
        if (base > 16) throw new IllegalArgumentException("Max base is 16");
        return internalConverter(base, number).reverse().toString();
    }

    private static StringBuilder internalConverter(int base, int number) {
        String BASE_VALUES = "0123456789ABCDEF";
        StringBuilder stringBuilder = new StringBuilder();
        if (number == 0) return stringBuilder;
        else {
            stringBuilder.append(BASE_VALUES.charAt(number % base));
            return stringBuilder.append(internalConverter(base, number / base));
        }
    }
}
