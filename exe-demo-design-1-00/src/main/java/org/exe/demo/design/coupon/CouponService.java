package org.exe.demo.design.coupon;

public class CouponService {

    public CouponResult sendCoupon(String uId,  String
            couponNumber, String uuid) {
        System.out.println("优惠价一张" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
