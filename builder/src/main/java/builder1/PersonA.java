package builder1;

import java.awt.*;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-10
 */
public class PersonA extends PersonBuilder{

    public PersonA(Graphics g) {
        super(g);

    }

    @Override
    void buildHeard() {
        g.fillOval(50, 50, 30, 30);
    }

    @Override
    void buildBody() {

    }

    @Override
    void buildArmLeft() {

    }

    @Override
    void buildArmRight() {

    }

    @Override
    void buildLegLeft() {

    }

    @Override
    void buildLegRight() {

    }
}
