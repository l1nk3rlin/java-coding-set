package com.l1nk3r.reflect;
import java.io.*;
import java.lang.reflect.Method;

class ReflectionCalcObject implements Serializable{
    public String name;
    //重写readObject()方法
    private void readObject(java.io.ObjectInputStream in) throws IOException,ClassNotFoundException{
        in.defaultReadObject();//调用原始的readOject方法

        try {//通过反射方法执行命令；
        Method method= java.lang.Runtime.class.getMethod("exec", String.class);
        Object result = method.invoke(Runtime.getRuntime(), "open /Applications/Calculator.app/");    
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        }
    }