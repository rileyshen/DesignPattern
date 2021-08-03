package org.exe.demo.abstractfactory.Impl;

import org.exe.demo.abstractfactory.entiry.User;

public interface IUser {
    public void insert(User user);
    public User GetUser(int id);
}
