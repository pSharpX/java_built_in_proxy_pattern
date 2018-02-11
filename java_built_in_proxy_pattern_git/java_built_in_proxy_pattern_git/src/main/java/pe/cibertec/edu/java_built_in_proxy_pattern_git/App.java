package pe.cibertec.edu.java_built_in_proxy_pattern_git;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Subject realSubject = new RealSubject();
        Subject proxy = (Subject) Proxy.newProxyInstance(
        		realSubject.getClass().getClassLoader(),
        		realSubject.getClass().getInterfaces(),
        		new SimpleInvocationHandler(realSubject)
        );
        passMeAProxy(proxy);
    }
    
    public static void passMeAProxy(Subject subject){
    	subject.doSomething();
    	subject.doSomethingElse();
    };
}
