package N0105;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class DirectoryAndFileManager_V4 {

    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("You must provide a directory path and an output file path.");
            }

            String directoryPath = args[0];
            String outputPath = args[1];
            String readFilePath = args.length > 2 ? args[2] : null;
            String serializedFilePath = args.length > 3 ? args[3] : null;

            File directory = new File(directoryPath);
            if (!directory.exists() || !directory.isDirectory()) {
                throw new IOException("The directory does not exist or is invalid: " + directoryPath);
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                writer.write("Directory " + directoryPath + " sorted by name:\n");
                listDirectory(directory, 0, writer);
                System.out.println("Directory listing saved to: " + outputPath);
            }

            if (readFilePath != null) {
                System.out.println("\nReading from file: " + readFilePath);
                displayFileContents(readFilePath);
            }

            if (serializedFilePath != null) {
                serializeFileInfo(directory, serializedFilePath);
                System.out.println("\nSerialized file info saved to: " + serializedFilePath);
                deserializeFileInfo(serializedFilePath);
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

    public static void displayFileContents(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void serializeFileInfo(File dir, String filePath) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            serializeDirectory(dir, oos);
        }
    }

    private static void serializeDirectory(File dir, ObjectOutputStream oos) throws IOException {
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                FileInfo fileInfo = new FileInfo(file.getName(), file.isDirectory(), new Date(file.lastModified()));
                oos.writeObject(fileInfo);

                if (file.isDirectory()) {
                    serializeDirectory(file, oos);
                }
            }
        }
    }

    public static void deserializeFileInfo(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Object obj;
            while ((obj = ois.readObject()) != null) {
                if (obj instanceof FileInfo) {
                    System.out.println(obj);
                }
            }
        }
    }
}