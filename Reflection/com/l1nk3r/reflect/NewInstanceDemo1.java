package com.l1nk3r.reflect;
public class NewInstanceDemo1 {
    public static void main(String[] args) {
        Class<?> c = UserInfo.class;//获取Class对象
        try {
        	Object str = c.newInstance();
        	System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}