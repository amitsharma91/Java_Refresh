public class TypeCastingInReferencedSpecialization {

	public static void main(String[] args) {
		B b = (B) new A();// Specialization using Object
		// here 0% data is accessible
		b.show();// Exception(Runtime Error) ClassCastException
		b.print();// Exception(Runtime Error) ClassCastException
	}
}