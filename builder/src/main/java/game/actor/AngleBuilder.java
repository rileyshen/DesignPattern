package game.actor;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class AngleBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("Angle");
    }

    @Override
    public void buildSex() {
        actor.setSex("female");
    }

    @Override
    public void buildFace() {
        actor.setFace("bb");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("bbcostume");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("bbhairstyle");
    }
}
