package com.l1nk3r.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MethodTest {
	public static void main(String[] args) throws Exception {
		Student s=new Student();
		Class<?> c=s.getClass();
		//获得方法
		//Method f1=c.getMethod("getSex");
		//System.out.println("getMethod(\"getSex\")方法获取到的:"+f1);
		Method[] f2=c.getMethods();
		for(int i=0;i<f2.length;i++) {
			System.out.println("getMethods()方法获取到的:"+f2[i]);
		}
		Method f3=c.getDeclaredMethod("getSex");
		System.out.println("getDeclaredMethod(\"getSex\");方法获取到的:"+f3);
		Method[] f4=c.getDeclaredMethods();
		for(int i=0;i<f4.length;i++) {
			System.out.println("getDeclaredMethods()方法获取到的:"+f4[i]);
		}

	}		
}