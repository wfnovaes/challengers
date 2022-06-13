package algorithm.reverter;

public abstract class StringReverter {

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static String reverse2(String input) {
        StringBuilder sb = new StringBuilder();
        for ( int index = input.length(); index > 0; index-- ) {
            sb.append(input.charAt(index-1));
        }
        return sb.toString();
    }

    public static String reverse3(String input) {
        StringBuilder sb = new StringBuilder();
        String[] split = input.split("");
        for(String leller: split) {
            sb.insert(0, leller);
        }
        return sb.toString();
    }
}
