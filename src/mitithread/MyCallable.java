import java.util.concurrent.Callable;

/**
 * @author chenyuan
 * @version V1.0
 * @Title: MyCallable
 * @Description: (用一句话描述该文件做什么)
 * @date 2018/9/17 22:12
 */
//这里的指定的泛型其实是call()方法返回值类型
public class MyCallable implements Callable<Integer> {
    private int number;

    public MyCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
