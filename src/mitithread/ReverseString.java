/**
    * @Title: A  
    * @Description: (用一句话描述该文件做什么)  
    * @author chenyuan 
    * @date  2018/9/16 10:57 
    * @version V1.0    
    */
public final  class ReverseString {

    public static void main(String[] args) {

        String s = "123";
        String reverse = reverse(s);
        System.out.println(reverse);
    }

    /**
     * 实现字符串的反转
     */
    public static  String reverse(String string){
        if(string==null||string.length()<=1){
            return string;
        }

        return reverse(string.substring(1))+string.charAt(0);
    }

}
