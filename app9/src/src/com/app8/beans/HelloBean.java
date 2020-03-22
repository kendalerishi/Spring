package src.com.app8.beans;

public class HelloBean {
//	private HelloBean() {
//		System.out.println("Bean instantiation thru constructor.");
//	}

	public static HelloBean getInstance() {
		System.out.println("Bean instantiation thru static factory method");
		return new HelloBean();
	}
	
	public String sayHello() {
		return "Hello user";
	}
}
