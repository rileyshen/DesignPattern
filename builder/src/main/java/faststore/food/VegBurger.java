package faststore.food;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
