import java.io.*;
 
class Student1 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private transient String password;                 //transient关键字
    private static int count = 0;                      //静态变量
 
    public Student1(String name, String password) {
        System.out.println("调用Student的带参的构造方法");
        this.name = name;
        this.password = password;
        count++;
    }
 
    public String toString() {
        return "人数: " + count + " 姓名: " + name + " 密码: " + password;
    }
}
 
public class ObjectSerTest1 {
    public static void main(String args[]) {
        try {
            FileOutputStream fos = new FileOutputStream("test.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Student1 s1 = new Student1("张三", "12345");
            Student1 s2 = new Student1("王五", "54321");
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}