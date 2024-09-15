package N0108;

public class n1exercici8 {

    public static void main(String[] args) {

        StringReverser reverser = (str) -> new StringBuilder(str).reverse().toString();

        String original = "This sentence will come out backwards";
        String reversed = reverser.reverse(original);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);

        if (reversed.contentEquals(new StringBuilder(original).reverse())) {
            System.out.println("The string was reversed correctly.");
        } else {
            System.out.println("The string was not reversed correctly.");
        }
    }
}
