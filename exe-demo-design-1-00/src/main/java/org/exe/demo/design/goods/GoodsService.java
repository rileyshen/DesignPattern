package org.exe.demo.design.goods;
import com.alibaba.fastjson.JSON;

public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("发货实物商品一个" + JSON.toJSONString(req));
        return true;
    }
}
