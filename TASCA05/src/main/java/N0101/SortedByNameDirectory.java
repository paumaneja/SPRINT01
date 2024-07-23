package N0101;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class SortedByNameDirectory {

    public static void main(String[] args) {

        String path;

        if (args.length < 1){
            System.out.println("You must enter the path as an argument. ");
            return;
        }

        path = args[0];
        System.out.println("The path to list is: " + path);

        File directory = new File(path);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The directory does not exist or is not valid.");
            return;
        }

        File[] files = directory.listFiles();
        if (files != null){
            Arrays.sort(files, Comparator.comparing(File::getName));
            System.out.println("Directory " + path + " sorted by name.");
            for (File file : files){
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Error");
        }

    }
}
