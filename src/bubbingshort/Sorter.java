import java.util.Comparator;

/**
 * 排序器接口(策略模式:将算法封装到具有公共接口的独立类中)
    * @Title: Short  
    * @Description: 冒泡排序的高逼格程序
    * @author chenyuan 
    * @date  2018/8/29 8:51 
    * @version V1.0    
    */
public interface Sorter {
    /**
     * 排序
     * @param  arr 需要排序的数组
     */
    public  <T extends  Comparable<T>> void sort(T[] arr);

    /**
     *
     * @param arr 排序的数组
     * @param comp  比较两元素的比较器
     * @param <T>   元素类型
     */
    public <T> void sort(T[] arr ,Comparator<T> comp);
}
