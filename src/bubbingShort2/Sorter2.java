import java.util.Comparator;

/**
 * @author chenyuan
 * @version V1.0
 * @Title: Sorter
 * @Description: 封装冒泡排序的一个工具类
 * @date 2018/9/20 11:32
 */
public interface Sorter2 {

    public abstract <T extends Comparable<T>> void sort(T[] list);

    public abstract <T> void sort(T[] list, Comparator<T> comparator);
}
