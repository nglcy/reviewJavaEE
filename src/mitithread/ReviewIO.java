import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
    * @Title: ReviewIO  
    * @Description: (用一句话描述该文件做什么)  
    * @author chenyuan 
    * @date  2018/9/16 10:44 
    * @version V1.0    
    */
public class ReviewIO {
    public static void main(String[] args) throws FileNotFoundException {

//        - 如何取得年月日、小时分钟秒？
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
//        - 如何取得从 1970 年 1 月 1 日 0 时 0 分 0 秒到现在的毫秒数？

        calendar.set(1970,1,1,0,0,0);
        long time = calendar.getTimeInMillis();
        System.out.println(time);
        long nowTime = System.currentTimeMillis();

        System.out.println(nowTime-time);

        System.out.println(nowTime);

        System.out.println(new Date().getTime());


//        - 如何取得某月的最后一天？
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.MONTH,1);
        int i = calendar1.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(i);
//        - 如何格式化日期？
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(newFormatter));
    }
}
