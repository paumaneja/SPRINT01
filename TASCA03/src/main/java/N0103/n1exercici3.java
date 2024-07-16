package N0103;

import java.io.*;
import java.util.*;

public class n1exercici3 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        String line;
        String country;
        String city;
        String nameUser;
        int points = 0;

        try (FileReader fr = new FileReader("/Users/paumaneja/Documents/GitHub/JAVA/SPRINT01/TASCA03/src/main/resources/countries.txt")){
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null){
                String[] parts = line.split(" ");
                country = parts[0];
                city = parts[1];
                map.put(country, city);
            }
        } catch (Exception e){
            System.out.println("No se ha encontrado el archivo.");
        }
        //System.out.println(map);

        /*
        File f = new File("/Users/paumaneja/Documents/GitHub/JAVA/SPRINT01/TASCA03/src/main/resources/countries.txt");
        Scanner input;
        try{
            input = new Scanner(f);
            while (input.hasNextLine()){
                line = input.nextLine();
                String[] parts = line.split(" ");
                country = parts[0];
                city = parts[1];
                map.put(country, city);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        }
        System.out.println(map);
        */

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
        try{
            FileWriter fw = new FileWriter("/Users/paumaneja/Documents/GitHub/JAVA/SPRINT01/TASCA03/src/main/resources/classificacio.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nameUser + " " + points);
            bw.flush();
            bw.close();
        } catch (Exception e) {
            System.out.println("No se ha podido guardar el archivo.");
        }




    }
}
