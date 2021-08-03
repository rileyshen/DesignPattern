package org.exe.demo.shop.reward.Impl;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.exe.demo.shop.coupon.CouponResult;
import org.exe.demo.shop.coupon.CouponService;
import org.exe.demo.shop.reward.IReward;

import java.util.Map;

/**
 * @Description: Counpon:   CouponResult sendCoupon(String uId, String couponNumbner, String uuid);
 * @Author RileyShen
 * @Create 2021-08-02
 */
@Slf4j
public class CouponImpl implements IReward {

    private CouponService couponService = new CouponService();

    @Override
    public void sendReward(String uId, String commodityId, String bizId, Map<String, String> ExtMap) throws Exception {


        CouponResult couponResult = couponService.sendCoupon(uId,   commodityId ,  bizId);

        log.info("Coupon => uId: {}  commodityId: {} bizId: {} extMap： {} ", uId, commodityId, bizId, JSON.toJSON(ExtMap));

        log.info("test result => {} ",  JSON.toJSON(couponResult));

    }

}

// log.info("test result => {} ",  JSON.toJSON(couponResult));  test result => {"code":"0000","info":"success"}
// log.info("test result => {} ", couponResult);   test result => CouponResult(code=0000, info=success)