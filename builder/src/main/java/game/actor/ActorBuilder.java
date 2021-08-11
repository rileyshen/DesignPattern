package game.actor;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public abstract class ActorBuilder {
    public Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public Actor createdActor() {
        return actor;
    }

}
