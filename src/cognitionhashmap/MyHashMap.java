import java.util.*;
import java.util.stream.DoubleStream;

/**
    * @Title: MyHashMap  
    * @Description: 识别hashmap源码
    * @author chenyuan 
    * @date  2018/9/2 19:44 
    * @version V1.0    
    */
public class MyHashMap {

    public static void main(String[] args){

        HashMap<String,String> map = new  HashMap<>();
        map.put("123","11");
        map.get("123");
        String jsonString = "{\"name\":\"user\",\"age\":12}";
        //language=JSON
        String s= "{\"name\":\"admin\",\"age\":\"123\"}";
      //  HashMap<Integer,String> map= new HashMap<>();

        Random random = new Random();
        DoubleStream doubles = random.doubles();




    }
    
    
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ,len =nums.length;i<len;i++){
            int temp = target-nums[i];
            for(int j =0 ,lens=nums.length;j<lens-1;j++){
                if(temp==nums[j]){
                    set.add(i);
                    set.add(j);
                }
            }
        }
        int [] arr = new int[set.size()];
        for (int i = 0; i < set.size(); i++) {
            for (int j :
                    set) {
                arr[i] = j;
                i++;
            }
        }
        return arr;

    }
}
