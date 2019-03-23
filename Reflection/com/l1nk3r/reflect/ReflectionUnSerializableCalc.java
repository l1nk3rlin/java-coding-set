package com.l1nk3r.reflect;
//引入必要的java包文件
import java.io.*;

public class ReflectionUnSerializableCalc{
    public static void main(String args[]) throws Exception{
        //从文件中反序列化obj对象
        FileInputStream fis = new FileInputStream("/Users/l1nk3r/Desktop/object");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //恢复对象
        ReflectionCalcObject objectFromDisk = (ReflectionCalcObject)ois.readObject();
        System.out.println(objectFromDisk.name);
        ois.close();
    }
}
