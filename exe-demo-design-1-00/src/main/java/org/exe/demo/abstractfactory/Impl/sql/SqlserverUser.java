package org.exe.demo.abstractfactory.Impl.sql;

import org.exe.demo.abstractfactory.Impl.IUser;
import org.exe.demo.abstractfactory.entiry.User;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-03
 */
public class SqlserverUser implements IUser {


    @Override
    public void insert(User user) {
        System.out.println("insert a user in SQL Server");

    }

    @Override
    public User GetUser(int id) {
        System.out.println("get a user according to the id in SQL Server");
        return null;

    }
}
