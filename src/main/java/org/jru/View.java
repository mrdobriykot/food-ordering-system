package org.jru;


import org.jru.cuisine.Cuisine;
import org.jru.cuisine.ItalianCuisine;
import org.jru.cuisine.MexicanCuisine;
import org.jru.cuisine.PolishCuisine;
import org.jru.item.CourseItem;
import org.jru.menu.Menu;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public int displayMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           Please choose : ");
        System.out.println("           1. Eat          ");
        System.out.println("           2. Drink        ");
        System.out.println("           3. Eat and drink ");
        System.out.println("======================================================");
        System.out.print(" What Do you Want to Order Today? (1/2/3): ");
        int chooseMenu = scanner.nextInt();
        return chooseMenu;
    }
    
    public int displayCuisineMenu() {
        Menu menu = new Menu();
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           Please choose cuisine:       ");
        System.out.println("           1. " + menu.getCuisines().get(0).getName());
        System.out.println("           2. " + menu.getCuisines().get(1).getName());
        System.out.println("           3. " + menu.getCuisines().get(2).getName());
        System.out.println("======================================================");
        System.out.print(" What Do you Want to Order Today? (1/2/3):");
        int chooseCuisineMenu = scanner.nextInt();
        return chooseCuisineMenu;
    }



    public int italianDisplayMenu() {
        Menu menu = new Menu();
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           Please choose course:       ");
        System.out.println("           1. " + menu.getItalianCuisine().getCourses().get(0)
                + " price: " + menu.getItalianCuisine().getCourses().get(0).getPrice());
        System.out.println("           2. " + menu.getItalianCuisine().getCourses().get(1)
                + " price: " + menu.getItalianCuisine().getCourses().get(1).getPrice());
        System.out.println("           3. " + menu.getItalianCuisine().getCourses().get(2)
                + " price: " + menu.getItalianCuisine().getCourses().get(2).getPrice());
        System.out.println("======================================================");
        System.out.print("          What Do you Want to Order Today? (1/2/3): ");
        int choose = scanner.nextInt();
        return choose;
    }



    public void displayDrinkMenu() {
        Menu menu = new Menu();
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           Please choose cuisine:       ");
        System.out.println("           1. " + menu.getDrinks().get(0));
        System.out.println("           2. " + menu.getDrinks().get(1));
        System.out.println("           3. " + menu.getDrinks().get(2));
        System.out.println("======================================================");
        System.out.println("          What Do you Want to Order Today??");
    }
    
}
