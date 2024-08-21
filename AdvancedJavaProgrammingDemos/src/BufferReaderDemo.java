import java.io.*;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException
    {
        String path1 = "C:\\Users\\jains\\OneDrive\\Desktop\\javaSelenium\\AdvancedJavaProgrammingDemos\\src\\input.txt";
        String path2 = "C:\\Users\\jains\\OneDrive\\Desktop\\javaSelenium\\AdvancedJavaProgrammingDemos\\src\\output.txt";
        FileReader fr = new FileReader(path1);
        FileWriter fw = new FileWriter(path2);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        int temp;
        while((temp=br.read())!=-1)
        {
            bw.write(temp);
        }
        bw.flush();
    }

}
