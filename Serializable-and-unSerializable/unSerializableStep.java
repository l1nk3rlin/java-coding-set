//引入必要的java包文件
import java.io.*;

public class unSerializableStep{
	 public static void main(String [] args)
	   {
	      Employee e = null;
	      try
	      {
	        // 打开一个文件输入流
	         FileInputStream fileIn = new FileInputStream("/Users/l1nk3r/Desktop/employee1.obj");
	        // 建立对象输入流
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	        // 读取对象
	         e = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("This is the "+e.identify+" of our company");


	    }
}