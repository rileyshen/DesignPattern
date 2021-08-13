package apartdeco;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-12
 */
public class Deco implements Imenu {

    private List<Matter> list = new ArrayList<>();
    private BigDecimal price = BigDecimal.ZERO;
    private BigDecimal area;
    private String grade;

    public Deco(double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    @Override
    public Imenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1.5")).multiply(matter.price()));
        return this;
    }

    @Override
    public Imenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public Imenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {

        StringBuilder detail = new StringBuilder("\r\n-----------------------------------" +
                "-----------------------------------------\r\n" +
                "deco list" + "\r\n" +
                "package level: " + grade + "\r\n" +
                "package price: " + price.setScale(2, BigDecimal.ROUND_HALF_UP) + "$\r\n" +
                "house area: " + area.doubleValue() + "feet\r\n" +
                "matter list: \r\n");

       for (Matter matter : list) {
           detail.append(matter.scene()).append(": ").append(matter.brand()).append(",").append(matter.model())
                   .append(", price/feet: ").append(matter.price()).append(" $. \n");
       }
        return detail.toString();
    }
}
