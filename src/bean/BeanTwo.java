package bean;

public class BeanTwo implements TestInterface{
	public BeanTwo() {
		System.out.println("Test1 ... constructor is invoked ");
	
	}
	
	public void check() {
		
		System.out.println("Check this is TEST 1");
	}

	public void send(String ms) {
		System.out.println("MSG IS FROM TEST1 "+ " "+ ms);
	}
}
