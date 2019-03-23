package com.l1nk3r.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;
import com.l1nk3r.reflect.Student;
 
public class FieldTest {
	public static void main(String[] args) throws Exception {
		Student s=new Student();
		Class<?> c=s.getClass();
		//获得类声明
		//Field f1=c.getField("sex");
		//System.out.println("getField(\"sex\")方法获取到的:"+f1);
		Field[] f2=c.getFields();
		for(int i=0;i<f2.length;i++) {
			System.out.println("getFields()方法获取到的:"+f2[i]);
		}
		Field f3=c.getDeclaredField("sex");
		System.out.println("getDeclaredField(\"sex\")方法获取到的:"+f3);
		Field[] f4=c.getDeclaredFields();
		for(int i=0;i<f4.length;i++) {
			System.out.println("getDeclaredFields()方法获取到的:"+f4[i]);
		}

	}		
}