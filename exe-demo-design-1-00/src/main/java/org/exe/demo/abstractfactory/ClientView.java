package org.exe.demo.abstractfactory;

import org.exe.demo.abstractfactory.Impl.IUser;
import org.exe.demo.abstractfactory.Impl.sql.SqlServerFactory;
import org.exe.demo.abstractfactory.entiry.User;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-03
 */
public class ClientView {
    public static void main(String[] args) {
        User user = new User();

        IFactory factory = new SqlServerFactory();

        IUser iUser = factory.CreateUser();

        iUser.insert(user);

        iUser.GetUser(1);
    }
}
