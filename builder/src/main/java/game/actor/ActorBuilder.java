package game.actor;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
//public abstract class ActorBuilder {
//    public Actor actor = new Actor();
//
//    public abstract void buildType();
//
//    public abstract void buildSex();
//
//    public abstract void buildFace();
//
//    public abstract void buildCostume();
//
//    public abstract void buildHairstyle();
//
//    public Actor createdActor() {
//        return actor;
//    }
//
//}

// combine ActorBuilder and ActorController

public abstract class ActorBuilder {
   protected static Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

//    public Actor ActorCreate() {
//        return actor;
//    }


        public static Actor construct(ActorBuilder ab) {

            ab.buildType();
            ab.buildCostume();
            ab.buildFace();
            ab.buildSex();
            ab.buildHairstyle();


            return actor;
        }



}
