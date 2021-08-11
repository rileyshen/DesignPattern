package faststore;

import faststore.food.Coke;
import faststore.food.VegBurger;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class MealBuilder {
    public Meal prepareMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
