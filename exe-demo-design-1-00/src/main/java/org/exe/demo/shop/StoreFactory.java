package org.exe.demo.shop;

import org.exe.demo.factoryMethod.IFactory;
import org.exe.demo.shop.card.CardService;
import org.exe.demo.shop.reward.IReward;
import org.exe.demo.shop.reward.Impl.CardImpl;
import org.exe.demo.shop.reward.Impl.CouponImpl;
import org.exe.demo.shop.reward.Impl.GoodImpl;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class StoreFactory {

    public IReward getRewardService(Integer rewardType) {
        switch (rewardType) {
            case 1:
                return new CouponImpl();

            case 2:
                return new GoodImpl();
            case 3:
                return new CardImpl();
            default:
                throw new RuntimeException("there is no such service");
        }
    }

    @Test
    public void test_commodity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();

        IReward coupService = storeFactory.getRewardService(1);

        coupService.sendReward("1001", "EGM102345", "3749898", null);

    }

    @Test
    public void test_commodity1() throws Exception {
        StoreFactory storeFactory1 = new StoreFactory();
        IReward goodService = storeFactory1.getRewardService(2);

        Map<String, String> extMap = new HashMap<>();
        extMap.put("consigneeUserName", "Mrt J");
        extMap.put("consigneeUserPhone", "112234445");
        extMap.put("consigneeUserAddress", "234 Blvd, Dever, Co 80222");

        goodService.sendReward("1001", "GEM102345", "2349898", extMap);
    }

    @Test
    public void test_commodity2() throws Exception {
        StoreFactory storeFactory2 = new StoreFactory();
        IReward cardService = storeFactory2.getRewardService(3);


        cardService.sendReward("1003", "AMZ102345EOIJIOJO IOJHOI", null, null);
    }

    @Test
    public void test_commodity3() throws Exception {
        IReward cardSer = new CardImpl();

        cardSer.sendReward("1003", "AMZ102345EOIJIOJO IOJHOI", null, null);


    }
}



