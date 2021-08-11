package game;

import game.actor.Actor;
import game.actor.ActorBuilder;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class ActorController {
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildCostume();
        ab.buildFace();
        ab.buildSex();
        ab.buildHairstyle();

        actor = ab.createdActor();
        return actor;
    }
}
