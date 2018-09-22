/**
    * @Title: HelloWordDemo  
    * @Description: (用一句话描述该文件做什么)  
    * @author chenyuan 
    * @date  2018/9/8 16:31 
    * @version V1.0    
    */
public class HelloWordDemo {

    //成员变量
    private  Object obj = new Object();

    private int ss=0;

    //局部变量
    public void methodOne(int i){

        int  j = 1;
        int sum= i+j;
        Object acb = obj;
        long start =System.currentTimeMillis();
        methodTwo();
        return ;
        //正常

    }
    public void methodTwo(){
        //File file = new File("");
    }
    public static  void  main(String[] a){

        System.out.println("mhao ");
    }

}
