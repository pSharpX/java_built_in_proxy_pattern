package pe.cibertec.edu.java_built_in_proxy_pattern_git;

public class RealSubject implements Subject {

	public void doSomething() {
		System.out.println("inside method realsubject.doSomething()");
	}

	public void doSomethingElse() {
		System.out.println("inside method realsubject.doSomethingElse()");
	}
}
