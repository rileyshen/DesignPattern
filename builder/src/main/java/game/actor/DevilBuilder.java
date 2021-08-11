package game.actor;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class DevilBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("Devil");
    }

    @Override
    public void buildSex() {
        actor.setSex("male");
    }

    @Override
    public void buildFace() {
        actor.setFace("cc");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("cccostume");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("cchairstyle");
    }
}
