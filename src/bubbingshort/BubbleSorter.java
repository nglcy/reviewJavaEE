//import java.util.Comparator;
//
///**
// * @author chenyuan
// * @version V1.0
// * @Title: BubbleSorter
// * @Description: (用一句话描述该文件做什么)
// * @date 2018/8/29 23:07
// */
//public class BubbleSorter implements Sorter {
//
//    @Override
//    public <T extends Comparable<T>> void sort(T[] arr) {
//        boolean swapped = true;
//        for (int i = 1, len = arr.length; i < len && swapped; i++) {
//
//            swapped = false;
//            for (int j = 0; j < len - i; j++) {
//                if (arr[j].compareTo(arr[j + 1]) > 0) {
//                    T temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j+1] = temp;
//                    swapped=true;
//
//                }
//            }
//        }
//
//    }
//
//    @Override
//    public <T> void sort(T[] arr, Comparator<T> comp) {
//        boolean swapped = true;
//        for (int i = 1,len = arr.length; i < len && swapped; i++) {
//            swapped = false;
//            for (int j = 0; j < len-1; j++) {
//                if (comp.compare(arr[j],arr[j+1])>0){
//                    T temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j+1] = temp;
//                    swapped= true;
//                }
//            }
//        }
//
//    }
//
//}
