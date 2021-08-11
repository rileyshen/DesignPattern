package faststore.food;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
