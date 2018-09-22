import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
    * @Title: MyHashMap  
    * @Description: (用一句话描述该文件做什么)  
    * @author chenyuan 
    * @date  2018/9/15 15:28 
    * @version V1.0    
    */
public class MyHashMap2 {

    public static void main(String[] args) {
        Stu s = new Stu();
        s.setId(1);
        s.setUsername("123");
        s.setAge(1);

        Stu ss = new Stu();
        ss.setId(1);
        ss.setUsername("123");
        ss.setAge(1);

        HashMap<Stu,Integer> hashMap = new HashMap<>();

        hashMap.put(s,1);
        hashMap.put(ss,2);

        Set<Map.Entry<Stu, Integer>> set = hashMap.entrySet();
        for (Map.Entry entry : set    ) {
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

    }
}
