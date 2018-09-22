import java.io.File;

/**
 * @author chenyuan
 * @version V1.0
 * @Title: FloderName
 * @Description: (用一句话描述该文件做什么)
 * @date 2018/9/18 8:30
 */
public class FloderName {

    public static void main(String[] args) {
        getFloderName("C:\\Users\\chenyuan\\Desktop\\工具");
    }

    public static void getFloderName(String targetName) {

        if (targetName != null && !targetName.isEmpty()) {
            File file = new File(targetName);
            for (String strname: file.list()
                 ) {
                System.out.println(strname);
            }
        }

    }


}
