package N0202;

import java.util.*;

public class Restaurant implements Comparable<Restaurant>{

    private String name;
    private int points;

    //Constructor
    public Restaurant(String name, int points){
        this.name = name;
        this.points = points;
    }

    //Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    //Metodes
    @Override
    public int hashCode() {
        return Objects.hash(name, points);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Restaurant tmpRestaurant = (Restaurant) obj;
        return points == tmpRestaurant.points && name.equals(tmpRestaurant.name);
    }

    @Override
    public int compareTo(Restaurant restaurant) {
        if (!this.name.equals(restaurant.name)){
            return this.name.compareTo(restaurant.name);
        } else {
            return Integer.compare(this.points, restaurant.points);
        }
    }
    
    //toString
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}
