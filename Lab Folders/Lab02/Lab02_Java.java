//Lab02 Java file
// Sample Java file
// Edit by instructor (khanAston)
// test line cspaces

public class Lab02 {

    // function equivalent to Haskell inc
    public static int inc(int x) {
        return x + 1;
    }

    // function that prints 1 + 1 = 2
    public static void onePlusOne() {
        System.out.println("1 + 1 = 2");
    }

    public static void main(String[] args) {

        // call increment function
        int result = inc(5);
        System.out.println("inc(5) = " + result);

        // call printing function
        onePlusOne();
    }
}
