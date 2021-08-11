package apartdeco;

import java.math.BigDecimal;

public interface Matter {

    String scene(); // ceiling, coat, floor, tilt

    String brand();

    String model();

    BigDecimal price();

    String desc();
}
