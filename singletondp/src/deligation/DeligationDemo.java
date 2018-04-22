package deligation;

public class DeligationDemo {

	public static void main(String[] args) {
		//bootstrap is ultimate class loader
		System.out.println(DeligationDemo.class.getClassLoader().getParent());
	}
}
