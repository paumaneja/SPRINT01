package N0101;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class SortedByNameDirectory {

    public static void main(String[] args) {

        try {
            String path;

            if (args.length == 0 || args[0].trim().isEmpty()) {
                throw new IllegalArgumentException("You must provide a valid argument.");
            }

            path = args[0];
            System.out.println("The path to list is: " + path);

            File directory = new File(path);

            if (!directory.exists() || !directory.isDirectory()) {
                throw new IOException("The directory does not exist or is invalid: " + path);
            }

            File[] files = directory.listFiles();

            if (files != null) {
                Arrays.sort(files, Comparator.comparing(File::getName));
                System.out.println("Directory " + path + " sorted by name:");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                throw new IOException("Error listing files in directory.");
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Argument error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}
