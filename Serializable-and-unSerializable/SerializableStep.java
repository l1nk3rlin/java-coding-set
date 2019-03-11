//引入必要的java包文件
import java.io.*;

//主类
public class SerializableStep{
    //测试主类
	public static void main(String [] args)
	   {
	      Employee e = new Employee();
	      e.name = "l1nk3r";
	      e.identify = "l1nk3r";
	      try
	      {
	        // 打开一个文件输入流
	         FileOutputStream fileOut =
	         new FileOutputStream("/Users/l1nk3r/Desktop/employee1.obj");
	         // 建立对象输入流
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         //输出反序列化对象
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /Users/l1nk3r/Desktop/employee1.obj");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
}