package builder1;

import java.awt.*;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-10
 */
public abstract class PersonBuilder {

    protected Graphics g;

    public PersonBuilder(Graphics g) {
        this.g = g;
    }

    abstract void buildHeard();
    abstract void buildBody();
    abstract void buildArmLeft();
    abstract void buildArmRight();
    abstract void buildLegLeft();
    abstract void buildLegRight();

}
