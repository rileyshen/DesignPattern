package org.exe.demo.abstractfactory;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.exe.demo.abstractfactory.Impl.Access.AccessServiceDepart;
import org.exe.demo.abstractfactory.Impl.Access.AccessServiceUser;
import org.exe.demo.abstractfactory.Impl.IDepartment;
import org.exe.demo.abstractfactory.Impl.IUser;
import org.exe.demo.abstractfactory.Impl.sql.SqlserverUser;
import org.exe.demo.abstractfactory.Impl.sql.Sqlserverdepart;
import sun.reflect.Reflection;
import java.util.PrimitiveIterator;
//
//public interface IFactory {
//    IUser CreateUser();
//}

// astract 1.2: use reflection
// astract 1.1: it should be a class not an interface
public class IFactory {

    private static final String db = "SqlServer";
    private static String className = null;

    //    public static IUser CreateUser() {
//        IUser result = null;
//        switch(db) {
//            case "Sqlserve" :
//               result = new SqlserverUser();
//               break;
//            case "Access":
//                result = new AccessServiceUser();
//                break;
//        }
//        return result;
//    }
//
//    public static IDepartment CreateDept() {
//        IDepartment result = null;
//        switch(db) {
//            case "Sqlserve" :
//                result = new Sqlserverdepart();
//                break;
//            case "Access":
//                result = new AccessServiceDepart();
//                break;
//        }
//        return result;
//
//    }
            static IUser CreateUser() {
                className = db + "User";

                try {
                    return (IUser) Class.forName(className).newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return null;

            }

            static IDepartment CreateDept() {
                className = db + "Department";

                try {
                    return (IDepartment) Class.forName(className).newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return null;

            }
}


