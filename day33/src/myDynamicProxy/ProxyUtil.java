package myDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    //获取代理对象
    public static Star creativeProxy(BigStar bigStar){
        Star star = (Star)Proxy.newProxyInstance(
                //用于指定用哪个类加载器
                ProxyUtil.class.getClassLoader(),
                //指定接口,这些接口用于指定生成的代理长什么样子,也就是有哪些方法
                new Class[]{Star.class},
                //指定生成的代理对象要干什么事情
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /**
                         * 1,代理的对象
                         * 2,要运行的方法
                         * 3,传递的实参
                         */
                        if ("sing".equals(method.getName())){
                            System.out.println("准备话筒,收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地,收钱");
                        }

                        return method.invoke(bigStar,args);
                    }
                }

        );
        return star;

    }
}
