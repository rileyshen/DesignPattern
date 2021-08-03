package org.exe.demo.shop.coupon;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-02
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumbner, String uuid) {
        System.out.println("conpon id: " + uId + "," + couponNumbner + "," + uuid);
        return new CouponResult("0000", "success");
    }
}
