/**
 * @author chenyuan
 * @version V1.0
 * @Title: VolatileTest
 * @Description: (用一句话描述该文件做什么)
 * @date 2018/9/15 22:37
 */
public class VolatileTest {

    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final VolatileTest test = new VolatileTest();
        for (int i = 0; i < 10; i++) {
            new Thread() {
                public void run() {
                    for (int j = 0; j < 10; j++)
                        test.increase();
                }
            }.start();
        }
        while (Thread.activeCount() > 1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test.inc);
    }

}
