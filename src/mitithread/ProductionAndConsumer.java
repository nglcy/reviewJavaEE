import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
    * @Title: ProductionAndCosnm  
    * @Description: 使用阻塞队列实现生产者-消费者
    * @author chenyuan 
    * @date  2018/9/15 21:06 
    * @version V1.0    
    */
public class ProductionAndConsumer {


    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> list = new ArrayBlockingQueue<>(10);
        Procude procude = new Procude(list);
        Consumer consumer = new Consumer(list);
        procude.start();
        consumer.start();
    }
    static  class  Procude extends Thread{
        private  final BlockingQueue<Integer> list ;

          Procude(BlockingQueue<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            while(true){
                try {
                    // 获取并移除此队列的头部，在元素变得可用之前一直等待（如果有必要）。
                    Integer take = list.take();
                    System.out.println("消费数据："+take);
                    //Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    static class Consumer extends Thread{

        private  final BlockingQueue<Integer> list;

        Consumer(BlockingQueue<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            while (true) {
                int  i = new Random().nextInt(100);
                try {
                   //; 将指定元素插入此队列中，将等待可用的空间（如果有必要）。
                    list.put(i);
                    System.out.println("生产数据："+i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
