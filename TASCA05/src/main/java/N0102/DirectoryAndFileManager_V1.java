package N0102;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class DirectoryAndFileManager_V1 {

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

            listDirectory(directory, 0);

        } catch (IllegalArgumentException e) {
            System.err.println("Argument error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }


    public static void listDirectory(File dir, int level) {
        File[] files = dir.listFiles();

        if (files != null) {

            Arrays.sort(files, Comparator.comparing(File::getName));

            for (File file : files) {
                printFileInfo(file, level);

                if (file.isDirectory()) {
                    listDirectory(file, level + 1);
                }
            }
        }
    }


    public static void printFileInfo(File file, int level) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String lastModified = sdf.format(new Date(file.lastModified()));

        String indentation = " ".repeat(level * 4);

        String type = file.isDirectory() ? "D" : "F";

        System.out.println(indentation + file.getName() + " (" + type + ") - Last Modified: " + lastModified);
    }

}
