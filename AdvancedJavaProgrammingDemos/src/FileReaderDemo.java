import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\jains\\OneDrive\\Desktop\\javaSelenium\\AdvancedJavaProgrammingDemos\\src\\input.txt";
        String path2 = "C:\\Users\\jains\\OneDrive\\Desktop\\javaSelenium\\AdvancedJavaProgrammingDemos\\src\\output.txt";
        FileReader fr = new FileReader(path1);
        FileWriter fw = new FileWriter(path2);
        int temp;
        while((temp=fr.read())!=-1)
        {
            fw.write(temp);
        }
        fw.flush();
    }
}
