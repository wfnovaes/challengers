package datastructure.vector;

public class MyListTest {

    public static void main(String[] args) {
        testContains();
        testLastIndexOf();
    }

    private static void testContains() {
        System.out.println("\ntest contains: ");
        MyList<String> list = new MyList<>(5);

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);
        System.out.println("Contain A: " + list.contain("A"));
        System.out.println("Contain B: " + list.contain("B"));
        System.out.println("Contain E: " + list.contain("E"));
    }

    private static void testLastIndexOf() {
        System.out.println("\ntest last index of: "); 

        MyList<String> list = new MyList<>(5);
        list.add("A");
        list.add("B");
        list.add("A");

        System.out.println(list);
        System.out.println("Last index of A: " + list.lastIndexOf("A"));
        System.out.println("Last index of C: " + list.lastIndexOf("C"));

    }

}
