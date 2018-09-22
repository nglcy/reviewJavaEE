/**
 * @author chenyuan
 * @version V1.0
 * @Title: InitTest
 * @Description: (用一句话描述该文件做什么)
 * @date 2018/9/13 22:48
 */
public class InitTest {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println("count1=" + singleTon.count1);//1
       System.out.println("count2=" + singleTon.count2);//0
       // System.out.println(Child.a);
    }

}

class SingleTon {
    private static SingleTon singleTon = new SingleTon();
    public static int count1;
    public static int count2 = 10;
    private SingleTon() {
        count1++;
        count2++;
    }
    public static SingleTon getInstance() {
        return singleTon;
    }
}

class Father {
    public static int a = 1;
    static {
        System.out.println(a);
        a = 2;
    }
}
class Child extends Father {

    public static int b = a;

}