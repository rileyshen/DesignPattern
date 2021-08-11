package faststore.food;

import faststore.packing.Packing;
import faststore.packing.Wrapper;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }


    public abstract float price();
}
