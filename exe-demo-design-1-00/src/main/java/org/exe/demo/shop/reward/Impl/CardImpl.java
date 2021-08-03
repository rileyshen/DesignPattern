package org.exe.demo.shop.reward.Impl;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.exe.demo.shop.card.CardService;
import org.exe.demo.shop.reward.IReward;

import java.util.Map;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-02
 */
@Slf4j
public class CardImpl implements IReward {

    private CardService cardService = new CardService();

    @Override
    public void sendReward(String uId, String commodityId, String bizId, Map<String, String> ExtMap) throws Exception {

        cardService.grantToken(queryUserMobile(uId), bizId);

        log.info("Card => uId: {}  commodityId: {} bizId: {} extMap： {} ", uId, commodityId, bizId, JSON.toJSON(ExtMap));

        log.info("test result => success ");
    }

    private String queryUserMobile(String uId) {
        return "137384008070";
    }
}
