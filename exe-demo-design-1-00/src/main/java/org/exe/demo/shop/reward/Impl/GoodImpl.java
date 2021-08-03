package org.exe.demo.shop.reward.Impl;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.exe.demo.shop.goods.DeliverReq;
import org.exe.demo.shop.goods.GoodService;
import org.exe.demo.shop.reward.IReward;

import java.util.Map;

/**
 * @Description: Goods:   Boolean deleverGoods (DeliverReq req);
 * @Author RileyShen
 * @Create 2021-08-02
 */
@Slf4j
public class GoodImpl implements IReward {

    private GoodService goodService = new GoodService();
//    private GoodService goodService; in the StoreFactory would get a null
    @Override
    public void sendReward(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {

        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhone(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodService.deliverGoods(deliverReq);

        log.info("Coupon => uId: {}  commodityId: {} bizId: {} extMap： {} ", uId, commodityId, bizId, JSON.toJSON(extMap));

        log.info("test result => {} ",  isSuccess);

        if (!isSuccess) throw new RuntimeException("fails to deliver goods");
    }

    private String queryUserName (String uId) {
        return "Big C";
    }

     private String queryUserPhone (String phone) {
        return "1372347890";
    }
}
