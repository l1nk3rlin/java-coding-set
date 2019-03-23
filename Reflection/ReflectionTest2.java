import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionTest2 {
    @SuppressWarnings({"rowtypes","unchecked"})
    public static void main(String[] args)
            throws FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        File ConfigFile= new File("/Users/l1nk3r/Desktop/java reflect/Reflection.txt");
        Properties ReflectionConfig = new Properties();
        ReflectionConfig.load(new FileInputStream(ConfigFile));
        String className = (String)ReflectionConfig.get("class");
        String methodName = (String)ReflectionConfig.get("method");
        //根据类，名称创建类对象
        Class clazz = Class.forName(className);
        //根据方法名称获取方法
        Method m = clazz.getMethod(methodName);
        //获取构造器
        Constructor c = clazz.getConstructor();
        //根据构造器实例化出相关对象
        Object service = c.newInstance();
        //调用对象的指定方法
        m.invoke(service);
    }
}