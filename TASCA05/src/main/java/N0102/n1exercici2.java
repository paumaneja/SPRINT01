package N0102;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class n1exercici2 {

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

        listRecursive(directory, "");

    }

    private static void listRecursive(File directory, String tab){

        File[] dir = directory.listFiles();

        if (dir == null){
            System.out.println("Could not read the contents of the directory.");
        }

        Arrays.sort(dir);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (File file : dir){
            String type = file.isDirectory() ? "D" : "F";
            String lastModified = sdf.format(new Date(file.lastModified()));
            System.out.println(tab + type + " " + file.getName() + " -> Modified: " + lastModified);

            if (file.isDirectory()){
                listRecursive(file, tab + "    ");
            }
        }
    }

}
