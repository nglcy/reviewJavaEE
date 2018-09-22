import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author chenyuan
 * @version V1.0
 * @Title: RelectUtil
 * @Description: (用一句话描述该文件做什么)
 * @date 2018/8/28 21:52
 */
public class RelectUtil {
    private RelectUtil() {
    }

    /**
     * @param target
     * @param fieldName
     * @return
     */
    public static Object getValue(Object target, String fieldName) {

        //获取字节码对象
        Class<?> clazz = target.getClass();
        String[] fs = fieldName.split("\\.");

        try {
            //最后一个是class,没必要生成.所以-1
            /*for (int i = 0; i < fs.length-1; i++) {
				Field field = clazz.getDeclaredField(fs[i]);
				field.setAccessible(true);
				target=field.get(target);
				clazz = target.getClass();
			}*/
            Field field = clazz.getDeclaredField(fs[fs.length - 1]);
            field.setAccessible(true);
            return field.get(target);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @Title: setValue
     * @Description: 通过反射给对象的指定字段赋值
     * @param @param target
     * @param @param fieldName
     * @param @param value    参数
     * @return void    返回类型
     * @throws
     */
    public static void setValue(Object target,String fieldName,Object value) {
        Class<? extends Object> clazz = target.getClass();
        String[] fs = fieldName.split("\\.");

        try {
            //最后一个为class
            for (int i = 0; i < fs.length-1; i++) {
//                获取类对象所表的类或者对象所有已声明的字段
                Field field = clazz.getDeclaredField(fs[i]);
                field.setAccessible(true);

                Object val = field.get(target);
                if(val==null) {
                    Constructor<?> constructor = field.getType().getDeclaredConstructor();
                    constructor.setAccessible(true);
                    val = constructor.newInstance();
                    field.set(target, val);
                }
                target=val;
                clazz= target.getClass();
            }
            Field field = clazz.getDeclaredField(fs[fs.length-1]);
            field.setAccessible(true);
            field.set(target, value);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
