package algorithm.palindrome;

public class CheckPalindromeTest {

    public static void main(String[] args) {
        testUsingStringBuilderReverse();
        testUsingMyStackClass();
    }

    private static void testUsingStringBuilderReverse() {
        System.out.println("\nTest using StringBuilder");
        System.out.println("Palindrome from TENET: " + CheckPalindrome.check("TENET"));
        System.out.println("Palindrome from SORA: " + CheckPalindrome.check("SORA"));
        System.out.println("Palindrome from TEAM: " + CheckPalindrome.check("TEAM"));
        System.out.println("Palindrome from ADA: " + CheckPalindrome.check("ADA"));
        System.out.println("Palindrome from AIR RIA: " + CheckPalindrome.check("AIR RIA"));
    }

    private static void testUsingMyStackClass() {
        System.out.println("\nTest using my stack class");
        System.out.println("Palindrome from TENET: " + CheckPalindrome.checkUsingStack("TENET"));
        System.out.println("Palindrome from SORA: " + CheckPalindrome.checkUsingStack("SORA"));
        System.out.println("Palindrome from TEAM: " + CheckPalindrome.checkUsingStack("TEAM"));
        System.out.println("Palindrome from ADA: " + CheckPalindrome.checkUsingStack("ADA"));
        System.out.println("Palindrome from AIR RIA: " + CheckPalindrome.checkUsingStack("AIR RIA"));
    }
}
