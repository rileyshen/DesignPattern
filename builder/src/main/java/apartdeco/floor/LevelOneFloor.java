package apartdeco.floor;

import apartdeco.Matter;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-12
 */
public class LevelOneFloor implements Matter {
    @Override
    public String scene() {
        return "AAFloor";
    }

    @Override
    public String brand() {
        return "AAf";
    }

    @Override
    public String model() {
        return "AAFodel1";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(600);
    }

    @Override
    public String desc() {
        return "AAFloor for low level house";
    }
}
