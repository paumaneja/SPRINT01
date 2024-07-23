package N0103;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class n1exercici3 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        String country, city, nameUser;
        int points = 0;

        String actualDir = System.getProperty("user.dir");

        Path pathIn = Paths.get(actualDir,"TASCA03/src/main/resources/countries.txt");
        try {
            List<String> lines = Files.readAllLines(pathIn);
            for (String line : lines){
                String[] parts = line.split(" ");
                country = parts[0];
                city = parts[1];
                map.put(country, city);
            }
        } catch (IOException e){
            System.out.println("No se ha encontrado el archivo. " + e.getMessage());
        }


        System.out.println("Introduce el nombre del jugador:");
        Scanner input = new Scanner(System.in);
        nameUser = input.nextLine();

        //Mostramos un pais de forma aleatoria
        for (int i = 0; i <10; i++){
            int sizeMap = map.size();
            int numRandom = (int) (Math.random()*sizeMap);
            List<String> mapValues = new ArrayList<>(map.values());
            List<String> mapKeys = new ArrayList<>(map.keySet());
            System.out.println("Escribe la capital de " + mapKeys.get(numRandom) + " :");
            String cityUser;
            cityUser = input.nextLine();
            if (cityUser.equalsIgnoreCase(mapValues.get(numRandom))){
                System.out.println("Correcte. Has sumat un punt.");
                points++;
            } else {
                System.out.println("Incorrecte. No has sumat cap punt.");
            }
        }

        //Creamos un archivo y guardamos nombre y puntuación
        Path pathOut = Paths.get(actualDir,"TASCA03/src/main/resources/classificacio.txt");
        try (BufferedWriter bw = Files.newBufferedWriter(pathOut)){
            bw.write(nameUser + " " + points);
        } catch (Exception e) {
            System.out.println("No se ha podido guardar el archivo." + e.getMessage());
        }
        input.close();
    }
}
