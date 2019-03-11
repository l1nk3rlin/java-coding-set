import java.io.*;

public class ExternalizableTest{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       Operate operate=new Operate();
       Person person=new Person("l1nk3r","123456","20");
       System.out.println("为序列化之前的相关数据如下:\n"+person.toString());
       operate.serializable(person);
       Person newPerson=operate.deSerializable();
       System.out.println("-------------------------------------------------------");
       System.out.println("序列化之后的相关数据如下:\n"+newPerson.toString());
    }
          
}