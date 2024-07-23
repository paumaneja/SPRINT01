package N0101;

import java.io.File;
import java.util.Arrays;

public class SortedByNameDirectory {

    public static void main(String[] args) {

        String path;

        if (args.length > 0){
            path = args[0];
            System.out.println("The path to list is: " + path);

            File directory = new File(path);

            if (directory.exists() && directory.isDirectory()){
                String[] files = directory.list();
                Arrays.sort(files);
                for (String s : files){
                    System.out.println(s);
                }
            } else{
                System.out.println("The directory does not exist or is not valid.");
            }
        } else {
            System.out.println("You must enter the path (args) ");
        }










    }
}
