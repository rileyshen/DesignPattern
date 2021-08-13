package game.actor;

/**
 * @Description: game 1.3: (HookMethod
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
   // (HookMethod

public abstract class ActorBuilder {
   protected static Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    // hooked method
    public boolean isBareHeaded() {
        return false;
    }
//    public Actor ActorCreate() {
//        return actor;
//    }


        public static Actor construct(ActorBuilder ab) {

            ab.buildType();
            ab.buildCostume();
            ab.buildFace();
            ab.buildSex();
// hooked method
            if (!ab.isBareHeaded()) {
                ab.buildHairstyle();
            }



            return actor;
        }



}

//builder pattern的实现核心在于每个method都返回builder object 本身。
// 然后chain起来给builder object赋值，最后利用build method返回需要使用的object。