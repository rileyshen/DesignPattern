package apartdeco.ceiling;

import apartdeco.Matter;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-12
 */
public class LevelTwoCeiling  implements Matter {
    @Override
    public String scene() {
        return "BBCeiling";
    }

    @Override
    public String brand() {
        return "BBC";
    }

    @Override
    public String model() {
        return "BBCModel2";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(780);
    }

    @Override
    public String desc() {
        return "BBCeilin for high level house";
    }
}
