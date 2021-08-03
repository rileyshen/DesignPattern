package org.exe.demo.abstractfactory;

import org.exe.demo.abstractfactory.Impl.IDepartment;
import org.exe.demo.abstractfactory.Impl.IUser;

import org.exe.demo.abstractfactory.entiry.Department;
import org.exe.demo.abstractfactory.entiry.User;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-03
 */
public class ClientView {
    public static void main(String[] args) {
        User user = new User();

        //new code
        Department department = new Department();

        IUser iUser = IFactory.CreateUser();


        iUser.insert(user);

        iUser.GetUser(1);

        Department dept = new Department();

        IDepartment iDepartment = IFactory.CreateDept();

        iDepartment.insert(dept);
        iDepartment.GetDepartment(1);
    }
}
