package apartdeco.floor;

import apartdeco.Matter;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-12
 */
public class LevelTwoFloor implements Matter {
    @Override
    public String scene() {
        return "BBFloor";
    }

    @Override
    public String brand() {
        return "BBF";
    }

    @Override
    public String model() {
        return "BBFModel2";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(1180);
    }

    @Override
    public String desc() {
        return "BBFloor for high level house";
    }
}
