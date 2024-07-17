package N0201;

import java.util.*;

public class n2exercici1 {

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant("El Caliu", 9);
        Restaurant r2 = new Restaurant("McDonalds", 2);
        Restaurant r3 = new Restaurant("Nomo", 9);
        Restaurant r4 = new Restaurant("El Caliu", 8);
        Restaurant r5 = new Restaurant("Nomo", 9);

        Set<Restaurant> hashSetRestaurant = new HashSet<>();

        hashSetRestaurant.add(r1);
        hashSetRestaurant.add(r2);
        hashSetRestaurant.add(r3);
        hashSetRestaurant.add(r4);
        hashSetRestaurant.add(r5);
        hashSetRestaurant.add(new Restaurant("Nomo", 9));

        for (Restaurant r : hashSetRestaurant){
            System.out.println(r);
        }

    }
}
