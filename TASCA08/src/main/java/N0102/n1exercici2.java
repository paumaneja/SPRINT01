package N0102;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class n1exercici2 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ball");
        strings.add("keyboard");
        strings.add("microphone");
        strings.add("mouse");
        strings.add("glass");
        strings.add("monitor");
        strings.add("god");

        List<String> result = filterStringsWithO(strings);

        System.out.println("Strings with letter 'o': " + result);

    }

    public static List<String> filterStringsWithO(List<String> strings) {
        return strings.stream()
                .filter(string -> string.contains("o") && string.length() > 5)
                .collect(Collectors.toList());
    }
}
