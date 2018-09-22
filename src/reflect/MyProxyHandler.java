import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
    * @Title: MyProxy  
    * @Description: (用一句话描述该文件做什么)  
    * @author chenyuan 
    * @date  2018/9/10 22:55 
    * @version V1.0    
    */

public class MyProxyHandler implements InvocationHandler {

    private Object target;


    public MyProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("家长辅导家庭作业。。。。");
        Object invoke = method.invoke(target, args);
        System.out.println("老师按时检查。。。。");
        return invoke;
    }

    public  Object  findProxy(){

        Object instance = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return instance;
    }

}
