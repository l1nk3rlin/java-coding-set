import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 
public class Test{
 
 
     
    public static void main(String args[]){
         
        try {
 
            FileInputStream fis = new FileInputStream("test.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
 
            Student1 s3 = (Student1) ois.readObject();
            Student1 s4 = (Student1) ois.readObject();
 
            System.out.println(s3);
            System.out.println(s4);
 
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
     
     