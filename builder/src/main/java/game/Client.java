package game;

import game.actor.Actor;
import game.actor.ActorBuilder;
import game.actor.HeroBuilder;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class Client {
    public static void main(String[] args) {

//
//        ActorBuilder actorBuilder = new HeroBuilder();
//
//        ActorController actorController = new ActorController();
//
//        Actor construct = actorController.construct(actorBuilder);
//
//        System.out.println(construct); // Actor(type=Hero, sex=female, face=aa, costume=aacostume, hairstyle=aahairstyle)


        Actor actor = ActorBuilder.construct(new HeroBuilder());

        System.out.println(actor); // Actor(type=Hero, sex=female, face=aa, costume=aacostume, hairstyle=aahairstyle)

    }
}


//但是建造者模式返回一个完整的复杂产品，而抽象工厂模式返回一系列相关的产品；
// 在抽象工厂模式中，客户端通过选择具体工厂来生成所需对象，而在建造者模式中，客户端通过指定具体建造者类型并指导Director类如何去生成对象，
// 侧重于一步步构造一个复杂对象，然后将结果返回。如果将抽象工厂模式看成一个汽车配件生产厂，
// 生成不同类型的汽车配件，那么建造者模式就是一个汽车组装厂，通过对配件进行组装返回一辆完整的汽车。
