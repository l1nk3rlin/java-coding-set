import java.io.Serializable;

//创建测试类，注意要继承Serializable接口
public class Employee implements Serializable{
	public String name;
	   public String identify;
	   public void mailCheck()
	   {
	      System.out.println("This is the "+this.identify+" of our company");
	   }
} 