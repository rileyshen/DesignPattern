package org.exe.demo.shop.goods;

import com.alibaba.fastjson.JSON;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-02
 */
public class GoodService {

   public Boolean deliverGoods (DeliverReq req) {
       System.out.println("gift info: " + JSON.toJSONString(req));
       return true;
   }
}
