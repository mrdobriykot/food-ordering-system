import org.jru.builder.DrinkBuilder;
import org.jru.drink.Drink;
import org.jru.drink.DrinkAdditionalItem;
import org.jru.drink.DrinkItem;
import org.jru.menu.Menu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrinkBuilderTest {
    Drink drink = new Drink();
    Menu menu = new Menu();

    @Test
    public void testSetDrink() {
        DrinkItem drinkItem = menu.getDrinks().get(0);
        Assertions.assertNull(drink.getDrinkItem());
        drink = new DrinkBuilder().drink(drinkItem).build();
        Assertions.assertEquals(drinkItem, drink.getDrinkItem());
    }

    @Test
    public void addAdditionalItemTest() {
        DrinkAdditionalItem drinkAdditionalItem = menu.getDrinkAdditionalItems().get(0);
        Assertions.assertTrue(drink.getDrinkAdditionalItem().isEmpty());
        drink = new DrinkBuilder().additionalItem(drinkAdditionalItem).build();
        Assertions.assertEquals(drinkAdditionalItem, drink.getDrinkAdditionalItem().get(0));
    }
}
