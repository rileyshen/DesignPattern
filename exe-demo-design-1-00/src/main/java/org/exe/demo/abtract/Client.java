package org.exe.demo.abtract;

import org.exe.demo.abtract.Impl.AclusterServiceImpl;
import org.exe.demo.abtract.Impl.BclusterServiceImpl;
import org.exe.demo.abtract.Impl.CacheServiceImpl;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-05
 */
public class Client {
    public static void main(String[] args) throws Exception {
        CacheService proxy_Acluster = JDKProxy.getProxy(AclusterServiceImpl.class, new AclusterServiceImpl());

        System.out.println(AclusterServiceImpl.class);

        proxy_Acluster.set("user-name01", "AAA");
        String val = proxy_Acluster.get("user-name01");
        System.out.println(val);

        CacheService proxy_Bcluster = JDKProxy.getProxy(AclusterServiceImpl.class, new BclusterServiceImpl());
        System.out.println(AclusterServiceImpl.class);


        proxy_Bcluster.set("user-name01", "AAA");
        String val2 = proxy_Bcluster.get("user-name01");
        System.out.println(val2);
    }
}
