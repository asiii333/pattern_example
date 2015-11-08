package construct.bulider;

import junit.framework.Assert;
import junit.framework.TestCase;
import pl.comarch.patterns.construct.bulider.Meal;
import pl.comarch.patterns.construct.bulider.MealBulider;

import java.util.logging.Logger;

/**
 * Created by Asia on 2015-11-03.
 */
public class MealBuliderTest extends TestCase {

    MealBulider mealBulider = new MealBulider();
    private static Logger logger;
    public MealBuliderTest(String name) {
        super(name);
    }


    public void testVegBurger() {
        Meal vegBurger = mealBulider.prepareVegMeal();
        System.out.println("vegBurgerTest");
        Assert.assertNotNull(vegBurger);
        Assert.assertEquals("price test", 55.0f, vegBurger.getCost());

    }
}
