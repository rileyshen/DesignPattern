package apartdeco.tile;

import apartdeco.Matter;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-12
 */
public class LevelOneTile implements Matter {
    @Override
    public String scene() {
        return "AATile";
    }

    @Override
    public String brand() {
        return "AAT";
    }

    @Override
    public String model() {
        return "AAtModel1";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(550);
    }

    @Override
    public String desc() {
        return "AATile for low level house";
    }
}
