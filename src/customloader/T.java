import java.io.*;

/**
    * @Title: T  
    * @Description: (用一句话描述该文件做什么)  
    * @author chenyuan 
    * @date  2018/9/15 10:40 
    * @version V1.0    
    */

public class T {

    private int i;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("InitTest");

        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        Reader r = new FileReader(file);

        BufferedReader b = new BufferedReader(new FileReader(file));



    }
}
