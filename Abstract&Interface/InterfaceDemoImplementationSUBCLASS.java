public class InterfaceDemoImplementationSUBCLASS extends
		InterfaceDemoImplementation {

	public void show() {
		System.out.println("This is Show method implemetation");
	}

	public static void main(String[] args) {
		interfaceDemo obj = new InterfaceDemoImplementationSUBCLASS();// Generalization
		obj.display();
		obj.show();
		// obj.mymethod();// ERROR ---- only 50% data is access
		System.out.println("X: " + obj.X);
		System.out.println("x : " + interfaceDemo.X);
	}
}
