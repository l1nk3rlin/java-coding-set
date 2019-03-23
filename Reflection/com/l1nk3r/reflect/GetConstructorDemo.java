package com.l1nk3r.reflect;

import java.lang.reflect.Constructor;

public class GetConstructorDemo {
    public static void main(String[] args) {
        Class<?> c = UserInfo.class;//获取Class对象
        Constructor<?> cons[] = c.getConstructors();//获取构造函数的数组
        //打印
        for (Constructor<?> constructor : cons) {
            System.out.println(constructor);
        }
    }
}

