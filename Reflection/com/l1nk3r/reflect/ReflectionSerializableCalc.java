package com.l1nk3r.reflect;
import java.io.*;

public class ReflectionSerializableCalc{
    public static void main(String args[]) throws Exception{
        //定义myObj对象
    	ReflectionCalcObject myObj = new ReflectionCalcObject();
        myObj.name = "hi";
        //创建一个包含对象进行反序列化信息的”object”数据文件
        FileOutputStream fos = new FileOutputStream("/Users/l1nk3r/Desktop/object");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        //writeObject()方法将myObj对象写入object文件
        os.writeObject(myObj);
        os.close();
    }
}