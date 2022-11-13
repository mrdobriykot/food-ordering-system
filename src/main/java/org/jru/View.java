package org.jru;


import org.jru.cuisine.Cuisine;
import org.jru.drink.DrinkAdditionalItem;
import org.jru.drink.DrinkItem;
import org.jru.item.CourseItem;
import org.jru.item.DessertItem;
import org.jru.item.Item;
import org.jru.item.PaidItem;
import org.jru.menu.Menu;

import java.util.List;
import java.util.Scanner;

public class View {
    private static final String NOTHING = "0. Не нужно";
    private Scanner scanner = new Scanner(System.in);
    private Menu menu = new Menu();

    public void printPaidItem(List<? extends PaidItem> items) {
        for (int i = 0; i < items.size(); i++) {
            PaidItem item = items.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " " + item.getPrice());
        }
    }

    public void printItem(List<? extends Item> items) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println((i + 1) + ". " + item.getName());
        }
    }

    public void showMenu() {
        System.out.println("Меню:");
        List<Cuisine> cuisines = menu.getCuisines();
        cuisines.forEach(this::printCuisineMenu);

    }

    private void printCuisineMenu(Cuisine cuisine) {
        System.out.println(cuisine.getName());
        System.out.println("Courses:");
        printPaidItem(cuisine.getCourses());
        System.out.println("Desserts:");
        printPaidItem(cuisine.getDeserts());
        System.out.println();
    }

    public void printCuisines() {
        System.out.println("Сделайте ваш заказ");
        System.out.println("Выбирете кухню");
        System.out.println(NOTHING);
        List<Cuisine> cuisines = menu.getCuisines();
        for (int i = 0; i < cuisines.size(); i++) {
            System.out.println(i + 1 + ". " + cuisines.get(i).getName());
        }
    }

    public int getCuisineIndex() {
        int cuisineIndex = 0;
        int cuisineCount = menu.getCuisines().size();
        while (true) {
            System.out.println("Введите номер кухни: ");
            if (scanner.hasNextInt()) {
                cuisineIndex = scanner.nextInt();
                if (cuisineIndex >= 0 && cuisineIndex <= cuisineCount + 1) {
                    break;
                }
            }
        }
        return cuisineIndex;
    }

    public int getCourseId(List<CourseItem> courses) {
        System.out.println("Выберите основное блюдо");
        printPaidItem(courses);
        int courseId = 0;
        while (true) {
            System.out.println("Выберете номер: ");
            if (scanner.hasNextInt()) {
                courseId = scanner.nextInt();
                if (courseId > 0 && courseId <= courses.size()) {
                    break;
                }
            }
        }
        return courseId;
    }

    public int getDessertId(List<DessertItem> desserts) {
        System.out.println("Выберинет десерт:");
        printPaidItem(desserts);
        int dessertId = 0;
        while (true) {
            System.out.println("Выберете номер: ");
            if (scanner.hasNextInt()) {
                dessertId = scanner.nextInt();
                if (dessertId > 0 && dessertId <= desserts.size()) {
                    break;
                }
            }
        }
        return dessertId;
    }

    public int getDrinkId(List<DrinkItem> drinks) {
        System.out.println("Выберите напиток:");
        System.out.println(NOTHING);
        printPaidItem(drinks);
        int drinkId = 0;
        while (true) {
            System.out.println("Введите номер напитка");
            if (scanner.hasNextInt()) {
                drinkId = scanner.nextInt();
                if (drinkId >= 0 && drinkId <= drinks.size()) {
                    break;
                }
            }
        }
        return drinkId;
    }

    public int getIdAdditionalItem(List<DrinkAdditionalItem> additionalItems) {
        System.out.println("Вы можете добавить в напиток");
        System.out.println(NOTHING);
        printItem(additionalItems);
        int additionalItemId = 0;
        while (true) {
            System.out.println("Введите номер добавки:");
            if (scanner.hasNextInt()) {
                additionalItemId = scanner.nextInt();
                if (additionalItemId >= 0 && additionalItemId <= additionalItems.size() + 1) {
                    break;
                }
            }
        }
        return additionalItemId;
    }


}
