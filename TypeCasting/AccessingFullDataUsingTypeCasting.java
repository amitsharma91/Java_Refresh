public class AccessingFullDataUsingTypeCasting {
	public static void main(String[] args) {
		A a = new B();// Generalization using Object
		B b = (B) a;// Specialization using Reference

		// 100% data is Accessible
		b.show();// executes
		b.print();// executes
	}
}



//Object Class ************
//Cloning *****************