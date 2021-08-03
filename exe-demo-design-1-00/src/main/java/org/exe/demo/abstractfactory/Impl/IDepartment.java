package org.exe.demo.abstractfactory.Impl;

import org.exe.demo.abstractfactory.entiry.Department;
import org.exe.demo.abstractfactory.entiry.User;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-03
 */
public interface IDepartment {

        public void insert(Department department);
        public User GetDepartment(int id);
    }


