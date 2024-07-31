package N0105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class n1exercici5 {

    public static void main(String[] args) {

        boolean out = false;

        do{
            switch(menu()){
                case 1: showFile(args);
                    break;
                case 2: readFile(args);
                    break;
                case 3: serAndDeser();
                    break;
                case 0: System.out.println("Thank you. Bye Bye");
                    out = true;
                    break;
            }
        }while(!out);
    }

    public static byte menu(){
        Scanner sc = new Scanner(System.in);
        byte option;
        final byte MIN = 0;
        final byte MAX = 3;

        do{
            System.out.println("\nMENU");
            System.out.println("1. Write the contents of a directory to a txt.");
            System.out.println("2. Read any txt and display its content on the console.");
            System.out.println("3. Serialize and deserialize an object.");
            System.out.println("0. Scape out.\n");
            option = sc.nextByte();
            if(option < MIN || option > MAX){
                System.out.println("Choose a correct option");
            }
        }while(option < MIN || option > MAX);
        return option;
    }


    private static void showFile(String[] args){
        String path;

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

        Path pathout = Paths.get("N0104/carpetes.txt");
        try (BufferedWriter bw = Files.newBufferedWriter(pathout)){
            listRecursive(directory, "", bw);
        } catch (Exception e){
            System.out.println("No se ha podido escribir en el archivo." + e.getMessage());
        }

    }

    private static void listRecursive(File directory, String tab, BufferedWriter bw) throws IOException {

        File[] dir = directory.listFiles();

        if (dir == null){
            System.out.println("No se pudo leer el contenido del directorio.");
        }

        Arrays.sort(dir);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Path pathOut = Paths.get("N0104/carpetes.txt");
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

    private static void readFile(String[] args){

        if (args.length < 2){
            System.out.println("You must enter the path of the file like an argument.");
            return;
        }

        String path;
        path = args[1];
        File file = new File(path);

        try(BufferedReader br = Files.newBufferedReader(file.toPath())){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("No se ha podido leer el archivo" + e.getMessage());
        }
    }

    private static void serAndDeser(){

        SerializableClass obj = new SerializableClass("Hola", 10);

        try {
            FileOutputStream file = new FileOutputStream("file.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(obj);

            out.close();
            file.close();

            System.out.println("Object has been serialized.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        SerializableClass obj1 = null;

        try {
            FileInputStream file = new FileInputStream("file.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            obj1 = (SerializableClass) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


}
