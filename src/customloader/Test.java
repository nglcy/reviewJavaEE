/**
 * @author chenyuan
 * @version V1.0
 * @Title: Test
 * @Description: (用一句话描述该文件做什么)
 * @date 2018/9/9 11:22
 */
public class Test {

    public static void main(String[] args) {
        /*ClassLoader loader = Test.class.getClassLoader();


        while (loader != null) {
            System.out.println(loader);
            loader = loader.getParent();
        }*/

     Father1 father1 = new Father1();
        System.out.println("---------"+father1.a);
        System.out.println("-------------"+father1.b);


    }


}

class Father1 {

    public  int a;
    public int b = 3;


     {
        a++;
        b++;
    }

}


