package algorithm.adjacentproduct;

public class AdjacentElementsProductTest {

    public static void main(String[] args) {
        System.out.println("Adjacent element product from 1,2,3,4: " + AdjacentElementsProduct.check(new int[]{1,2,3,4}));
        System.out.println("Adjacent element product from 3, 6, -2, -5, 7, 3: " + AdjacentElementsProduct.check(new int[]{3, 6, -2, -5, 7, 3}));
        System.out.println("Adjacent element product from 5, 1, 2, 3, 1, 4: " + AdjacentElementsProduct.check(new int[]{5, 1, 2, 3, 1, 4}));
        System.out.println("Adjacent element product from 4, 1, 2, 3, 1, 5: " + AdjacentElementsProduct.check(new int[]{4, 1, 2, 3, 1, 5}));
        System.out.println("Adjacent element product from 1, 0, 1, 0, 1000: " + AdjacentElementsProduct.check(new int[]{1, 0, 1, 0, 1000}));
    }
}
