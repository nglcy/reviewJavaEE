import java.util.concurrent.*;

/**
 * @author chenyuan
 * @version V1.0
 * @Title: CallableDemo
 * @Description: (用一句话描述该文件做什么)
 * @date 2018/9/17 22:12
 */
public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //可以执行Runable对象或者Callable对象代表的线程
        Future<Integer> submit = pool.submit(new MyCallable(100));
        Future<Integer> submit1 = pool.submit(new MyCallable(200));

        Future<Integer> submit2 = pool.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i <= 100; i++) {
                    sum += i;
                }
                return sum;
            }
        });


        System.out.println(submit.get());
        System.out.println(submit1.get());
        System.out.println(submit2.get());
        //结束
        pool.shutdown();

    }
}



