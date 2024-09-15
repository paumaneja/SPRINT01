package N0107;

import java.util.ArrayList;
import java.util.List;

public class n1exercici7 {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add("Pau");
        list.add(22);
        list.add("Maneja");
        list.add("Barcelona");
        list.add(11);
        list.add("Ordinador");

        List<String> sortedStrings = list.stream()
                .filter(element -> element instanceof String)
                .map(element -> (String) element)
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .toList();

        System.out.println("Sorted Strings by length: " + sortedStrings);

    }
}
