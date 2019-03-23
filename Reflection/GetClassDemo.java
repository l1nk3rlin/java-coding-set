public class GetClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //以String类为例：
        String str="hello world";
        //方式一：通过Class类的静态方法forName
        Class<?> clazz1 =Class.forName("java.lang.String");
        //方式二：通过类的class属性
        Class<?> clazz2 =String.class;
        //方式三 ：通过对象的getClass()方法
        Class<?> clazz3 =str.getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz2.getName());
        System.out.println(clazz3.getName());
	}
}