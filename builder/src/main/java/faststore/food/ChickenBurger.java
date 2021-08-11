package faststore.food;

import faststore.food.Burger;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 15.5f;
    }
}
