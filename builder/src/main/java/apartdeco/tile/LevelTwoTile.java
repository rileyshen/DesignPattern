package apartdeco.tile;

import apartdeco.Matter;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-12
 */
public class LevelTwoTile implements Matter {
    @Override
    public String scene() {
        return "BBTile";
    }

    @Override
    public String brand() {
        return "BBf";
    }

    @Override
    public String model() {
        return "BBfModel2";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(2380);
    }

    @Override
    public String desc() {
        return "BBTile for high level house";
    }
}
