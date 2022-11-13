import org.jru.builder.LunchBuilder;
import org.jru.item.CourseItem;
import org.jru.item.DessertItem;
import org.jru.lunch.Lunch;
import org.jru.lunch.italian.ItalianCourse;
import org.jru.lunch.italian.ItalianDessert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LunchBuilderTest {
    Lunch lunch;

    @Test
    public void addCourseTest (){
        CourseItem course = ItalianCourse.PIZZA;
        lunch = new LunchBuilder().course(course).build();
        Assertions.assertNotNull(lunch);
        Assertions.assertEquals(course, lunch.getCourse());
    }

    @Test
    public void addDessertTest (){
        DessertItem dessert = ItalianDessert.KARPEZE;
        lunch = new LunchBuilder().dessert(dessert).build();
        Assertions.assertNotNull(lunch);
        Assertions.assertEquals(dessert, lunch.getDessert());
    }
}
