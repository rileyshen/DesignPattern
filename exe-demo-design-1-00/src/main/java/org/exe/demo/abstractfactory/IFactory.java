package org.exe.demo.abstractfactory;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.exe.demo.abstractfactory.Impl.Access.AccessServiceDepart;
import org.exe.demo.abstractfactory.Impl.Access.AccessServiceUser;
import org.exe.demo.abstractfactory.Impl.IDepartment;
import org.exe.demo.abstractfactory.Impl.IUser;
import org.exe.demo.abstractfactory.Impl.sql.SqlserverUser;
import org.exe.demo.abstractfactory.Impl.sql.Sqlserverdepart;
//
//public interface IFactory {
//    IUser CreateUser();
//}



public interface IFactory {

     String db = "Sqlserver";

    public static IUser CreateUser() {
        IUser result = null;
        switch(db) {
            case "Sqlserve" :
               result = new SqlserverUser();
               break;
            case "Access":
                result = new AccessServiceUser();
                break;
        }
        return result;
    }

    public static IDepartment CreateDept() {
        IDepartment result = null;
        switch(db) {
            case "Sqlserve" :
                result = new Sqlserverdepart();
                break;
            case "Access":
                result = new AccessServiceDepart();
                break;
        }
        return result;

    }
}


