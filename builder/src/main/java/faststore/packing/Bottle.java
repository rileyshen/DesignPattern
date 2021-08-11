package faststore.packing;

/**
 * @Description:Create concrete classes implementing the Packing interface.
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
