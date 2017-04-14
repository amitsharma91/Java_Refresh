public abstract class InterfaceDemoImplementation implements interfaceDemo {
	public void mymethod() {
		System.out.println("This is my method");
	}

	public void display() {
		System.out.println("This is Display Method implementation Body...");
	}

	/*public static void main(String[] args) {
		interfaceDemo obj = new InterfaceDemoImplementation();// Generalization
		obj.display();
		// obj.mymethod();// ERROR ---- only 50% data is access
		System.out.println("X: " + obj.X);
		System.out.println("x : " + interfaceDemo.X);
	}*/
}