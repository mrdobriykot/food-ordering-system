package org.jru;


import org.jru.drink.DrinkAdditionalItem;
import org.jru.drink.DrinkItem;
import org.jru.item.CourseItem;
import org.jru.item.DessertItem;
import org.jru.menu.Menu;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();

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


    public CourseItem italianDisplayMenu() {
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
        return menu.getItalianCuisine().getCourses().get(choose-1);
    }


    public CourseItem mexicanDisplayMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           Please choose course:       ");
        System.out.println("           1. " + menu.getMexicanCuisine().getCourses().get(0)
                + " price: " + menu.getMexicanCuisine().getCourses().get(0).getPrice());
        System.out.println("           2. " + menu.getMexicanCuisine().getCourses().get(1)
                + " price: " + menu.getMexicanCuisine().getCourses().get(1).getPrice());
        System.out.println("           3. " + menu.getMexicanCuisine().getCourses().get(2)
                + " price: " + menu.getMexicanCuisine().getCourses().get(2).getPrice());
        System.out.println("======================================================");
        System.out.print("          What Do you Want to Order Today? (1/2/3): ");
        int choose = scanner.nextInt();
        return menu.getMexicanCuisine().getCourses().get(choose-1);
    }

    public CourseItem polishDisplayMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           Please choose course:       ");
        System.out.println("           1. " + menu.getPolishCuisine().getCourses().get(0)
                + " price: " + menu.getPolishCuisine().getCourses().get(0).getPrice());
        System.out.println("           2. " + menu.getPolishCuisine().getCourses().get(1)
                + " price: " + menu.getPolishCuisine().getCourses().get(1).getPrice());
        System.out.println("           3. " + menu.getPolishCuisine().getCourses().get(2)
                + " price: " + menu.getPolishCuisine().getCourses().get(2).getPrice());
        System.out.println("======================================================");
        System.out.print("          What Do you Want to Order Today? (1/2/3): ");
        int choose = scanner.nextInt();
        return menu.getPolishCuisine().getCourses().get(choose-1);
    }

    public int chooseDrinkMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("  Would you like to choose some adds to your drink : ");
        System.out.println("           1. Yes          ");
        System.out.println("           2. No        ");
        System.out.println("======================================================");
        System.out.print(" What Do you Want to Order Today? (1/2): ");
        int chooseMenu = scanner.nextInt();
        return chooseMenu;
    }

    public DessertItem italianDisplayDessertMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           Please choose course:       ");
        System.out.println("           1. " + menu.getItalianCuisine().getDeserts().get(0)
                + " price: " + menu.getItalianCuisine().getDeserts().get(0).getPrice());
        System.out.println("           2. " + menu.getItalianCuisine().getDeserts().get(1)
                + " price: " + menu.getItalianCuisine().getDeserts().get(1).getPrice());
        System.out.println("           3. " + menu.getItalianCuisine().getDeserts().get(2)
                + " price: " + menu.getItalianCuisine().getDeserts().get(2).getPrice());
        System.out.println("======================================================");
        System.out.print("          What Do you Want to Order Today? (1/2/3): ");
        int choose = scanner.nextInt();
        return menu.getItalianCuisine().getDeserts().get(choose-1);
    }

    public DessertItem mexicanDisplayDessertMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           Please choose course:       ");
        System.out.println("           1. " + menu.getMexicanCuisine().getDeserts().get(0)
                + " price: " + menu.getMexicanCuisine().getDeserts().get(0).getPrice());
        System.out.println("           2. " + menu.getMexicanCuisine().getDeserts().get(1)
                + " price: " + menu.getMexicanCuisine().getDeserts().get(1).getPrice());
        System.out.println("           3. " + menu.getMexicanCuisine().getDeserts().get(2)
                + " price: " + menu.getMexicanCuisine().getDeserts().get(2).getPrice());
        System.out.println("======================================================");
        System.out.print("          What Do you Want to Order Today? (1/2/3): ");
        int choose = scanner.nextInt();
        return menu.getMexicanCuisine().getDeserts().get(choose-1);
    }

    public DessertItem polishDisplayDessertMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           Please choose course:       ");
        System.out.println("           1. " + menu.getPolishCuisine().getDeserts().get(0)
                + " price: " + menu.getPolishCuisine().getDeserts().get(0).getPrice());
        System.out.println("           2. " + menu.getPolishCuisine().getDeserts().get(1)
                + " price: " + menu.getPolishCuisine().getDeserts().get(1).getPrice());
        System.out.println("           3. " + menu.getPolishCuisine().getDeserts().get(2)
                + " price: " + menu.getPolishCuisine().getDeserts().get(2).getPrice());
        System.out.println("======================================================");
        System.out.print("          What Do you Want to Order Today? (1/2/3): ");
        int choose = scanner.nextInt();
        return menu.getPolishCuisine().getDeserts().get(choose-1);
    }


    public DrinkItem displayDrinkMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           Please choose drink:       ");
        System.out.println("           1. " + menu.getDrinks().get(0)
                + " price: " + menu.getDrinks().get(0).getPrice());
        System.out.println("           2. " + menu.getDrinks().get(1)
                + " price: " + menu.getDrinks().get(1).getPrice());
        System.out.println("           3. " + menu.getDrinks().get(2)
                + " price: " + menu.getDrinks().get(2).getPrice());
        System.out.println("======================================================");
        System.out.print("          What Do you Want to Order Today? (1/2/3): ");
        int choose = scanner.nextInt();
        return menu.getDrinks().get(choose-1);
    }

    public DrinkAdditionalItem displayAdditionalDrinkMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           Please choose additional to drink:       ");
        System.out.println("           1. " + menu.getDrinkAdditionalItems().get(0));
        System.out.println("           2. " + menu.getDrinkAdditionalItems().get(1));
        System.out.println("======================================================");
        System.out.print("          What Do you Want to Order Today? (1/2): ");
        int choose = scanner.nextInt();
        return menu.getDrinkAdditionalItems().get(choose-1);
    }
}
