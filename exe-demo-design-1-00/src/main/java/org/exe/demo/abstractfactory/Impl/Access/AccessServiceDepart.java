package org.exe.demo.abstractfactory.Impl.Access;

import org.exe.demo.abstractfactory.Impl.IDepartment;
import org.exe.demo.abstractfactory.entiry.Department;
import org.exe.demo.abstractfactory.entiry.User;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-03
 */
public class AccessServiceDepart implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("insert a department in Access Server");

    }

    @Override
    public User GetDepartment(int id) {
        System.out.println("get a department according to the id in Access Server");
        return null;
    }
}
