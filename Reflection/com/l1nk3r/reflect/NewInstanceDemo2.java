package com.l1nk3r.reflect;
 
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
 
public class NewInstanceDemo2 {
    public static void main(String[] args) {
        Class<?> c = UserInfo.class;//获取Class对象
        try {
            Constructor<?> constructor = c.getConstructor(int.class,String.class,int.class);//只有使用类字面常量才能够获取基本类型的Class对象
            UserInfo userInfo = (UserInfo) constructor.newInstance(1,"l1nk3r",1);//构造实例
            System.out.println(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}