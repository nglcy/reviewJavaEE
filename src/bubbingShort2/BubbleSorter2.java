import java.util.Comparator;

/**
 * @author chenyuan
 * @version V1.0
 * @Title: BubbleSorter
 * @Description: 冒泡排序的实现类
 * @date 2018/9/20 11:39
 */
public class BubbleSorter2 implements Sorter2 {
    @Override
    public <T extends Comparable<T>> void sort(T[] list) {
        //是指标志符
        boolean swapped = true;

        for (int i = 1, len = list.length; i < len && swapped; i++) {
            //进行排序，不让其他方法调用次方法
            swapped = false;
            for (int j = 0; j < len - i; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    @Override
    public <T> void sort(T[] list, Comparator<T> comparator) {

        boolean swapped = true;
        for (int i = 1, len = list.length; i < len && swapped; i++) {

            swapped = false;
            for (int j = 0; j < len - i; j++) {

                if (comparator.compare(list[j],list[j+1])>0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
