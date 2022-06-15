package algorithm.convertbasetobinary;


public class ConvertNumberToBaseTest {

    public static void main(String[] args) {
        System.out.println("Convert 2 to Base 2: " + ConvertNumberToBase.convert(2, 2));
        System.out.println("Convert 25 to Base 2: " + ConvertNumberToBase.convert(2, 25));
        System.out.println("Convert 25 to Base 16: " + ConvertNumberToBase.convert(16, 25));
        System.out.println("Convert 10035 to Base 16: " + ConvertNumberToBase.convert(16, 10035));
        System.out.println("Convert 10035 to Base 8: " + ConvertNumberToBase.convert(8, 10035));
    }
}
