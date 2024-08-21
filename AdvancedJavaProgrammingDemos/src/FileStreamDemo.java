import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\jains\\OneDrive\\Desktop\\javaSelenium\\AdvancedJavaProgrammingDemos\\src\\input.txt";
  String path2 = "C:\\Users\\jains\\OneDrive\\Desktop\\javaSelenium\\AdvancedJavaProgrammingDemos\\src\\output.txt";
        FileInputStream fis = new FileInputStream(path1);
        FileOutputStream fos = new FileOutputStream(path2);
int temp;
        while((temp=fis.read())!=-1)
        {
            fos.write(temp);
            System.out.println(temp);
        }
    }
}
