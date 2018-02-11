package pe.cibertec.edu.java_built_in_proxy_pattern_git;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SimpleInvocationHandler implements InvocationHandler {
	private Object realSubject;
	
	public SimpleInvocationHandler(Object realSubject) {
		super();
		this.realSubject = realSubject;
	}

	public Object invoke(Object obj, Method m, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		System.out.println("------------------------------------");
		System.out.println("Before calling " + m.getName());
		try {
			result = m.invoke(this.realSubject, args);
			System.out.println("After calling " + m.getName());
			System.out.println("------------------------------------");
		} catch (Exception e) {
			System.exit(1);
		}
		return result;
	}

}
