package faststore.food;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
