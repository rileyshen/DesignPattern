package org.exe.demo.shop.reward;

import java.util.Map;

/**
 *1. Counpon:   CouponResult sendCoupon(String uId, String couponNumbner, String uuid);
 *    2. Goods:   Boolean deleverGoods (DeliverReq req);
 *    3. gift card:  void grantToken(String phoneNumber, String cardId);
 */

// USER ID, GIFT ID, BUSINESS ID
public interface IReward {
    public void sendReward (String uId, String commodityId, String bizId, Map<String, String> ExtMap) throws Exception;
}
