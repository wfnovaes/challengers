package algorithm.palindrome;

public abstract class CheckPalindrome {

    public static boolean check(String word) {
        return new StringBuilder(word).reverse().toString().equals(word);
    }
}
