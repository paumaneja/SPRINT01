package N0103;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class DirectoryAndFileManager_V2 {

    public static void main(String[] args) {

        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("You must provide both a directory path and an output file path.");
            }

            String directoryPath = args[0];
            String outputPath = args[1];

            File directory = new File(directoryPath);
            if (!directory.exists() || !directory.isDirectory()) {
                throw new IOException("The directory does not exist or is invalid: " + directoryPath);
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                writer.write("Directory " + directoryPath + " sorted by name:\n");
                listDirectory(directory, 0, writer);
                System.out.println("Directory listing saved to: " + outputPath);
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Argument error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }


    public static void listDirectory(File dir, int level, BufferedWriter writer) throws IOException {
        File[] files = dir.listFiles();

        if (files != null) {

            Arrays.sort(files, Comparator.comparing(File::getName));


            for (File file : files) {
                writeFileInfo(file, level, writer);

                if (file.isDirectory()) {
                    listDirectory(file, level + 1, writer);
                }
            }
        }
    }


    public static void writeFileInfo(File file, int level, BufferedWriter writer) throws IOException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String lastModified = sdf.format(new Date(file.lastModified()));

        String indentation = " ".repeat(level * 4);

        String type = file.isDirectory() ? "D" : "F";

        writer.write(indentation + file.getName() + " (" + type + ") - Last Modified: " + lastModified + "\n");
    }
}
