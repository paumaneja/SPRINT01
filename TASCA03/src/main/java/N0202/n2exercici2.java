package N0202;

import java.util.*;

public class n2exercici2 {

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant("El Caliu", 9);
        Restaurant r2 = new Restaurant("McDonalds", 2);
        Restaurant r3 = new Restaurant("Nomo", 9);
        Restaurant r4 = new Restaurant("El Caliu", 8);
        Restaurant r5 = new Restaurant("Nomo", 10);
        Restaurant r6 = new Restaurant("Nomo", 5);
        Restaurant r7 = new Restaurant("Nomo", 8);

        Set<Restaurant> hashSetRestaurant = new HashSet<>();

        hashSetRestaurant.add(r1);
        hashSetRestaurant.add(r2);
        hashSetRestaurant.add(r3);
        hashSetRestaurant.add(r4);
        hashSetRestaurant.add(r5);
        hashSetRestaurant.add(r6);
        hashSetRestaurant.add(r7);

        System.out.println("Exercici1:\n");
        for (Restaurant r : hashSetRestaurant) {
            System.out.println(r);
        }

        TreeSet<Restaurant> sortedRestaurant = new TreeSet<>(hashSetRestaurant);

        System.out.println("Exercici2:\n");
        for (Restaurant r : sortedRestaurant) {
            System.out.println(r);
        }

    }
}
