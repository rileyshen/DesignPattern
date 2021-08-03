package org.exe.demo.abstractfactory.Impl.Access;

import org.exe.demo.abstractfactory.IFactory;
import org.exe.demo.abstractfactory.Impl.IUser;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-03
 */
public class AccessServiceFactory implements IFactory {
    @Override
    public IUser CreateUser() {
        return new AccessServiceUser();
    }
}
