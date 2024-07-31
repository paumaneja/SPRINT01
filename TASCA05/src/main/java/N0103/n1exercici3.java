package N0103;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class n1exercici3 {

    public static void main(String[] args) {

        String path;
        //path = "TASCA05/src/main/java/N0103/resources";

        if (args.length < 1){
            System.out.println("You must enter the path as an argument. ");
            return;
        }

        path = args[0];

        File directory = new File(path);
        System.out.println("The path to list is: " + directory.getPath());
        System.out.println("The absolut path to list is: " + directory.getAbsolutePath());

        if (!directory.exists()) {
            System.out.println("The directory does not exist or is not valid.");
            return;
        }

        Path pathout = Paths.get("N0103/carpetes.txt");
        try (BufferedWriter bw = Files.newBufferedWriter(pathout)){
            listRecursive(directory, "", bw);
        } catch (Exception e){
            System.out.println("Failed to write to file." + e.getMessage());
        }

    }

    private static void listRecursive(File directory, String tab, BufferedWriter bw) throws IOException {

        File[] dir = directory.listFiles();

        if (dir == null){
            System.out.println("Could not read the contents of the directory.");
        }

        Arrays.sort(dir);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Path pathOut = Paths.get("N0103/carpetes.txt");
            for (File file : dir) {
                String type = file.isDirectory() ? "D" : "F";
                String lastModified = sdf.format(new Date(file.lastModified()));
                String lineToAppend = tab + type + " " + file.getName() + " -> Modified: " + lastModified;
                bw.write(lineToAppend);
                bw.newLine();

                if (file.isDirectory()) {
                    listRecursive(file, tab + "    ", bw);
                }
            }

    }
}
