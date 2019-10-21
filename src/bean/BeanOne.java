package bean;

public class BeanOne implements TestInterface{
	
	public BeanOne() {
		System.out.println("Test ... constructor is invoked");
	
	}
	
	public void check() {
		
		System.out.println("Test Interface");
	}
	
	public void send(String ms) {
		System.out.println("MSG IS FROM TEST "+ " "+ ms);
	}

}
