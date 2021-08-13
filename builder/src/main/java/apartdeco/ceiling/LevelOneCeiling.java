package apartdeco.ceiling;

import apartdeco.Matter;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-12
 */
public class LevelOneCeiling implements Matter {
    @Override
    public String scene() {
        return "AACeiling";
    }

    @Override
    public String brand() {
        return "AAC";
    }

    @Override
    public String model() {
        return "AACModel1";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(250);
    }

    @Override
    public String desc() {
        return "AACeilin for low level house";
    }
}
