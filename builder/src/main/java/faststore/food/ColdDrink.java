package faststore.food;

import faststore.packing.Bottle;
import faststore.packing.Packing;

/**
 * @Description: step3:Create abstract classes implementing the item interface providing default functionalities.
 * @Author RileyShen
 * @Create 2021-08-11
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }


    public abstract float price();

}
