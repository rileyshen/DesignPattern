package game.actor;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class HeroBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("Hero");
    }

    @Override
    public void buildSex() {
        actor.setSex("female");
    }

    @Override
    public void buildFace() {
        actor.setFace("aa");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("aacostume");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("aahairstyle");
    }
}
