// Hotel management System

import java.util.*;

class Hotel {
    String name, category;
    int calories;

    Hotel(String name, String category, int calories) {
        this.name = name;
        this.category = category;
        this.calories = calories;
    }

    public void display() {
        System.out.println("\nName     : " + name);
        System.out.println("Category : " + category);
        System.out.println("Calories : " + calories);
    }

    public void categorize() {
        System.out.println("Food: " + name + " is a " + (category.equalsIgnoreCase("Veg") ? "Veg item" : "Non-Veg item"));
    }

    public void calorieTrack() {
        if (calories > 500) {
            System.out.println("Calories: " + name + " is a High Calorie Food");
        } else {
            System.out.println("Calories: " + name + " is a Low Calorie Food");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the Limit :");
        int n = ob.nextInt();
        ob.nextLine(); 

        Hotel[] foods = new Hotel[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the food name :");
            String name = ob.nextLine();

            System.out.println("Enter the Food Category(veg/non-veg) :");
            String category = ob.nextLine();

            System.out.println("Enter the calorie :");
            int calories = ob.nextInt();
            ob.nextLine(); 

            foods[i] = new Hotel(name, category, calories);
            foods[i].display();
        }

        System.out.println("\n--- Final Categorization ---\n");

        for(int i=0;i<n;i++)
        {
            foods[i].categorize();
            foods[i].calorieTrack();
            System.out.println();
        }
    }
}
