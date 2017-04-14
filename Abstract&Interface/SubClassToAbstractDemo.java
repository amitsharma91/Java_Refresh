public class SubClassToAbstractDemo extends AbstractDemo {
	// overriding Abstract method
	void display() {
		System.out.println("This is Dislpay Method...");
	}

	public static void main(String[] args) {
		// creating object of Sub-class
		SubClassToAbstractDemo obj = new SubClassToAbstractDemo();
		obj.display();
		obj.callMe();

		// Creating Reference of Abstract Class
		AbstractDemo ref = new SubClassToAbstractDemo();// generalization
		ref.display();

		// creating object of Abstract CLass
		// AbstractDemo o = new AbstractDemo(); // ERROR
	}
}